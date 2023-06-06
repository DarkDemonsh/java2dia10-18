package dia10act1.Entidad;

public class Persona {
    
    private String nombre;
    private String apellido;
    private int edad;
    private double dni;
    
    private Perro perro;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int edad, double dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getDni() {
        return dni;
    }

    public void setDni(double dni) {
        this.dni = dni;
    }

    public void pedro(Perro perro){
        this.perro = perro;
    }
    
    public void info(){
        
        System.out.println("informacion de la persona");
        System.out.println("nombre: "+nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Edad: " + edad);
        System.out.println("Documento: " + dni);
        
        if(perro != null){
            System.out.println("");
            System.out.println("Informacion del perro");
            System.out.println("Nombre: "+perro.getNombre());
            System.out.println("Raza: " + perro.getRaza());
            System.out.println("Edad: " + perro.getEdad());
            System.out.println("Tamaño: " + perro.getTama());
        }else{
            System.out.println("la persona en cuestion no tiene perro");
        }

    }   
}
