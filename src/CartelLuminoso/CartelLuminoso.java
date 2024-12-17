package CartelLuminoso;

public class CartelLuminoso {
    public static void main(String[]  args){
        int heigh = 7;
        int width = 5;

        for(int row = 1; row <= heigh; row++){
            for(int col = 1; col <= width; col++) {
                if((col == 1) && (row != 7)){
                    System.out.print("*");
                }else if(row == 7){
                    System.out.print("* ");
                }
            }
        System.out.println();
        }
    }
}
