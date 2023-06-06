package dia12act2.Servicio;

import dia12act2.Entidad.Jugador;
import dia12act2.Entidad.RDA;

public class ServiJugador {
    
    Jugador j = new Jugador();
    ServiRDA sr = new ServiRDA();
    RDA r = sr.init();
    
    public Jugador init(){
        return j;
    }
    
    public boolean disparo(RDA rda){
      
        if(sr.mojar(rda) == true){
           j.setMojado(true);
       }else{
            sr.sig(rda);
        } 
        
        return false;   
    }
    
}
