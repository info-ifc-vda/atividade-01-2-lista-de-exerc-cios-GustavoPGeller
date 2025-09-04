import java.util.Scanner;

public class Atividade2
{
    public static void main(String[] args)
    {
        Scanner tec = new Scanner(System.in);
        System.out.print("Digite o valor do salário mínimo: R$ ");
        double salMin = tec.nextDouble();

        double valorQW = salMin*0.01; // valor do quilowatt

        System.out.print("Digite a quantidade de quilowatts consumida: ");
        double qw = tec.nextDouble();

        System.out.println("O valor de cada quilowatt é R$: "+valorQW);
        System.out.println("O valor total a ser pago é R$: "+qw*valorQW);
    }
}