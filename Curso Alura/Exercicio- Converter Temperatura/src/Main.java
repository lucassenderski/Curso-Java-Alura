//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double temperaturacelcius = 30.7;
        double temperaturaFahrenheit = (temperaturacelcius * 1.8) + 32;

        String mensagem = String.format("A temperatura em %f Celcius é equivalente a %f Fahenheit", temperaturacelcius,temperaturaFahrenheit);
        System.out.printf(mensagem);

        int temperaturaFahrenheitinteira = (int) temperaturaFahrenheit;
        System.out.println("A temperatura em Fahrenheit é de: "+ temperaturaFahrenheitinteira);
    }
}