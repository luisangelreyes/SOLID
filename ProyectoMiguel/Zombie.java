public class zombie extends MobHostil{
    public Zombie() {
        super("Zombie",20);
    }
    @override
    void atacar(){
        System.out.println("Zombie te ataca con sus puños");
    }
}