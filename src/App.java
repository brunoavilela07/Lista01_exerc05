import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // Declaração das váriaveis
        double metro;
        double centimetro;
        // Passo 1: Entrada de dados
        Scanner input = new Scanner(System.in);
        System.out.println("Quantos metros tem um ônibus? ");
        metro = input.nextDouble();
        // Passo 2: Calcular os centímetros
        centimetro = metro * 100;
        // Passo 3: Exibir a resposta

        System.out.println(
                " Se um ônibus tem " + metro + " metros, quantos centímetros ele tem? " + centimetro + " centímetros.");

    }
}
