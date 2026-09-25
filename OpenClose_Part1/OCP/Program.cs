using System;
using OCP.Nucleo;
using OCP.Alien;
using OCP.Extenciones;
using OCP.Fabrica;

Console.OutputEncoding = System.Text.Encoding.UTF8;

var gestor = new GestorDeAliens();

// Registro de Aliens para cumplir con el Principio de Abierto/Cerrado (OCP)
gestor.RegistrarAlien("Fuego", () => new Fuego(), true);
gestor.RegistrarAlien("Humungosaurio", () => new Humungosaurio(), true);
gestor.RegistrarAlien("Cuatro Brazos", () => new CuatroBrazos(), true);

gestor.RegistrarSupremo(typeof(Humungosaurio), () => new HumungosaurioSupremo());

gestor.RegistrarFusion("Humungosaurio + Cuatrobrazos", () => new Fusion<Humungosaurio, CuatroBrazos>());
gestor.RegistrarFusion("Fuego + Cuatrobrazos", () => new Fusion<Fuego, CuatroBrazos>());
gestor.RegistrarFusion("Humungosaurio + Fuego", () => new Fusion<Humungosaurio, Fuego>());

var omnitrix = new Omnitrix();

Console.WriteLine("   OMNITRIX ACTIVADO");

bool salir = false;
while (!salir)
{
    salir = omnitrix.EstaTransformado
        ? MostrarMenuTransformado(omnitrix, gestor)
        : MostrarMenuPrincipal(omnitrix, gestor);
}

Console.WriteLine("\nOmnitrix desactivado. ¡Hasta la próxima!");

// ---------------------- Menús (solo interacción por consola) ----------------------

static bool MostrarMenuPrincipal(Omnitrix omnitrix, GestorDeAliens gestor)
{
    Console.WriteLine("\n--- Menú principal ---");
    Console.WriteLine("1. Transformacion");
    Console.WriteLine("2. Transformacion aleatoria");
    Console.WriteLine("3. Fusion");
    Console.WriteLine("4. Escanear ADN ");
    Console.WriteLine("0. Salir");
    Console.Write("Elige una opción: ");
    var opcion = Console.ReadLine();

    switch (opcion)
    {
        case "1": ElegirYTransformar(omnitrix, gestor); break;
        case "2":
            var aleatorio = gestor.ElegirAlienAleatorio();
            if (aleatorio != null)
                omnitrix.Transformar(aleatorio);
            else
                Console.WriteLine("No hay aliens disponibles.");
            break;
        case "3": ElegirYFusionar(omnitrix, gestor); break;
        case "4": EscanearDesdeMuestra(gestor); break;
        case "0": return true;
        default: Console.WriteLine("Opción no válida."); break;
    }
    return false;
}

static bool MostrarMenuTransformado(Omnitrix omnitrix, GestorDeAliens gestor)
{
    var alien = omnitrix.AlienActual!;
    Console.WriteLine($"\n--- Transformado en: {alien.Nombre} ---");
    Console.WriteLine($"({alien.Descripcion})\n");
    Console.WriteLine("1. Usar habilidad");
    if (gestor.TieneSupremo(alien))
        Console.WriteLine("2. Evolucionar a forma Suprema");
    Console.WriteLine("3. Usar Skurd");
    Console.WriteLine("4. Destransformarse");
    Console.Write("Elige una opción: ");
    var opcion = Console.ReadLine();

    switch (opcion)
    {
        case "1":
            alien.UsarHabilidad();
            break;
        case "2":
            if (gestor.TieneSupremo(alien))
                omnitrix.Transformar(gestor.CrearSupremo(alien));
            else
                Console.WriteLine("Este alien no tiene forma Suprema todavía.");
            break;
        case "3":
            UsarSkurd(omnitrix, gestor);
            break;
        case "4":
            omnitrix.Destransformar(alien);
            break;
        default:
            Console.WriteLine("Opción no válida.");
            break;
    }
    return false;
}


static void ElegirYTransformar(Omnitrix omnitrix, GestorDeAliens gestor)
{
    var disponibles = gestor.ObtenerDesbloqueados();
    if (disponibles.Count == 0)
    {
        Console.WriteLine("No hay aliens desbloqueados todavía.");
        return;
    }
    Console.WriteLine("\nAliens disponibles:");
    for (int i = 0; i < disponibles.Count; i++)
        Console.WriteLine($"{i + 1}. {disponibles[i].Nombre}");
    Console.Write("¿En cuál te transformas? ");
    if (int.TryParse(Console.ReadLine(), out int indice) && indice >= 1 && indice <= disponibles.Count)
        omnitrix.Transformar(disponibles[indice - 1].Crear());
    else
        Console.WriteLine("Selección no válida.");
}

static void ElegirYFusionar(Omnitrix omnitrix, GestorDeAliens gestor)
{
    var recetas = gestor.ObtenerFusion();
    Console.WriteLine("\nFusiones disponibles:");
    for (int i = 0; i < recetas.Count; i++)
        Console.WriteLine($"{i + 1}. {recetas[i].Nombre}");
    Console.Write("¿Qué fusión activas? ");
    if (int.TryParse(Console.ReadLine(), out int indice) && indice >= 1 && indice <= recetas.Count)
        omnitrix.Transformar(recetas[indice - 1].Crear());
    else
        Console.WriteLine("Selección no válida.");
}

static void EscanearDesdeMuestra(GestorDeAliens gestor)
{
    Console.Write("\nNombre del nuevo alien: ");
    var nombre = Console.ReadLine();
    nombre = string.IsNullOrWhiteSpace(nombre) ? "Alien sin nombre" : nombre;

    Console.Write("Describe su habilidad (una frase): ");
    var habilidad = Console.ReadLine();
    habilidad = string.IsNullOrWhiteSpace(habilidad) ? "hace algo misterioso." : habilidad;

    Console.Write("Describe brevemente al alien: ");
    var descripcion = Console.ReadLine();
    descripcion = string.IsNullOrWhiteSpace(descripcion) ? "Alien creado a partir de una muestra de ADN escaneada en vivo." : descripcion;

    var muestra = new MuestraADN(nombre, descripcion, habilidad);
    gestor.RegistrarADN(muestra);
    Console.WriteLine($"\n¡ADN escaneado desde terminal! \"{nombre}\" ya está disponible para transformarte.");
}

static void UsarSkurd(Omnitrix omnitrix, GestorDeAliens gestor)
{
    var disponibles = gestor.ObtenerDesbloqueados();
    Console.WriteLine("\n¿De qué alien quieres pedir prestada una habilidad?");
    for (int i = 0; i < disponibles.Count; i++)
        Console.WriteLine($"{i + 1}. {disponibles[i].Nombre}");
    Console.Write("Elige: ");
    if (int.TryParse(Console.ReadLine(), out int indice) && (indice >= 1 && indice <= disponibles.Count))
    {
        var donante = disponibles[indice - 1].Crear();
        omnitrix.Transformar(new Skurd(omnitrix.AlienActual!, donante));
    }
    else
    {
        Console.WriteLine("Selección no válida.");
    }
}