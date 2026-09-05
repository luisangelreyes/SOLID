Guerrero g1 = new Guerrero("Po");
Mago m1 = new Mago("Tai Long");

System.Console.WriteLine("Duelo");
System.Console.WriteLine($"{m1.nombre} vs {g1.nombre}");

while (m1.EstadoVida && g1.EstadoVida)
{
    System.Console.WriteLine("1.Guerrero Ataca a mago");
    System.Console.WriteLine("2.Mago ataca a Gerrero");
    System.Console.WriteLine("3.Mago usa habilidad");
    System.Console.WriteLine("Toma opcion");

    string? opcion = Console.ReadLine();
    switch (opcion)
    {
        case "1":
            g1.Ataque(m1);
            break;
        case "2":
            m1.Ataque(g1);
            break;
        case "3":
            m1.UsarHabilidadEspecial();
            break;
        default:
            System.Console.WriteLine("Opcion no valida");
            break;
    }
    if (!m1.EstadoVida)
    {
        System.Console.WriteLine("Gana el guerrero");
    }
    else if (!g1.EstadoVida)
    {
        System.Console.WriteLine("Gana el mago");
    }
}