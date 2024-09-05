public class Operadores {
    public static void main(String[] args) {
     
     String nome1 = "lucas";
     String nome2 = new String ("lucas");

     System.out.println(nome1.equals(nome2));
     
        int numero1 = 1;
     int numero2 = 2;

     boolean simNao = numero1 == numero2;

     if (numero1 < numero2) {
        System.out.println("a nossa condição é verdadeira");
     }
     System.out.println("numero1 é iagual ao numero2? " + simNao);
     
     simNao = numero1 != numero2;
     System.out.println("numero1 é iagual ao numero2? " + simNao);
     
     simNao = numero1 >numero2;
     System.out.println("numero1 é iagual ao numero2? " + simNao);
     
     simNao = numero1 < numero2;
     System.out.println("numero1 é iagual ao numero2? " + simNao);
    }
}
