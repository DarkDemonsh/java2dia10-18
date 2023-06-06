package dia12act2.Servicio;

import dia12act2.Entidad.RDA;
import java.util.Random;

public class ServiRDA {
    
    RDA rda = new RDA();
    Random random = new Random();
    
    public RDA init(){
        return rda;
    }
    
    public void llenar(RDA rda){
        
        rda.setPosact(random.nextInt(10));
        
        rda.setPosagu(random.nextInt(10));
        
    }
    
    public boolean mojar(RDA rda){
        
        if(rda.getPosact() == rda.getPosagu()){
            
        }
        
        return false;        
    }
    
    public void sig(RDA rda){
        
       int z = rda.getPosact();
       
       z = z + 1;
       
       rda.setPosact(z);
        
    }
    
    public void info(RDA rda){
        
        System.out.println("la posicion acutal del revolver es: "+rda.getPosact());
        System.out.println("la posicion actual del agua es: "+rda.getPosagu());
        
    }
    
}
