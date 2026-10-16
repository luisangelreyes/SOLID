public class Esqueleto extends Enemigo {
    public Esqueleto(){
        super("Esqueleto", 150, 75);
    }
    public void atacar(){
        System.out.println("El esqueleto te pega con su espada y te quita "+ this.ataque + " de vida");
    }

}
