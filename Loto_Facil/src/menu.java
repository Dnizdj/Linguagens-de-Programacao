import java.io.Reader;
import java.util.Scanner;
import java.util.Random;

public class menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random gerador = new Random();
        int opcao, numaposta;

        do {
            System.out.println("Menu LOTOFÁCIL:");
            System.out.println("1) Apostar de 0 a 100");
            System.out.println("2) Apostar de A à Z");
            System.out.println("3) Apostar em par ou impar");
            System.out.println("0) Sair");

            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Escolha um número:");
                    int aposta = scanner.nextInt();
                    if (aposta < 0 || aposta > 100) {
                        System.out.println("Número inválido, tente outro:");
                        return;
                    }
                    int numeroSorteado = gerador.nextInt(101);

                    if (aposta == numeroSorteado) {
                        System.out.println("Você ganhou R$ 1.000,00.");
                    } else {
                        System.out.println("Que pena! O número sorteado foi-> " + numeroSorteado + ".");
                    }

                    break;

                case 2:
                    System.out.print("Digite uma letra de A-Z: ");
                    char uai = Character.toUpperCase(scanner.next().charAt(0));

                    if (!Character.isLetter(uai)) {
                        System.out.println("Aposta inválida.");
                        return;
                    }
                    char letraPremiada = 'D';

                    if (uai == letraPremiada) {
                        System.out.println("Você ganhou R$ 500,00 reais.");
                    } else {
                        System.out.println("Que pena! A letra sorteada foi->" + letraPremiada + ".");
                    }


                case 3:
                    System.out.print("Digite um número inteiro: ");
                    int numero = scanner.nextInt();

                    if (numero % 2 == 0) {
                        System.out.println("Você ganhou R$ 100,00 reais.");
                    }
                    else {
                        System.out.println("Que pena! O número digitado é ímpar e a premiação foi para números pares.");
                    }
                    break;
                case 0:
                    System.out.println("Saindo");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }

            System.out.println(); // Linha em branco para separar as iterações

        } while (opcao != 0);

        scanner.close();
    }
}