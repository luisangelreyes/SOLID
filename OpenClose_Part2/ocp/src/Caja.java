public class Caja {
    public double calcularPrecio(String tipoBebida, double monto) {
        if (tipoBebida.equals("agua")) {
            return monto + 0.5;
        } else if (tipoBebida.equals("refresco")) {
            return monto + 1.0;
        } else {
            return monto;
        }
    }
}