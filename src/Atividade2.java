import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        int tamanho;

        System.out.print("Digite o tamanho do quadrado, somente de 1 a 10: ");
        tamanho = entry.nextInt();

        if (tamanho >= 1 && tamanho <= 10) {
            System.out.println("Letra A:");
            for (int i = 0; i < tamanho; i++) {
                for (int j = 0; j < tamanho; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }

            System.out.println("\nLetra B:");
            for (int i = 0; i < tamanho; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }

            System.out.println("\nLetra C:");
            for (int i = 0; i < tamanho; i++) {
                for (int j = 0; j < tamanho - i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Tamanho maior que o limite (utilize o tamanho de 1 a 10).");
        }
    }
}
