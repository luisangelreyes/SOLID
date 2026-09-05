package PolimorfismoParte1;

public class Caja {
    public void cobrar(MetodoPago metodo, double monto) {
        if (metodo.validar()) {
            metodo.pagar(monto);
        } else {
            System.out.println("Los datos del pago no son validados");
        }
    }
}
