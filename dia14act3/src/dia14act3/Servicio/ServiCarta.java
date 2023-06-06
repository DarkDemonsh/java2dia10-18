package dia14act3.Servicio;

import dia14act3.Entidad.Carta;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ServiCarta {
    
   Carta c = new Carta();
   List<Carta> cartas;
   List<Carta> cartasMonton;
   Random r = new Random();
    
   public Carta init(){
       cartas = new ArrayList<>();
       cartasMonton = new ArrayList<>();
       return c;
   }
    
   public void inicializarBaraja() {
        
        String[] palos = {"espadas", "bastos", "oros", "copas"};
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 10, 11, 12};
        
        for (String palo : palos) {
            for (int numero : numeros) {
                Carta carta = new Carta(palo, numero);                
                cartas.add(carta);   
            }
        }
   }
    
   public void Barajar(String[] carta){    
    for(int i = 0; i < carta.length; i++){
        int ia = r.nextInt(carta.length);
        Carta t = cartas.get(i);
        cartas.set(i, cartas.get(ia));
        cartas.set(ia, t);
    }
    
       System.out.println("las cartas fueron barajadas");
       System.out.println("este es el resultado: "+cartas);
    
   }
   
   public Carta SigCarta(){
    int indice = 0;   
        if (indice < cartas.size()) {
            Carta carta = cartas.get(indice);
            indice++;
            return carta;
        } else {
            return null;
        }       
       
   }
   
   public int disponible(){
       
       return cartas.size();
   }
   
   public List<Carta> dar(int numCartas){
       
        if (numCartas <= cartas.size()) {
            for (int i = 0; i < numCartas; i++) {
                Carta carta = cartas.remove(0);
                cartasMonton.add(carta);  
            }
            return cartasMonton;
        } else {
            System.out.println("No hay suficientes cartas para repartir.");
            return null;
        }
    }
   
   public void monton(){
        if (cartasMonton.isEmpty()) {
            System.out.println("No ha salido ninguna carta.");
        } else {
            System.out.println("Cartas en el montón:");
            for (Carta carta : cartasMonton) {
                System.out.println(carta);
            }
        }
    }
   
   public void mostrar(){      
       System.out.println("cartas en la baraja"); 
           System.out.println(cartas);          
    }
   
   
}
