import java.text.MessageFormat;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       double primeiroNumero = 6.9;
        double segundoNumero = 20.8;
        double media = (primeiroNumero+segundoNumero)/2;
        System.out.println(media);


    }
    public class Palavras {
        public static void main(String[] args) {
            char letra = 'B';
            String palavra = "LUE";
            String mensagem = "A letra é " + letra + "e a palavra é " + palavra;
            System.out.println(mensagem);
        }
    }
    public class Casting {
        //convertendo numero double para integer
        public static void main(String[] args) {
            double numeroDouble = 3.8;
            int numeroInteiro = (int) numeroDouble ;
            System.out.println("convertendo numero double para integer " + numeroInteiro);
        }
    }
    public class Produto{
        public static void main(String[] args) {
            double precoOriginal = 10.00;
            double percentualDesconto= 10;
            double valorFinal= (precoOriginal/100)* percentualDesconto;
            String mensagem = "Com o desconto de "+ percentualDesconto +"%"+ "o preço final sera de "+ valorFinal;

            System.out.println(mensagem);

        }
    }
}

