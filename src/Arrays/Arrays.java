package Arrays;
import java.util.Scanner;


public class Arrays {
    public static void main(String[] args){
        // Definición de arreglos
        String names[] = {"Angel", "Alejandro", "Paco", "Nate", ""};
        System.out.println(names[0]);

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un nombre: ");
        String name = sc.nextLine();

        // Agregando el nombre a los Arrays
        names[names.length -1] = name;

        //Recorrer los elementos de un array
        for(int i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }
    }
}
