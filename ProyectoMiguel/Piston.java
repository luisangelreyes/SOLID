public class Piston implements ActivablePorRedstone {
    @override
    public void activar() {
        System.out.println("Piston se activa, piston de extiende");
    }
    @override
    public void desactivar() {
        System.out.println("Piston se desactiva, piston se retrae");
    }
}