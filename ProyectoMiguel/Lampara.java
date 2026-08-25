public class Lampara implements ActivablePorRedstone {
    @override
    public void activar() {
        System.out.println("Lampara se activa, la lampara está encendida");
    }
    @override
    public void desactivar() {
        System.out.println("Lampara se desactiva, La lampara se apaga");
    }
}