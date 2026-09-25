
import java.util.stream.Stream;

public enum  Etiqueta {
    
    SIN_IVA("(LIBRE de impuestos)"),
    CON_IVA("(IVA incluido)"),
    CON_IEPS("(IVA + IEPS incluidos)");
    
    private final String descripcion;

    Etiqueta(String descripcion){
        this.descripcion = descripcion;
    }

    public String getPrecioBase(){
        return ; 
    }
    
    public String getDescripcion(){
        return precioBase; 
    }
}
