package modelos;

public class Iguana extends Reptil {
    private String colorEscamas;
    
    public Iguana(String nombre, int edad, double peso, String colorEscamas) {
        super(nombre, edad, peso, false);
        this.colorEscamas = colorEscamas;
    }
    
    @Override
    public void emitirSonido() {
        System.out.println(getNombre() + " hace: *silbido suave*");
    }
    
    @Override
    public void moverse() {
        System.out.println(getNombre() + " trepa por las ramas con agilidad.");
    }
    
    @Override
    public void alimentarse() {
        System.out.println(getNombre() + " come hojas verdes y frutas.");
    }
    
    public void cambiarColor() {
        System.out.println(getNombre() + " cambia el tono de sus escamas " + colorEscamas + " según su estado de ánimo.");
    }
}