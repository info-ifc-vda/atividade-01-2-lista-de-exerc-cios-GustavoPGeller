import java.util.Scanner;

public class Atividade10
{
    public static void main(String[] args)
    {
        Scanner tec = new Scanner(System.in);
        boolean primo = false;
        int qtdPrimo = 0;

        for(int i = 1; i <= 10; i++)
        {
            System.out.print("Digite o "+i+"º número: ");
            int num = tec.nextInt();

            if((num % 2 != 0) && (num > 1))
            {
                primo = true;
                qtdPrimo++;
            }
        }

        System.out.println("Quantidade de números primos: "+qtdPrimo);
    }
}
