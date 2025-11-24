package modelos;

public class Cocodrilo extends Reptil {
    private int fuerzaMordida;
    
    public Cocodrilo(String nombre, int edad, double peso, int fuerzaMordida) {
        super(nombre, edad, peso, false);
        this.fuerzaMordida = fuerzaMordida;
    }
    
    @Override
    public void emitirSonido() {
        System.out.println(getNombre() + " hace: ¡GRRRRR!");
    }
    
    @Override
    public void moverse() {
        System.out.println(getNombre() + " se desliza por el agua silenciosamente.");
    }
    
    @Override
    public void alimentarse() {
        System.out.println(getNombre() + " atrapa peces con su poderosa mordida de " + fuerzaMordida + " PSI.");
    }
    
    public void nadar() {
        System.out.println(getNombre() + " nada usando su cola como propulsor.");
    }
}