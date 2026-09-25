public class App {
    public static void main(String[] args) throws Exception {
        Bebida[] bebidas = {
            new Agua("CIEL 1L",12),
            new Refresco("COCA-COLA 600 ml",23),
            new Cerveza("Coronita",30)
        };

        Caja caja = new Caja();
        caja.cobrar(bebidas, new DescuentoNavidad(), 100);
    }
}
