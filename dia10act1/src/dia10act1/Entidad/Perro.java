package dia10act1.Entidad;

public class Perro {
    
    private String nombre;
    private String raza;
    private int edad;
    private double tama;

    public Perro() {
    }

    public Perro(String nombre, String raza, int edad, double tama) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tama = tama;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getTama() {
        return tama;
    }

    public void setTama(double tama) {
        this.tama = tama;
    }
    
        
    public void infoperro(){
        
            System.out.println("Nombre: "+nombre);
            System.out.println("Raza: " + raza);
            System.out.println("Edad: " + edad);
            System.out.println("Tamaño: " + tama);
            
    }

    public boolean equalsIgnoreCase(String q) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
