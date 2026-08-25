abstract class Personaje
{
    public string Nombre { get; private set; }
    public int PuntosVida { get; protected set; }

    public bool EstadoVida { get { return PuntosVida > 0; } }

    public Personaje(string Nombre)
    {
        Nombre = Nombre;
        PuntosVida = 100;
    }

    public void RecibirDano(int Cantidad)
    {
        PuntosVida -= Cantidad;
        if (PuntosVida < 0) PuntosVida = 0;
        System.Console.WriteLine($"{Nombre} Recibio un daño de {Cantidad}, sus puntos de vida es: {PuntosVida}");

    }

    public abstract void Ataque(Personaje Objetivo);

}