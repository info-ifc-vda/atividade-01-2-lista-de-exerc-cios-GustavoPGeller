import java.util.Scanner;

public class Atividade6
{
    public static void main(String[] args)
    {
        Scanner tec = new Scanner(System.in);
        double resultado = 1;

        System.out.print("Digite um número para calcular o fatorial: ");
        int num = tec.nextInt();

        System.out.print(num+"! = ");

        do
        {
            System.out.print(num+" x ");
            resultado = resultado * num;
            num--;
        } while (num != 1);      // é possível fazer com o for também

        System.out.print("1 = "+resultado); 
    }
}