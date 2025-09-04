import java.util.Scanner;

public class Atividade7
{
    public static void main(String[] args)
    {
        int intervalo1;
        int intervalo2;

        Scanner tec = new Scanner(System.in);

        System.out.print("Digite o primeiro número do intervalo: ");
        intervalo1 = tec.nextInt();

        System.out.print("Digite o segundo número do intervalo: ");
        intervalo2 = tec.nextInt();

        for (int i = intervalo1; i <= intervalo2; i++) // i marcando o local do fatorial
        {
            int fatorial = 1;  

            for (int j = 1; j <= i; j++) // j fazendo o fatorial em sí
            {
                fatorial *= j;
            }

            System.out.print("Fatorial de "+i+" é: "+fatorial+"\n");

            fatorial = 1;
        }
    }
}