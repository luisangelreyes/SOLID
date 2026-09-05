public class Zombie extends MobHostil {
    public Zombie() {
        super("Zombie", 20);
    }

    @Override
    public void atacar() {
        System.out.println("Zombie te ataca con sus puños");
    }
}