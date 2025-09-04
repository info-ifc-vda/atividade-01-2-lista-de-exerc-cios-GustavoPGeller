import java.util.Scanner;

public class Atividade4
{
    public static void main(String[] args)
    {
        Scanner tec = new Scanner(System.in);
        int cod;
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        int p4 = 0;
        double desconto = 0;

        do
        {
            System.out.print("Digite o código do produto desejado (0 para sair):");
            cod = tec.nextInt();

            if((cod > 0) && (cod <= 10))
            {
                p1++;
            }
            else if((cod >= 11) && (cod <= 20))
            {
                p2++;
            }
            else if((cod >= 21) && (cod <= 30))
            {
                p3++;
            }
            else if((cod >= 31) && (cod <= 40))
            {
                p4++;
            }
            else if((cod < 0) || (cod > 40))
            {
                System.out.println("Código de produto inválido!");
            }

        }while (cod != 0);

        double preco = (p1 * 10.00) + (p2 * 15.00) + (p3 * 20.00) + (p4 * 40.00);

        if(preco < 250)
        {
            desconto = preco * 0.05;
        }
        else if((preco >= 250) && (preco <= 500))
        {
            desconto = preco * 0.1;
        }
        else if(preco > 500)
        {
            desconto = preco * 0.15;
        }
        
        System.out.println("\n"); // Apenas pra deixar bonitinho no console

        System.out.println("Total de produtos comprados: "+(p1+p2+p3+p4));
        System.out.println("\nCódigo 1 à 10: "+p1+"\nCom total de: R$ "+(p1*10.00));
        System.out.println("\nCódigo 11 à 20: "+p2+"\nCom total de: R$ "+(p2*15.00));
        System.out.println("\nCódigo 21 à 30: "+p3+"\nCom total de: R$ "+(p3*20.00));
        System.out.println("\nCódigo 31 à 40: "+p4+"\nCom total de: R$ "+(p4*40.00));

        System.out.println("\nPreço bruto: R$ "+preco);
        System.out.println("Total de desconto: R$ "+desconto);
        System.out.println("Preço final: R$ "+(preco - desconto));
    }
}