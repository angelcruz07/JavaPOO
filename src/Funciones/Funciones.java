package Funciones;

public class Funciones {
    // Función precio total

    public static float precioTotal(float precioUnidad, int unidades){
        float total;
         total = precioUnidad * unidades;
        System.out.println("Calculo de precio total de un producto: " + total);
        return total;
    }
    public static void main(String[] args) {
        precioTotal(13.4f, 6);
    }
}
