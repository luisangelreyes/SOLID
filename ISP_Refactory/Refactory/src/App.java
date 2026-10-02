import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        Ñoño ñoño = new Ñoño();
        DonRamon donRamon = new DonRamon();
        ProfeJirafales jirafales = new ProfeJirafales();
        
        //Interfaz para el Maistro Loganiza
        List<Educador> educadores = List.of(jirafales);
        for (Educador e : educadores){
            e.impartirClase();
            e.pasarLista();
            e.hacerCorajes();
        }

        //interfaz para Ron Damon
        List <Inquilino> inquilinos = List.of(donRamon);
        for(Inquilino i: inquilinos){
            i.pagarRenta();
        }

        //interfaz para Habitantes
        List <Habitante> habitantes = List.of(donRamon,jirafales);
        for (Habitante h : habitantes) {
            h.interactuarConElChavo();
        }

        //interfaz para niño
        List <Niño> niños = List.of(ñoño);
        for (Niño n :niños ) {

            
            n.llorar();
            n.cantar();

            
        }
    }
}
