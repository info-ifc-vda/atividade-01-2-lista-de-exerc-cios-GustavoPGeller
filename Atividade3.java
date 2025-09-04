import java.util.Scanner;

public class Atividade3
{
    public static void main(String[] args)
    {
        Scanner tec = new Scanner(System.in);
        System.out.print("Digite o 1º lado do triângulo: ");
        double lado1 = tec.nextDouble();
        System.out.println("Digite o 2º lado do triângulo: ");
        double lado2 = tec.nextDouble();
        System.out.println("Digite o 3º lado do triângulo: ");
        double lado3 = tec.nextDouble();

        System.out.println("Digite o 1º ângulo do triângulo: ");
        double ang1 = tec.nextDouble();
        System.out.println("Digite o 2º ângulo do triângulo: ");
        double ang2 = tec.nextDouble();
        System.out.println("Digite o 3º ângulo do triângulo: ");
        double ang3 = tec.nextDouble();

        if((lado1 == lado2) && (lado1 == lado3))
        {
            System.out.println("O triângulo é equilátero");
        }
        else if((lado1 != lado2) && (lado1 != lado3) && (lado2 != lado3))
        {
            System.out.println("O triângulo é escaleno");
        }
        else
        {
            System.out.println("O triângulo é isósceles");
        }

        if((ang1 == 90) || (ang2 == 90) || (ang3 == 90))
        {
            System.out.println("O triângulo é reto");
        }
        else if((ang1 > 90) || (ang2 >90) || (ang3 > 90))
        {
            System.out.println("O triângulo é obtusângulo");
        }
        else
        {
            System.out.println("O triângulo é acutângulo");
        }
    }
}