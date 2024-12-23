package SoyRunner;
import java.util.Scanner;

public class Runner {

    public static int mostrarMenu(boolean error){
        Scanner sc = new Scanner(System.in);
        if(error)System.out.println("Introduce unicamente un valor entre 0 y 3");
        System.out.println("********** Mostrar Menu **********");
        System.out.println("[0] Finalizar");
        System.out.println("[1] Nuevo dato");
        System.out.println("[2] Mostrar datos");
        System.out.println("[3] Borrar ultimo dato");
        System.out.println("------------------------------------");
        System.out.println("TU OPCION 0,1,2,3, =>");
        int respuesta = sc.nextInt();
        while(respuesta < 0 || respuesta > 3) respuesta = mostrarMenu(true);
        return respuesta;
    }

    public static void nuevoRegistro(float tiempos[], int ultimoRegistro, float distancias[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el tiempo  mis.seg");
        float tiempo = sc.nextFloat();



        System.out.println("Introduce la distancia kil.metr");
        float distancia = sc.nextFloat();

        distancias[ultimoRegistro] = distancia;
        tiempos[ultimoRegistro] = tiempo;
    }
    public static void mostrarDatos(float tiempos[], float distancia[], int ultimoRegistro){
        for (int t = 0; t < ultimoRegistro; t++){
                System.out.println("Tiempo: " + (t + 1) + ": " + tiempos[t] + " Distancia: " + distancia[t] + " km" );
        }
    }

    public static int removerRegistro(int ultimoRegistro, float tiempos[], float distacias[]) {
        if (ultimoRegistro <= 0) System.out.println("No hay datos que eliminar");


        tiempos[ultimoRegistro -1] = 0;
        distacias[ultimoRegistro - 1] = 0;
        System.out.println("Dato eliminado con exito");

        return ultimoRegistro - 1;
    }

    public static void main(String[]  args){
        int ultimoRegistro = 0;
        int request = -1;
        float tiempos[] = new float[10];
        float distancias[] = new float[10];
        String etiquetas[] = new String[10];


        request = mostrarMenu(false);

        while(request != 0){
            switch(request){
                case 1:
                    nuevoRegistro(tiempos, ultimoRegistro, distancias);
                    ultimoRegistro++;
                break;
                case 2:
                    mostrarDatos(tiempos, distancias, ultimoRegistro);
                    break;
                case 3:
                    ultimoRegistro = removerRegistro(ultimoRegistro, distancias, tiempos);
                    break;

                default:
                    System.out.println("Opcion no valida");
            }
            request = mostrarMenu(false);
        }
    }
}
