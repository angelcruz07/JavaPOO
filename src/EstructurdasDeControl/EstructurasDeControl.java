package EstructurdasDeControl;

public class EstructurasDeControl {
    public static void main(String[] args) {
        int age = 13;

        // Estructura de control
        if(age >= 18) {
            System.out.println("Es mayor de edad");
        } else if ( age > 18){
            System.out.println("Tienen mas de 16 años");
        }else {
            System.out.println("Tiene menos de 16 años");
        }

        // Estructura de repetición
        for(int i = 1; i <= 10; i++){
            System.out.println(i);
        }
    }
}
