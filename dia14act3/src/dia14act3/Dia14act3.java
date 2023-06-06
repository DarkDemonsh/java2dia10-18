package dia14act3;

import dia14act3.Entidad.Carta;
import dia14act3.Servicio.ServiCarta;
import java.util.Scanner;

public class Dia14act3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n;
        ServiCarta sc = new ServiCarta();
        Carta c = sc.init();

sc.inicializarBaraja();
do{       
        System.out.println("Eliga una opcion");
        System.out.println("-------------------------------------------");
        System.out.println("1-barajar las cartas");
        System.out.println("2-dar la siguiente carta");
        System.out.println("3-mostrar cartas disponibles");
        System.out.println("4-dar cartas");
        System.out.println("5-mostrar las cartas que se hayan eliminado");
        System.out.println("6-mostrar todas las cartas");
        System.out.println("7-salir");
        System.out.println("--------------------------------------------");
        
        System.out.println("");
        System.out.print("Ingrese una opcion: ");        
        n = leer.nextInt();
        System.out.println("");
        
        switch(n){
            case 1: sc.Barajar(args);
                System.out.println("");
                break;
            case 2: System.out.println(sc.SigCarta());
                System.out.println("");
                break;
            case 3: System.out.println(sc.disponible());
                System.out.println("");
                break;
            case 4: 
                System.out.print("¿Cuantas cartas quieres dar? ");
                int c4 = leer.nextInt();
                System.out.println("");
                System.out.println(sc.dar(c4));
                System.out.println("");
                break;
            case 5: sc.monton();
                System.out.println("");
                break;
            case 6: sc.mostrar();
                System.out.println("");
                break;
            case 7: System.out.println("Adios");
                System.out.println("");
                 break;        
            }
        }while(n < 7);
        
    }
    
}
