class Mago : Personaje, IHabilidadEspecial
{
    public Mago(string nombre) : base(nombre)
    {

    }

    public override void Ataque(Personaje objetivo)
    {
        System.Console.WriteLine($"{Nombre} lanzó una bola de fuego a {objetivo.Nombre}");
        objetivo.RecibirDano(15);
    }

    public void UsarHabilidadEspecial()
    {
        PuntosVida += 30;
        if (PuntosVida > 100) PuntosVida = 100;
        System.Console.WriteLine($"{Nombre} regeneró 30 puntos de vida, su vida actual es {PuntosVida}");


    }
}