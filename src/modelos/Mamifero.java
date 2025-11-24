package modelos;

public abstract class Mamifero extends Animal {
    private String tipoPelaje;
    
    public Mamifero(String nombre, int edad, double peso, String tipoPelaje) {
        super(nombre, edad, peso);
        this.tipoPelaje = tipoPelaje;
    }
    
    public String getTipoPelaje() { return tipoPelaje; }
    
    public void amamantar() {
        System.out.println(getNombre() + " está amamantando a sus crías.");
    }
}