import java.util.ArrayList;

public class Ejemplo {
    public static void main(String[] args) {
        // Crear un ArrayList para almacenar nombres de ciudades
        ArrayList<String> ciudades = new ArrayList<>();

        // Agregar elementos al ArrayList
        ciudades.add("Nueva York");
        ciudades.add("París");
        ciudades.add("Tokio");

        // Obtener el número de elementos en el ArrayList
        int cantidadCiudades = ciudades.size();
        System.out.println("Cantidad de ciudades: " + cantidadCiudades);

        // Obtener una ciudad por su índice
        String ciudad = ciudades.get(1);
        System.out.println("Segunda ciudad en la lista: " + ciudad);

        // Verificar si el ArrayList contiene un elemento específico
        boolean contieneElemento = ciudades.contains("Londres");
        System.out.println("El ArrayList contiene la ciudad de Londres: " + contieneElemento);

        // Iterar sobre los elementos del ArrayList
        for (String nombreCiudad : ciudades) {
            System.out.println("Ciudad: " + nombreCiudad);
        }
    }
}
