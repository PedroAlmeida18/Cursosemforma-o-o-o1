import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner (System.in);
        double Mediavaliaçao =0;
        double nota=0 ;
        // Laço de repetição em for
        for (int i = 0; i < 3; i++) {
            System.out.println("Qual a sua avaliação sobre o filme ?");
            nota = leitura.nextDouble();
            Mediavaliaçao += nota;
            System.out.println( "O somário das notas atuais é:"+ Mediavaliaçao);

        }System.out.println("Média das notas:"+ Mediavaliaçao/3.0);
    }
}
