package modelos;

public abstract class Reptil extends Animal {
    private boolean esPonzoñoso;
    
    public Reptil(String nombre, int edad, double peso, boolean esPonzoñoso) {
        super(nombre, edad, peso);
        this.esPonzoñoso = esPonzoñoso;
    }
    
    public boolean isEsPonzoñoso() { return esPonzoñoso; }
    
    public void regularTemperatura() {
        System.out.println(getNombre() + " está tomando el sol para regular su temperatura.");
    }
}