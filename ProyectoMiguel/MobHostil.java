public abstract class MobHostil {
    private String nombre;
    private int salud;

    public MobHostil(String nombre, int salud) {
        this.nombre = nombre;
        this.salud = salud;
    }

    public void quemarLava() {
        this.salud -= 5;
        System.out.println(nombre + "se está quemando en la lava. Salud restante: " + salud);
    }

    abstract public void atacar();
}
