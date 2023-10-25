package figuras;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author bauti
 */
public class Figuras {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        GestorFiguras gestor = new GestorFiguras();

        // Crear figuras aleatoriamente y agregarlas al gestor
        gestor.crearFigurasAleatoriamente(10);

        // Listar figuras en la colección sin orden específico
        System.out.println("----- Figuras en la colección (sin orden específico) -----");
        gestor.listarFigurasColeccionadas();

        // Listar figuras ordenadas por superficie y luego por ID
        System.out.println("----- Figuras ordenadas por superficie y luego por ID -----");
        gestor.listarFigurasOrdenadas();

        // Listar figuras ordenadas según su distancia al origen
        System.out.println("----- Figuras ordenadas según su distancia al origen -----");
        gestor.listarFigurasSegunDistanciaAlOrigen();
    }
    
}
