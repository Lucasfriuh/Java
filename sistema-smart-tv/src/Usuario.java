public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();
        
        smartTv.ligar();
        System.out.println("TV ligada? " + smartTv.isLigada());
        
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        System.out.println("Volume atual: " + smartTv.getVolume());
        
        smartTv.mudarCanal(13);
        System.out.println("Canal atual: " + smartTv.getCanal());
    }
}
