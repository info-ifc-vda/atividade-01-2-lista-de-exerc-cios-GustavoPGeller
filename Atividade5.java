import java.util.Scanner;


public class Atividade5
{
    public static void main(String[] args)
    {
        Scanner tec = new Scanner(System.in);

        int i, j; // i contando times e j jogadores
        double altura = 0;
        double mediaAltura = 0;
        double idade = 0;
        double peso = 0;
        double mediaPeso = 0;
        double mIdade1 = 0;
        double mIdade2 = 0;
        double mIdade3 = 0;
        double mIdade4 = 0;
        double mIdade5 = 0;
        int menor18 = 0;
        double mais80 = 0;

        for(i=0; i<5; i++) // 5 times
        {
            for(j=0; j<11; j++) // 11 jogadores
            {
                System.out.println("Digite a idade do jogador "+(j+1)+" do time "+(i+1)+": ");
                idade = tec.nextDouble();
                System.out.println("Digite a altura do jogador "+(j+1)+" do time "+(i+1)+": ");
                altura = tec.nextDouble();
                System.out.println("Digite o peso do jogador "+(j+1)+" do time "+(i+1)+": ");
                peso = tec.nextDouble();

                if(idade < 18)
                {
                    menor18++;
                }

                if(i==0)
                {
                    mIdade1 += idade;
                }
                else if(i==1)
                {
                    mIdade2 += idade;
                }
                else if(i==2)
                {
                    mIdade3 += idade;
                }
                else if(i==3)
                {
                    mIdade4 += idade;
                }
                else if(i==4)
                {
                    mIdade5 += idade;
                }   
                
                // e aí Fábio, nada como uma gambiarrinha básica, não é?...

                mediaAltura += altura;

                if(peso > 80)
                {
                    mais80++;
                }
            }
        }

        mediaAltura = (mediaAltura / 55);

        mais80 = (mais80 / 55) * 100;

        System.out.println("\nQuantidade de jogadores menores de 18 anos: "+menor18);
        System.out.println("Média de idade do time 1: "+(mIdade1/11));
        System.out.println("Média de idade do time 2: "+(mIdade2/11));
        System.out.println("Média de idade do time 3: "+(mIdade3/11));
        System.out.println("Média de idade do time 4: "+(mIdade4/11));
        System.out.println("Média de idade do time 5: "+(mIdade5/11));
        System.out.println("Média da altura dos jogadores: "+mediaAltura+"m");
        System.out.println("Porcentagem de jogadores com mais de 80kg: "+mais80+"%");
    }
}