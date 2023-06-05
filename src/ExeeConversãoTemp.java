import java.util.Random;
import java.util.Scanner;

public class ExeeConversãoTemp {
    public static void main(String[] args) {
        String programaTemperatura = """
                Neste programa iremos converter os valores de Celsius em Far;
                esse programa é muito importante para os conhecimentos em
                programação, feito por 
                Pedro Henrique de Almeida Santos 
                """;
       /* System.out.println(programaTemperatura);
        double  celsius = 21.7;
        double conversao=   (celsius * 1.8 ) +32;
        System.out.println(conversao);
        int conversao2=   (int) (celsius * 1.8 ) +32;
        System.out.println(conversao2);
        boolean incluidoNoPlano= true;
        double notaDoFilme = 8.1;

        */
        String exercicioAdivinhação = "Neste Programa iremos desenvolver um jogo de Advinhação com laços";
        System.out.println(exercicioAdivinhação);
        Scanner Leitura = new Scanner(System.in);
        int numero = new Random().nextInt(100);
        int tentativas = 0;
        int numeroUser;
        for ( tentativas =0; tentativas < 5 ; tentativas++){
            System.out.println("Tente advinhar o número :");
            numeroUser = Leitura.nextInt();
            if(numeroUser > numero){
                System.out.println("O número que você digitou é maior que o gerado");
            }
            if (numeroUser == numero) {
                System.out.println("Parabéns você acertou o número ");

            }
            if(numeroUser!=numero) {
                System.out.println("Você errou o número");

            }


        }
    }

}

