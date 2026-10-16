public class Tripulacion implements Prototipo {
    private String piloto;
    private String codigo;

    public Tripulacion (String piloto, String codigo){
    this.piloto = piloto;
    this.codigo = codigo;
}

    public String getPiloto() {
        return piloto;
    }
    public void setPiloto(String piloto) {
        this.piloto = piloto;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    @Override 
    public Tripulacion clonar(){
        return new Tripulacion(piloto, codigo);
    }

    @Override 
    public String toString(){
        return piloto + "("+ codigo + ")";
    }
    
}
