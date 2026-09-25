public abstract class Bebida {
    protected static final double IVA = 0.16;
    private final String nombreBabida;
    private double precioBase;
    

    protected Bebida(String nombreBabida,double precioBase, String etiqueta){
        if(precioBase <= 0) throw new IllegalArgumentException("Precio invalido");
        this.nombreBabida = nombreBabida;
        this.etiqueta = etiqueta;
        this.precioBase = precioBase;
    }

    public abstract boolean requiereINE();
    public abstract double calcularTotal();

    public double getPrecioBase(){
        return precioBase;
    }

    public String getNombreBebida(){
        return nombreBabida;
    }
    public String getEtiqueta(){
        return nombreBabida + " " + etiqueta;
    }
}
