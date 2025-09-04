import java.util.Scanner;

public class Atividade15
{
    public static void main(String[] args)
    {
        Scanner tec = new Scanner(System.in);

        int matriz[][] = new int[7][7];
        int maiorLinha[] = new int[7];
        int menorColuna[] = new int[7];
        int maior;
        int menor;

        System.out.println("Digite os elementos da matriz: ");

        for(int i = 0; i < 7; i++)
        {
            for(int j = 0; j < 7; j++)
            {
                matriz[i][j] = tec.nextInt();
            }
        }

        for(int i = 0; i < 7; i++)
        {
            maior = matriz[i][0];

            for(int j = 1; j < 7; j++)
            {
                if(matriz[i][j] > maior)
                {
                    maior = matriz[i][j];
                }
            }

            maiorLinha[i] = maior;
        }

        for(int j = 0; j < 7; j++)
        {
            menor = matriz[0][j];

            for(int i = 0; i < 7; i++)
            {
                if(matriz[i][j] < menor)
                {
                    menor = matriz[i][j];
                }
            }

            menorColuna[j] = menor;
        }

        System.out.println("Matriz:");
        for(int i = 0; i < 7; i++)
        {
            for(int j = 0; j < 7; j++)
            {
                System.out.print(matriz[i][j]+"\t");
            }

            System.out.println();
        }

        System.out.println("\nMaior Linha:");
        {
            for(int i = 0; i < 7; i++)
            {
                System.out.print(maiorLinha[i]+"\t");
            }

            System.out.println();
        }

        System.out.println("\nMenor Coluna:");
        {
            for(int i = 0; i < 7; i++)
            {
                System.out.print(menorColuna[i]+"\t");
            }
        }
    }    
}
