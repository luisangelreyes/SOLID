class Mago : Personaje
{
    public Mago(string nombre) : base(nombre)
    {

    }

    public override void Ataque(Personaje objetivo)
    {
        System.Console.WriteLine($"{nombre} lanzó una bola de fuego a {objetivo.Nombre}");
        objetivo.RecibirDano(15);
    }
}