public class Produto {
    public static void main(String[] args) {
        double precoOriginal = 10.00;
        double percentualDesconto= 10;
        double valorFinal= precoOriginal-((precoOriginal/100)* percentualDesconto);
        String mensagem = "Com o desconto de "+ percentualDesconto +"%"+ " o preço final sera de "+ valorFinal+" Reais.";

        System.out.println(mensagem);

    }
}
