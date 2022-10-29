import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Double numero1 = 0.0, numero2 = 0.0;
        char opcao;

        System.out.println("Digite os dois numeros");
        numero1 = in.nextDouble();
        numero2 = in.nextDouble();
        System.out.println("Digite a operação");
        opcao = in.next().charAt(0);
        switch (opcao) {
            case '+':
                System.out.println(numero1 + numero2);
                break;
            case '-':
                System.out.println(numero1 - numero2);
                break;
            case '*':
                System.out.println(numero1 * numero2);
                break;
            case '/':
                //Exercicio 2
                if (numero2 == 0)  {
                    System.out.println("Erro. Divisor foi zero");
                }
                break;
            default:
                System.out.println("Opção Inválida");
                break;
        }
    }
}
