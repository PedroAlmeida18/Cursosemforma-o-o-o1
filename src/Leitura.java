import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner (System.in);
        System.out.println("Qual é o seu filme favorito ?");
        String filme = leitura.nextLine();
        System.out.println(filme);
        System.out.println("Qual o ano de lançamento ?");
        int anodeLançamento = leitura.nextInt();
        System.out.println("Qual a sua avaliação sobre o filme ?");
        double va = leitura.nextDouble();
        System.out.println(filme);
        System.out.println(anodeLançamento);
        System.out.println(va);
        leitura.close();


        }

    }


