package PigElCerdo;
import java.util.Scanner;

public class PigElCerdo {
    // Variable global para entrada que algun metodo requiera
    public static Scanner sc = new Scanner(System.in);

    public static int menu(boolean error){
        System.out.println("╔════════════════════════════════╗");
        System.out.println("║          🐷 PigElCerdo         ║");
        System.out.println("╠════════════════════════════════╣");
        System.out.println("║  [0] Salir                     ║");
        System.out.println("║  [1] Jugar                     ║");
        System.out.println("╚════════════════════════════════╝");

        int response = sc.nextInt();
        sc.nextLine(); // Consumir salto de linea

        while(response < 0 || response > 2) {
            System.out.println("Opción invalida por favor ingrese valores entre 1 y 2");
            response = menu(true);
            sc.nextLine();
        }

        return response;
    }

    public static int throwDie(){
      int dieNumber = (int)(Math.random()* 5 + 1);
      System.out.println("Numero: " + dieNumber);
      return dieNumber;
    }

    public static boolean playerTurn(String playerName, int scores[]) {
        System.out.println("Turno de " + playerName);
        int turnScore = 0;

        while (true) {
            int roll = throwDie();

            if (roll == 1) {
                System.out.println("¡Sacaste un 1! Pierdes los puntos acumulados en este turno.");
                turnScore = 0;
                break;
            } else {
                turnScore += roll;
                System.out.println("Puntos en este lanzamiento: " + turnScore);
                System.out.println("Puntaje total potencial: " + (scores[0] + turnScore));
                System.out.print("¿Quieres seguir arriesgando? (S/N): ");
                String response = sc.nextLine();
                response.toUpperCase();

                if (!response.equalsIgnoreCase("S")) {
                    break;
                }
            }
        }
        scores[0] += turnScore;  // Acumular puntaje total
        return scores[0] >= 100; // Victoria

    }

    public static String getRandomIAName(){
        String names[] = {"Pigui", "Chanchito Feliz", "Porkinator", "BaconBot"};
        return names[(int) (Math.random() * names.length)];
    }

   public static boolean iaTurn(int[] scores, String iaName){
       System.out.println("Turno de " + iaName);
       int turnScore = 0;

       int roll = throwDie();

       while(true) {
           if (roll == 1) {
               System.out.println(iaName + " sacó un 1 y pierde los puntos acumulados en este turno.");
               turnScore = 0;
               break;
           } else {
               turnScore += roll;
               System.out.println("Puntos en este turno: " + turnScore);
               if (Math.random() < 0.5) {
                   System.out.println(iaName + " decide no arriesgar más en este turno.");
                   break;
               } else {
                   System.out.println(iaName + " decide arriesgar y tira nuevamente.");
               }
           }
       }
       scores[1] += turnScore;
       System.out.println("Puntaje total de "+ iaName + scores[1]);
       return scores[1] >= 100; // Retornar si gana
   }

    public static void startGame(String nameUser){
        //Variables del juego
        String iaName = getRandomIAName();
        int[] scores = {0, 0};
        boolean gameOver = false;

        System.out.println("╔════════════════════════════════════╗");
        System.out.println("*                                   *");
        System.out.println("*     ¡Bienvenido a Pig el Cerdo!   *");
        System.out.println("*                                   *");
        System.out.println("╚════════════════════════════════════╝");
        System.out.println("Preparando el juego para " + nameUser + "...");

        // Simulación de carga
        try {
            for (int i = 0; i <= 100; i += 20) {
                System.out.print("\rCargando: [" + "=".repeat(i / 20) + " ".repeat(5 - i / 20) + "] " + i + "%");
                Thread.sleep(500); // Simula una pausa para cargar
            }
        } catch (InterruptedException e) {
            System.out.println("\nError en la simulación de carga.");
        }
        System.out.println("\n¡Listo! ¡Que comience el juego!");

        System.out.println("Tu oponente es: " + iaName);

        while(!gameOver){
            gameOver = playerTurn(nameUser, scores);
            if(gameOver){
                System.out.println("¡Felicidades, " + nameUser + "! Has ganado con " + scores[0] + " puntos.");
                break;
            }
            gameOver = iaTurn(scores, iaName);

            if (gameOver) {
                System.out.println(iaName + " ha ganado con " + scores[1] + " puntos.");
            }

        }
    }

    public static void main(String[] args) {
        int response = menu(false);

        while (response != 0) {
            if (response == 1) {
                System.out.println("Ingrese un nickname");
                String nameUser = sc.nextLine();
                startGame(nameUser);
            } else {
                System.out.println("Opcion invalida. Intente nuevamente");
            }
            response = menu(false);
        }
        System.out.println("Pig El Cerdo finalizado");
    }
}