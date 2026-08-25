public class Lampara implements ActivablePorRedstone {
    @override
    public void activar() {
        System.out.println("Bloque musical activa, produce un sonido");
    }
    @override
    public void desactivar() {
        System.out.println("Bloque musical se desactiva, produce un sonido");
    }
}