package dia12act2;

import dia12act2.Entidad.Jugador;
import dia12act2.Entidad.RDA;
import dia12act2.Servicio.Juego;
import dia12act2.Servicio.ServiJugador;
import dia12act2.Servicio.ServiRDA;
import java.util.ArrayList;

public class Dia12act2 {

    public static void main(String[] args) {
        ServiJugador sj = new ServiJugador();
        ServiRDA sr = new ServiRDA();
        Jugador j = sj.init();
        RDA r = sr.init();
        Juego g = new Juego();
        ArrayList<Jugador> ju = null;
        
        g.llenar(ju, r);
        g.llenar(ju, r);
        
        
    }
    
}
