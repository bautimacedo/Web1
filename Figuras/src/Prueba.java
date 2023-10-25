

import figuras.*;

public class Prueba {
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
