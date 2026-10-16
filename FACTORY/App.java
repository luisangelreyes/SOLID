
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

            if(opcion >= 1 && opcion <=3){
                Nivel nivel = new Nivel(opcion);
                nivel.jugar();
            }else if (opcion != 0){
                System.out.println("OPcion invalida");
            }
        }sc.close();
    }
}
