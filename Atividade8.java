import java.util.Scanner;

public class Atividade8
{
    public static void main(String[] args)
    {
        Scanner tec = new Scanner(System.in);

        int notaDuzentos = 0;
        int notaCem = 0;
        int notaCinquenta = 0;
        int notaVinte = 0;
        int notaDez = 0;
        int notaCinco = 0;
        int notaDois = 0;
        int moedaUm = 0;
        int moedaCinquenta = 0;
        int moedaVinteECinco = 0;
        int moedaDez = 0;
        int moedaCinco = 0;

        System.out.print("Digite o preço que deve pagar: R$ ");
        float preco = tec.nextFloat();

        System.out.print("Digite o valor do pagamento: R$ ");
        float valor = tec.nextFloat();

        if(valor < preco)
        {
            System.out.println("Valor insuficiente para pagar a conta!");
            return;
        }

        else
        {
            valor -= preco;
            System.out.println("\nTroco: R$ "+valor);
        }

        while(valor >= 200)
        {
            valor -= 200;
            notaDuzentos++;
        }

        while(valor >= 100)
        {
            valor -= 100;
            notaCem++;
        }

        while(valor >= 50)
        {
            valor -= 50;
            notaCinquenta++;
        }

        while(valor >= 20)
        {
            valor -= 20;
            notaVinte++;
        }

        while(valor >= 10)
        {
            valor -= 10;
            notaDez++;
        }

        while(valor >= 5)
        {
            valor -= 5;
            notaCinco++;
        }

        while(valor >= 2)
        {
            valor -= 2;
            notaDois++;
        }

        while(valor >= 1)
        {
            valor -= 1;
            moedaUm++;
        }

        while(valor >= 0.50)
        {
            valor -= 0.50;
            moedaCinquenta++;
        }

        while(valor >= 0.25)
        {
            valor -= 0.25;
            moedaVinteECinco++;
        }

        while(valor >= 0.10)
        {
            valor -= 0.10;
            moedaDez++;
        }

        while(valor >= 0.05)
        {
            valor -= 0.05;
            moedaCinco++;
        }

        if(notaDuzentos != 0)
        {
            System.out.println("Notas de R$ 200: "+notaDuzentos);
        }

        if(notaCem != 0)
        {
            System.out.println("Notas de R$ 100: "+notaCem);
        }

        if(notaCinquenta != 0)
        {
            System.out.println("Notas de R$ 50: "+notaCinquenta);
        }

        if(notaVinte != 0)
        {
            System.out.println("Notas de R$ 20: "+notaVinte);
        }

        if(notaDez != 0)
        {
            System.out.println("Notas de R$ 10: "+notaDez);
        }

        if(notaCinco != 0)
        {
            System.out.println("Notas de R$ 5: "+notaCinco);
        }

        if(notaDois != 0)
        {
            System.out.println("Notas de R$ 2: "+notaDois);
        }

        if(moedaUm != 0)
        {
            System.out.println("Moedas de R$ 1: "+moedaUm);
        }

        if(moedaCinquenta != 0)
        {
            System.out.println("Moedas de R$ 0,50: "+moedaCinquenta);
        }

        if(moedaVinteECinco != 0)
        {
            System.out.println("Moedas de R$ 0,25: "+moedaVinteECinco);
        }

        if(moedaDez != 0)
        {
            System.out.println("Moedas de R$ 0,10: "+moedaDez);
        }

        if(moedaCinco != 0)
        {
            System.out.println("Moedas de R$ 0,05: "+moedaCinco);
        }

        if(valor > 0)
        {
            System.out.println("Restante (Não sendo possível trocar): R$ "+valor);
        }
    }  
}