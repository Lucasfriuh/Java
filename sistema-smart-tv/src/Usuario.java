public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();
        
        smartTv.desligar();
        System.out.println("Novo Status -> Tv ligada?" + SmartTv.ligada);
        smartTv.ligar();
        System.out.println("Novo Status -> Tv ligada?" + SmartTv.ligada);
        System.out.println("Tv ligada?" + SmartTv.ligada);
        
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume atual: " +SmartTv.volume);


        System.out.println("Canal atual: " + SmartTv.canal);
        smartTv.mudarCanal(13);
        System.out.println("Canal atual: " + SmartTv.canal);




        
    }
}
