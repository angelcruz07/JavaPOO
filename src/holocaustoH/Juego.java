package holocaustoH;

public class Juego {
    public static void pintarHabitacion(Habitacion habitacion){
        for(int fil = 0; fil < Habitacion.ALTO; fil++ ){
            for(int col = 0; col < Habitacion.ANCHO; col++){
                if(col == 0 || col == Habitacion.ANCHO - 1) System.out.print("║"); //Columna
                else if(fil == 0 || fil == Habitacion.ALTO - 1) System.out.print("═"); // Fila
                else System.out.print(" "); //Mapa


                if(col == Habitacion.ANCHO - 1) System.out.println();

            }
        }
    }
}
