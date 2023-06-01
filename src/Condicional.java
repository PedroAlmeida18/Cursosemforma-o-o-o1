public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2022;
        boolean incluidoNoPlano= false;
        double notaDoFilme = 8.1;
        String tipodePlano = "Plus";

        if (anoDeLancamento >= 2022){
            System.out.println("Lançamento que os clientes estão curtindo");
        }
        else{
            System.out.println("FILME RETRO QUE VALE A PENA ASSISTIR EM 1986");
        }
        if(incluidoNoPlano && tipodePlano == "Plus"){
            System.out.println("Filme liberado ");
        }else{
            System.out.println("PAGUE O ALUGUEL");
        }
    }
}
