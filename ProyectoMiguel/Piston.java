public class Piston implements ActivablePorRedstone {
    @Override
    public void activar() {
        System.out.println("Piston se activa, piston de extiende");
    }

    @Override
    public void desactivar() {
        System.out.println("Piston se desactiva, piston se retrae");
    }
}