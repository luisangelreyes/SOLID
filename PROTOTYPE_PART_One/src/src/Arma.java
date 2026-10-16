public class Arma {
    private String nombre;
    private int dano;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public Arma(String nombre, int dano){
        this.nombre = nombre;
        this.dano = dano;
    }

    @Override
    public String toString() {
        return nombre + "(" + dano + ")";
    }
    
    
}
