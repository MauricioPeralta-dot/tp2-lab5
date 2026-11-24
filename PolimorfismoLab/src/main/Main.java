package main; 
 
import modelo.Animal; 
import modelo.Perro; 
import modelo.Gato; 
 import modelo.Figura;
import modelo.Circulo;
import modelo.Rectangulo;

public class Main { 
    public static void main(String[] args) { 
        Animal miAnimal = new Animal(); 
        Animal miPerro = new Perro(); 
        Animal miGato = new Gato(); 
 
        miAnimal.hacerSonido();
        miPerro.hacerSonido();  
        miGato.hacerSonido();   
    
        Figura[] figuras = {
            new Circulo(5),
            new Rectangulo(4, 6),
            new Circulo(3),
            new Rectangulo(8, 2)
        };

        for (Figura figura : figuras) {
            System.out.println("Área: " + figura.calcularArea());
    } 
}
}