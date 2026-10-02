public class ProfeJirafales implements Educador, Habitante {
    private String nombre = "Profesor Jirafales";
    
    @Override
    public void pasarLista() {
        System.out.println("No vino quien?");
    }

    @Override
    public void impartirClase() {
        System.out.println("Alguien me puede decir tres pronombres?, haber tu godinez");
    }

    @Override 
    public void hacerCorajes() {
        System.out.println("TA TA TA TA TA TAAA, MI APELLIDO ES JIRAFALLES");
    }

    @Override
    public void interactuarConElChavo() {
        System.out.println("Chavo, tu me puedes decir que comen los leones?");
    }
}
    

