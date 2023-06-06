import java.util.Scanner;

public class DesafioFinal {
    public static void main(String[] args) {
        System.out.println("Bem vindo ao Banco Pe");
        Scanner leitor = new Scanner(System.in);
        int conta = 2500;
        System.out.println("Digite seu nome abaixo :");
        String nomeUser = leitor.nextLine();
        System.out.println("Menu da conta de " + nomeUser);
        if(nomeUser.equalsIgnoreCase("Pedro")){
            System.out.println(  "User : " + nomeUser+ "\n" + "SALDO :" + conta + "\n"
                     + "TIPO DE CONTA : CORRENTE "
            );
            System.out.println(" OPÇÕES DA CONTA, digite um número para atividade desejada : " +  "\n" + "1 - Consulta saldo " + "\n" + "2 - Deposito"
            + "\n" + "3- Realizar transfêrencia "+"\n"+"4 - Encerrar atividade ");
            int açao = leitor.nextInt();
            if ( açao == 1){
                System.out.println(" O SALDO DA CONTA É :"+ conta);
            }
            if( açao== 3){
                int transf = leitor.nextInt();
                if ( conta >= transf){
                    conta -= transf;
                    System.out.println("A TRANSAÇÃO FOI REALIZADA SEU SALDO É :"+ conta);
                }
                if ( conta < transf){
                    System.out.println("A  transferencia não foi possivel ");
                }
            }
            if ( açao == 2 ){
                int deposito = leitor.nextInt();
                conta += deposito;
                System.out.println(" O seu novo saldo com esse deposito é :" + conta);

            }
            if (açao== 4){
                System.out.println(" A atividade será incerrada, tem certeza : ");
                String certeza = leitor.nextLine();
                if (certeza.equalsIgnoreCase("sim")){
                    System.out.println("Atividade encerrada ");
                }
                else {
                    System.out.println("Atividade continua, digite seu nome : ");
                    nomeUser = leitor.nextLine();


                }
            }

        }
    }
}
