package DoctorHouse;
import java.util.Scanner;

public class DoctorHouse {

    public static void departmentOrthopedics(String name) {
        System.out.println(name + " valla al departamento de traumatologia");
    }

    public static void departmentCardiovascular(String name){
        System.out.println(name + " valla al departamento de cardiovascular");
    }

    public static String question(String p){
        Scanner sc = new Scanner(System.in);
        System.out.println(p);
        String response = sc.nextLine();
        return response.toUpperCase();
    }

    public static void  triaje(String name){
        String response;
        response = question(name + " ha tenido alguna caida ultimamente [S/N]");

        while(!response.equals("S") && !response.equals("N") ){
            System.out.println("Me esta haciendo perder el tiempo");
            response = question(name + " ha tenido alguna caida ultimamente [S/N]");
        }

        if(response.equals("S")){
            departmentOrthopedics(name);
        }else if(response.equals("N")){
            response = question(name + " Le ha dolido el pecho [S/N]");

            while(!response.equals("S") && !response.equals("N") ){
                System.out.println("Se lo preguntare una vez mas");
                response = question(name + " le ha dolido el pecho [S/N]");
                }
            if (response.equals("S")){
                departmentCardiovascular(name);
            }else if(response.equals("N")){
                System.out.println(name + " usted no tiene nada vallase.");
            }
        }

    }

    public static void main(String[] args) {
        triaje("Angel");
    }
}
