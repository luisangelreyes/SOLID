
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = -1;

        while(opcion !=0){
            System.out.println("\n1.Bosque Oscuro");
            System.out.println("\n2.Castillo Embrujado");
            System.out.println("\n3.Volvan Infernal");
            System.out.println("\nElige tu destino.");
            opcion = sc.nextInt();

            Nivel nivel = null;

            switch (opcion) {
                case 1:
                    nivel = new NivelBosque();
                    break;
                case 2:
                    nivel = new NivelCastillo();
                    break;
                case 3:
                    nivel = new NivelVolcan();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Que mala elección");
                break;
            }
            if(nivel != null){
                nivel.jugar();
            }
        }sc.close();
    }
}
