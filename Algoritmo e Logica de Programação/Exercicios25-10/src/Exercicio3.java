import java.util.Scanner;

public class Exercicio3{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Double altura = 0.0, peso = 0.0;
        char sexo;

        System.out.println("Digite seu peso");
        peso = in.nextDouble();
        System.out.println("Digite sua altura");
        altura = in.nextDouble();
        System.out.println("Digite seu sexo");
        sexo = in.next().charAt(0);
        switch (sexo) {
            case 'F':
                System.out.println(72.7 * altura - 58);
                break;
            case 'M':
                System.out.println(62.1 * altura - 44.7);
                break;
            case 'f':
                System.out.println(72.7 * altura - 58);
                break;
            case 'm':
                System.out.println(62.1 * altura - 44.7);
                break;
            default:
                
                break;
        }
    }
}
