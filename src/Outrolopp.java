import java.util.Scanner;

public class Outrolopp {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double Mediavaliaçao = 0;
        double nota = 0;
        int totalNotas = 0;
        // laço de repetição em while ;
        while (nota!=-1) {
            System.out.println("Qual a sua avaliação sobre o filme ? Digite -1 para encerrar a avaliação");
            nota = leitura.nextDouble();
            if(nota!=-1){
                Mediavaliaçao += nota;
                totalNotas ++;
            }

        }
        System.out.println("Média das notas:"+ Mediavaliaçao/totalNotas);
    }
}
