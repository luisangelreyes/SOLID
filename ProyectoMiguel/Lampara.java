public class Lampara implements ActivablePorRedstone {
    @Override
    public void activar() {
        System.out.println("Lampara se activa, la lampara está encendida");
    }

    @Override
    public void desactivar() {
        System.out.println("Lampara se desactiva, La lampara se apaga");
    }
}