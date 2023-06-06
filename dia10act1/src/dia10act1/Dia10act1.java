package dia10act1;

import dia10act1.Entidad.Perro;
import dia10act1.Entidad.Persona;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Dia10act1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList<Perro> per = new ArrayList<>();
        
        Perro p1 = new Perro("a","a",1,1);
        Perro p2 = new Perro("b","b",2,2);
        Perro p3 = new Perro("c","c",3,3);
        
        per.add(p1);
        per.add(p2);
        per.add(p3);
        
        Persona per1 = new Persona("d","d",4,4);
        Persona per2 = new Persona("e","e",5,5);
        Persona per3 = new Persona("f","f",6,6);
        
        System.out.println("Informacion de los perros disponibles");
        p1.infoperro();
        System.out.println("---------------------");
        p2.infoperro();
        System.out.println("---------------------");
        p3.infoperro();
        
        System.out.println("");
        
        int a = 1;
        String r = "z";
        String q;
        boolean t;
        
        ArrayList person1 = new ArrayList();
        do{
            System.out.println("Hola, cliente n°"+a);
            System.out.println("¿que perro desea adoptar?");
            q = leer.next();
            
            Iterator<Perro> p = per.iterator();
            
            for (Object per4 : per) {
                while(p.hasNext()){
                    Perro dog = p.next();
                    if(dog.equalsIgnoreCase(q)){
                        person1.add(dog);
                        p.remove();
                        a = a + 1;
                        t = true;
                        break;
                    }
                }
            }
            
                if(t = false){
                    System.out.println("el perro ya fue adoptado");
                }
            
            System.out.println("¿Desea adoptar a otro perro?(si/no)");
            r = leer.next();
            
        }while(r.equalsIgnoreCase("no"));
        
        ArrayList person2 = new ArrayList();
        do{
            System.out.println("Hola, cliente n°"+a);
            System.out.println("¿que perro desea adoptar?");
            q = leer.next();
            
            Iterator<Perro> p = per.iterator();
            
            for (Object per4 : per) {
                while(p.hasNext()){
                    Perro dog = p.next();
                    if(dog.equalsIgnoreCase(q)){
                        person2.add(dog);
                        p.remove();
                        a = a + 1;
                        t = true;
                        break;
                    }
                }
            }
            
                if(t = false){
                    System.out.println("el perro ya fue adoptado");
                }
            
            System.out.println("¿Desea adoptar a otro perro?(si/no)");
            r = leer.next();
            
        }while(r.equalsIgnoreCase("no"));
        
        ArrayList person3 = new ArrayList();
        do{
            System.out.println("Hola, cliente n°"+a);
            System.out.println("¿que perro desea adoptar?");
            q = leer.next();
            
            Iterator<Perro> p = per.iterator();
            
            for (Object per4 : per) {
                while(p.hasNext()){
                    Perro dog = p.next();
                    if(dog.equalsIgnoreCase(q)){
                        person3.add(dog);
                        p.remove();
                        a = a + 1;
                        t = true;
                        break;
                    }  
                }
            }
            
                if(t = false){
                    System.out.println("el perro ya fue adoptado");
                }
            
            System.out.println("¿Desea adoptar a otro perro?(si/no)");
            r = leer.next();
            
        }while(r.equalsIgnoreCase("no"));
          
}}
