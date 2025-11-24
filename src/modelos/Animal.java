package modelos;

public abstract class Animal {
    private String nombre;
    private int edad;
    private double peso;
    
    public Animal(String nombre, int edad, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }
    
    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }
    public double getPeso() { return peso; }
    
    public abstract void emitirSonido();
    public abstract void moverse();
    public abstract void alimentarse();
    
    public void mostrarInfo() {
        System.out.println("\n=== Información del Animal ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Peso: " + peso + " kg");
    }
}