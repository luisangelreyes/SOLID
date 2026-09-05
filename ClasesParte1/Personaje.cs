abstract class Personaje
{
    public string nombre { get; private set; }
    public int PuntosVida { get; protected set; }

    public bool EstadoVida { get { return PuntosVida > 0; } }

    public Personaje(string nombre)
    {
        this.nombre = nombre;
        PuntosVida = 100;
    }

    public void RecibirDano(int cantidad)
    {
        PuntosVida -= cantidad;
        if (PuntosVida < 0) PuntosVida = 0;
        System.Console.WriteLine($"{nombre} Recibio un daño de {cantidad}, sus puntos de vida es: {PuntosVida}");

    }

    public abstract void Ataque(Personaje Objetivo);

}