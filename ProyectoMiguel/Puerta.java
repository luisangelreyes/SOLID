public class Puerta implements ActivablePorRedstone {
    @override
    public void activar() {
        System.out.println("Puerta se activa y se abre");
    }
    @override
    public void desactivar(){
        System.out.println("Puerta se desactiva y se cierra");
    }
}