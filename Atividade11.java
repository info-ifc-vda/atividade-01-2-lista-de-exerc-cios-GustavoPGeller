import java.util.Scanner;

public class Atividade11
{
    public static void main(String[] args)
    {
        Scanner tec = new Scanner(System.in);

        int cont = 0;

        System.out.println("Digite um valor (0 para sair): ");
        System.out.println("Valor   |   Cubo   |   Raiz");
        System.out.println("---------------------------");

        while(2>1)
        {
            int valor = tec.nextInt();

            if(valor <= 0)
            {
                break;
            }

            System.out.print("\t"+Math.pow(valor, 3)+"\t"+Math.sqrt(valor)+"\n");
            
            cont++;

            if(cont == 20)
            {
                System.out.println("Valor   |   Cubo   |   Raiz");
                System.out.println("---------------------------");

                cont = 0;
            }
        }
    }
}