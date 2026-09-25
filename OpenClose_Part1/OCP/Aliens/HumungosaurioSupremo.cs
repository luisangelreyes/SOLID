namespace OCP.Alien;

public class HumungosaurioSupremo : Humungosaurio
{
    public override string Nombre => "Humungosaurio Supremo";
    
    public override void UsarHabilidad()
    {
        base.UsarHabilidad();
        System.Console.WriteLine($"{Nombre} Hace cosas");
    }
}