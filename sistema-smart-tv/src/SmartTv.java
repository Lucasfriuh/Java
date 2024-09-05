public class SmartTv {
    private boolean ligada = false;
    private int canal = 1;
    private int volume = 25;
    private final int VOLUME_MAXIMO = 100;
    private final int VOLUME_MINIMO = 0;
    private final int CANAL_MAXIMO = 100;
    private final int CANAL_MINIMO = 1;

    public void mudarCanal(int novoCanal) {
        if (novoCanal >= CANAL_MINIMO && novoCanal <= CANAL_MAXIMO) {
            canal = novoCanal;
            System.out.println("Canal mudado para: " + canal);
        } else {
            System.out.println("Canal inválido.");
        }
    }

    public void aumentarCanal() {
        if (canal < CANAL_MAXIMO) {
            canal++;
        } else {
            System.out.println("Já está no canal máximo.");
        }
        System.out.println("Canal atual: " + canal);
    }

    public void diminuirCanal() {
        if (canal > CANAL_MINIMO) {
            canal--;
        } else {
            System.out.println("Já está no canal mínimo.");
        }
        System.out.println("Canal atual: " + canal);
    }

    public void aumentarVolume() {
        if (volume < VOLUME_MAXIMO) {
            volume++;
            System.out.println("Aumentando o volume para: " + volume);
        } else {
            System.out.println("Volume já está no máximo.");
        }
    }

    public void diminuirVolume() {
        if (volume > VOLUME_MINIMO) {
            volume--;
            System.out.println("Diminuindo o volume para: " + volume);
        } else {
            System.out.println("Volume já está no mínimo.");
        }
    }

    public void ligar() {
        if (!ligada) {
            ligada = true;
            System.out.println("TV ligada.");
        } else {
            System.out.println("A TV já está ligada.");
        }
    }

    public void desligar() {
        if (ligada) {
            ligada = false;
            System.out.println("TV desligada.");
        } else {
            System.out.println("A TV já está desligada.");
        }
    }

    // Getters para acessar o estado atual
    public int getCanal() {
        return canal;
    }

    public int getVolume() {
        return volume;
    }

    public boolean isLigada() {
        return ligada;
    }
}
