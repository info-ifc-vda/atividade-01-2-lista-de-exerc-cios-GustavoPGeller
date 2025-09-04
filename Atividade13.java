import java.util.Scanner;

public class Atividade13
{
    public static void main(String[] args)
    {
        Scanner tec = new Scanner(System.in);

        int vetor1[] = new int[10];
        int vetor2[] = new int[5];
        int vetorSoma[] = new int[10];
        int vetorDivisores[] = new int[10];
        int soma = 0;
        int cont = 0;


        System.out.println("Digite os números do primeiro vetor:");
        for(int i = 0; i < 10; i++)
        {
            vetor1[i] = tec.nextInt();
        }

        System.out.println("Digite os números do segundo vetor:");
        for(int i = 0; i < 5; i++)
        {
            vetor2[i] = tec.nextInt();
        }

        for(int i = 0; i < 10; i++)
        {
            if(vetor1[i] % 2 == 0)
            {
                soma = 0;
                for (int j = 0; j < 5; j++)
                {
                    soma += vetor1[i] + vetor2[j];
                }
                vetorSoma[i] = soma;
            }

            else
            {
                cont = 0;

                for(int x = 0; x < 5; x++)
                {
                    if((vetor2[x] != 0) && (vetor1[i] % vetor2[x] == 0))
                    {
                        cont++;
                    }
                }

                vetorDivisores[i] = cont;
            }
        }

        System.out.println("\nVetor 1: ");

        for(int i = 0; i < 10; i++)
        {
            System.out.print(vetor1[i]+"\t");
        }

        System.out.println("\nVetor 2: ");

        for(int i = 0; i < 5; i++)
        {
            System.out.print(vetor2[i]+"\t");
        }

        System.out.println("\nVetor Soma: ");

        for (int i = 0; i < 10; i++) 
        {
            if(vetorSoma[i] != 0)
            {
                System.out.print(vetorSoma[i]+"\t");
            }
        }

        System.out.println("\nVetor Divisores: ");

        for(int i = 0; i < 10; i++)
        {
            System.out.print(vetorDivisores[i]+"\t");
        }
    }
}