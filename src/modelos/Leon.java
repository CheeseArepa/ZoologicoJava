package modelos;

public class Leon extends Mamifero {
    private int tamañoMelena;
    
    public Leon(String nombre, int edad, double peso, int tamañoMelena) {
        super(nombre, edad, peso, "Corto y dorado");
        this.tamañoMelena = tamañoMelena;
    }
    
    @Override
    public void emitirSonido() {
        System.out.println(getNombre() + " hace: ¡ROARRR!");
    }
    
    @Override
    public void moverse() {
        System.out.println(getNombre() + " camina majestuosamente por la sabana.");
    }
    
    @Override
    public void alimentarse() {
        System.out.println(getNombre() + " está devorando carne.");
    }
    
    public void rugir() {
        System.out.println(getNombre() + " emite un rugido intimidante con melena tamaño " + tamañoMelena);
    }
}
