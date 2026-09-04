package ProyectoMateos;


public class App {
    public static void main(String[] args) {
        Caja caja = new Caja();

        MetodoPago tarjeta = new Tarjeta("1234567891023456");
        MetodoPago paypal = new PayPal("mateos26239@gmail.com");
        MetodoPago contado = new Contado(true);
        caja.cobrar(paypal, 500);
        caja.cobrar(tarjeta,300);
        caja.cobrar(contado, 500);
    }
}
