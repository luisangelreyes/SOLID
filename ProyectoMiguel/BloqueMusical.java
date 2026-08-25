public class BloqueMusical implements ActivablePorRedstone {

    @Override
    public void activar() {
        System.out.println("Bloque musical activa, produce un sonido");
    }

    @Override
    public void desactivar() {
        System.out.println("Bloque musical se desactiva, produce un sonido");
    }
}