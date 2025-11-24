package modelos;

public class Elefante extends Mamifero {
    private double longitudTrompa;
    
    public Elefante(String nombre, int edad, double peso, double longitudTrompa) {
        super(nombre, edad, peso, "Piel gruesa con pelos escasos");
        this.longitudTrompa = longitudTrompa;
    }
    
    @Override
    public void emitirSonido() {
        System.out.println(getNombre() + " hace: ¡PRRRUUUU!");
    }
    
    @Override
    public void moverse() {
        System.out.println(getNombre() + " camina pesadamente haciendo temblar el suelo.");
    }
    
    @Override
    public void alimentarse() {
        System.out.println(getNombre() + " come hojas y hierba usando su trompa.");
    }
    
    public void usarTrompa() {
        System.out.println(getNombre() + " usa su trompa de " + longitudTrompa + " metros para bañarse.");
    }
}