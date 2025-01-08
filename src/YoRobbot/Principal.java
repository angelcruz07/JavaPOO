package YoRobbot;

public class Principal {
    public static void main(String[] args)  {

        //Objeto
        Robbot robbot = new Robbot();
        Robbot paquito = new Robbot();

        robbot.setPeso(120.2f);
        System.out.println(robbot.getPeso());

        paquito.setPeso(120.2f);
        System.out.println(paquito.getPeso());
    }
}
