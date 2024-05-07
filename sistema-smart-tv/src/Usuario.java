public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("a TV está ligada? " + smartTv.ligada);
        System.out.println("qual o volume? " + smartTv.volume);
        System.out.println("qual o canal? " + smartTv.canal);

        smartTv.ligar();

        System.out.println("a TV está ligada? " + smartTv.ligada);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println("qual o volume? " + smartTv.volume);

        smartTv.mudarCanal(17);
        System.out.println("qual o canal? " + smartTv.canal);

    }
}
