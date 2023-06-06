import java.util.Scanner;

public class DesafioFinal {
    public static void main(String[] args) {
        String nome = " PEDRO ";
        Scanner Leitor = new Scanner(System.in);
        String conta = " CORRENTE ";
        double saldo = 1000;
        int opção= 0 ;
        System.out.println("_____________________________________________");
        System.out.println("\n Nome do cliente:" + nome );
        System.out.println("TIPO CONTA :"+ conta);
        System.out.println("Saldo atual da conta :"+ saldo);
        System.out.println("\n_____________________________________________");
        System.out.println("Bem vindo ao menu ");
        String menu  = """ 
        *** Bem vindo ao banco 2WP ***
        1 - Consultar Saldo 
        2 - Transferência 
        3 - Deposito 
        4 - Fechar o app do Banco 
        Resposta abaixo :
        _________________________________
        """;
        while (opção != 4){
            System.out.println(menu);
            opção = Leitor.nextInt();
            if ( opção == 1){
                System.out.println(" O SALDO DA CONTA É :"+ saldo);
            }
            if ( opção == 2 ){
                System.out.println("Digite o valor da transfêrencia ");
                int trans = Leitor.nextInt();
                if ( trans <= saldo ){
                    System.out.println(" Transfência é possível ");
                    System.out.println("O valor da Transferência foi :" + trans);
                    saldo -= trans;
                }
                else {
                    System.out.println("A TRANSFERENCIA É IMPOSSIVEL, SALDO INVALIDO,APENAS  " + saldo);
                }
            }
            if (opção==3 ){

                System.out.println(" DIGITE O VALOR DO DEPOSITO : ");
                int deposito = Leitor.nextInt();
                System.out.println(" O DEPOSITO FOI REALIZADO!!!");
                saldo += deposito;
            } else if (opção!= 4) {
                System.out.println("OPÇÃO INVÁLIDA, tente outro numero ");
            }
        }

    }
    }

