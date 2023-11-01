import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        int numero;

        System.out.print("Informe um número inteiro positivo: ");
        numero = entry.nextInt();

        if (numero < 0) {
            System.out.println("O número deve ser inteiro positivo.");
        } else if (numero == 0) {
            System.out.println("0 é nulo, informe um número inteiro positivo");
        } else {
            while (numero > 0) {
                System.out.println(numero);
                numero--;
            }
            System.out.println("Limite atingido: Zero!");
        }
    }
}