import java.util.Scanner;

public class Atividade12
{
    public static void main(String[] args)
    {
        Scanner tec = new Scanner(System.in);

        int vetor1[] = new int[10];
        int vetor2[] = new int[10];
        int vetor3[] = new int[20];
        int aux = 0;
        boolean encontrado = false;
        boolean adicionado = false;

        System.out.println("Digite os valores do primeiro vetor: ");
        for (int i = 0; i < 10; i++)
        {
            vetor1[i] = tec.nextInt();
        }

        System.out.println("Digite os valores do segundo vetor: ");
        for (int i = 0; i < 10; i++)
        {
            vetor2[i] = tec.nextInt();
        }

        for(int i = 0; i < 10; i++) // 1º vetor
        {
            encontrado = false;
            adicionado = false;

            for(int j = 0; j < 10; j++)
            {
                if(vetor1[i] == vetor2[j])
                {
                    encontrado = true;
                    break;
                }
            }

            if(!encontrado)
            {
                for(int x = 0; x < aux; x++) // utilizado apenas na 2ª rodada de contagem
                {
                    if(vetor1[i] == vetor3[x])
                    {
                        adicionado = true;
                        break;
                    }
                }

                if(!adicionado)
                {
                    vetor3[aux] = vetor1[i];
                    aux++;
                }
            }
        }

        for(int i = 0; i < 10; i++) // 2º vetor
        {
            encontrado = false;
            adicionado = false;

            for(int j = 0; j < 10; j++)
            {
                if(vetor2[i] == vetor1[j])
                {
                    encontrado = true;
                    break;
                }
            }

            if(!encontrado)
            {
                for(int x = 0; x < aux; x++)
                {
                    if(vetor2[i] == vetor3[x])
                    {
                        adicionado = true;
                        break;
                    }
                }

                if(!adicionado)
                {
                    vetor3[aux] = vetor2[i];
                    aux++;
                }
            }
        }

        if(aux == 0)
        {
            System.out.println("Não foi encontrado nenhum número não comum!");
        }

        else
        {
            System.out.println("\nNúmeros não comuns dos vetores: ");

            for(int i = 0; i < aux; i++)
            {
                System.out.print(vetor3[i]+"\t");
            }
        }
    }
}