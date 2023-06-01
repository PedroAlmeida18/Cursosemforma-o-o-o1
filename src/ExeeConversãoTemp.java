public class ExeeConversãoTemp {
    public static void main(String[] args) {
        String programaTemperatura  = """
                Neste programa iremos converter os valores de Celsius em Far;
                esse programa é muito importante para os conhecimentos em
                programação, feito por 
                Pedro Henrique de Almeida Santos 
                """;
        System.out.println(programaTemperatura);
        double  celsius = 21.7;
        double conversao=   (celsius * 1.8 ) +32;
        System.out.println(conversao);
        int conversao2=   (int) (celsius * 1.8 ) +32;
        System.out.println(conversao2);
        boolean incluidoNoPlano= true;
        double notaDoFilme = 8.1;

    }
}
