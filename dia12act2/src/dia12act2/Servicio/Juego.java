package dia12act2.Servicio;

import dia12act2.Entidad.Jugador;
import dia12act2.Entidad.RDA;
import java.util.ArrayList;

public class Juego {
    
    ServiJugador sj = new ServiJugador();
    ServiRDA sr = new ServiRDA();
    Jugador j = sj.init();
    RDA r = sr.init();
    
    private ArrayList<Jugador> jugador;
    
    public void llenar(ArrayList<Jugador> jugador, RDA r){
        this.jugador = jugador;
        this.r = r;
    }
    
    public void ronda(){
        int ia = 0;
        
        while(!sj.disparo(r)){
         Jugador jugadorActual = jugador.get(ia);
            System.out.println("Jugador actual: " + jugadorActual.getNombre());

            sr.mojar(r);
            if (r.getPosagu() == r.getPosact()) {
                sj.disparo(r);
                System.out.println("¡El jugador " + jugadorActual.getNombre() + " se mojó!");
            } else {
                System.out.println("El jugador " + jugadorActual.getNombre() + " se salvó.");
                ia = (ia + 1) % jugador.size();
            }
        }}}
