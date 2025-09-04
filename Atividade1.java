import java.util.Scanner;

public class Atividade1
{
    public static void main(String[] args)
    {
        Scanner tec = new Scanner(System.in);
        System.out.print("Digite o número de horas trabalhadas:");
        int horas = tec.nextInt();

        System.out.print("Digite o valor recebido por hora:");
        int valor = tec.nextInt();

        int salBruto = horas * valor;
        System.out.println("O salário bruto é R$: "+salBruto+"\n");

        double imposto = salBruto*0.3;
        System.out.println("O valor do imposto é R$: "+imposto+"\n");

        double salLiq = salBruto - imposto;

        System.out.println("O salário líquido é R$: "+salLiq);
    }
}