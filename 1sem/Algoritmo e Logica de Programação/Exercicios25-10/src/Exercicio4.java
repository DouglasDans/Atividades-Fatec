import java.util.Scanner;

public class Exercicio4{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String estacao;

        System.out.println("Digite a mês");
        estacao = in.next();
        switch (estacao) {
            case "dezembro":
                System.out.println("Verão");
                break;
            case "janeiro":
                System.out.println("Verão");
                break;
            case "fevereiro":
                System.out.println("Verão");
                break;
            case "março":
                System.out.println("Outono");
                break;
            case "abril":
                System.out.println("Outono");
                break;
            case "maio":
                System.out.println("Outono");
                break;
            case "junho":
                System.out.println("Inverno");
                break;
            case "julho":
                System.out.println("Inverno");
                break;
            case "agosto":
                System.out.println("Inverno");
                break;
            case "setembro":
                System.out.println("Primavera");
                break;
            case "outubro":
                System.out.println("Primavera");
                break;
            case "novembro":
                System.out.println("Primavera");
                break;
            default:
                System.out.println("Mês inválido");
                break;
        }
    }
}
