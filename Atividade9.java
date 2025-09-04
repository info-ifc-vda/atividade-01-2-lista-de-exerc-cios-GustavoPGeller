import java.util.Scanner;

public class Atividade9
{
    public static void main (String[] args)
    {
        Scanner tec = new Scanner(System.in);

        System.out.print("Digite um número para verificar se é primo: ");
        int num = tec.nextInt();
        
        boolean primo = true;

        if(num <= 1)
        {
            System.out.println("O número "+num+" não é primo!");
        }

        if(num > 1)
        {
            for(int i = 2; i <= num/2; i++)
            {
                if(num % i == 0)
                {
                    primo = false;
                    System.out.println("O número "+num+" não é primo!");
                    break;
                }
            }

            if(primo == true)
            {
            System.out.println("O número "+num+" é primo!");
            }
        }
    }
}