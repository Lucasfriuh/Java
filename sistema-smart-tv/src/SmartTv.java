public class SmartTv {
    static boolean ligada = false;
    static int canal = 1;
    static int volume = 25;

    public void mudarCanal (int novoCanal){
        canal = novoCanal;

    }


    public void aumentarCanal(){
        canal ++;
        System.out.println("aumentando canal");
    }
    public void diminuirCanal(){
        canal --;
        System.out.println("diminuindo canal");
    }
    public void aumentarVolume(){
        volume ++;
        System.out.println("aumentando o volume para: " + volume);
    }

    public void diminuirVolume(){
        volume --;
        System.out.println("diminuindo o volume para: " + volume);
    }

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

}
