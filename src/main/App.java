package main;

import modelos.*;

public class App {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE GESTIÓN DEL ZOOLÓGICO ===\n");
        
        Animal[] animales = new Animal[4];
        
        animales[0] = new Leon("Simba", 5, 190.5, 8);
        animales[1] = new Elefante("Dumbo", 12, 5400.0, 2.5);
        animales[2] = new Cocodrilo("Gustavo", 8, 450.0, 3700);
        animales[3] = new Iguana("Jaimito", 3, 2.5, "Verde esmeralda");
        
        System.out.println(">>> RECORRIDO POR EL ZOOLÓGICO <<<\n");
        for (Animal animal : animales) {
            animal.mostrarInfo();
            animal.emitirSonido();
            animal.moverse();
            animal.alimentarse();
            
            if (animal instanceof Leon) {
                ((Leon) animal).rugir();
                ((Leon) animal).amamantar();
            } else if (animal instanceof Elefante) {
                ((Elefante) animal).usarTrompa();
            } else if (animal instanceof Cocodrilo) {
                ((Cocodrilo) animal).nadar();
                ((Cocodrilo) animal).regularTemperatura();
            } else if (animal instanceof Iguana) {
                ((Iguana) animal).cambiarColor();
                ((Iguana) animal).regularTemperatura();
            }
            
            System.out.println("--------------------------------");
        }
        
        System.out.println("\n=== FIN DEL RECORRIDO ===");
    }
}
