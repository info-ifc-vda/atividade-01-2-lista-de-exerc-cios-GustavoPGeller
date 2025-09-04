import java.util.Scanner;

public class Atividade14
{
    public static void main(String[] args)
    {
        Scanner tec = new Scanner(System.in);
        
        int id[] = new int[10];
        double saldo[] = new double[10];
        int numContas = 0;
        int cod;
        boolean codExiste = false;
        int op;

        System.out.println("--- Cadastro de contas ---");

        do
        {
            codExiste = false;

            System.out.println("Digite o código da conta nº "+(numContas+1));
            cod = tec.nextInt();

            for(int i = 0; i < numContas; i++)
            {
                if(id[i] == cod)
                {
                    codExiste = true;
                    System.out.println("Código já existente, tente novamente!");
                    break;
                }
            }

            if(codExiste == false)
            {
                id[numContas] = cod;
                System.out.println("Digite o saldo da conta: R$ ");
                saldo[numContas] = tec.nextDouble();
                numContas++;
            }

        } while (numContas < 10);
        
        do  // menu
        {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Depósito");
            System.out.println("2 - Saque");
            System.out.println("3 - Consultar o ativo bancário");
            System.out.println("4 - Finalizar programa");
            System.out.print("Escolha uma opção: ");
            op = tec.nextInt();

            if(op == 1) // depósito
            {
                System.out.print("Digite o código da conta para o depósito: ");
                int idDep = tec.nextInt();

                int iDep = encontrarConta(id, idDep);

                if(iDep != 1)
                {
                    System.out.print("Digite o valor do depósito: R$ ");
                    double valDep = tec.nextDouble();

                    saldo[iDep] += valDep;

                    System.out.println("Depósito no valor de R$ "+valDep+" para a conta "+idDep+" realizado com sucesso!");
                    System.out.println("Novo saldo: R$ "+saldo[iDep]);
                }

                else
                {
                    System.out.println("Conta não encontrada!");
                }
            }

            if(op == 2) // saque
            {
                System.out.print("Digite o código da conta para o saque: ");
                int idSaq = tec.nextInt();

                int iSaq = encontrarConta(id, idSaq);

                if(iSaq != 1)
                {
                    System.out.print("Digite o valor do saque: R$ ");
                    double valSaq = tec.nextDouble();

                    saldo[iSaq] += valSaq;

                    if (saldo[iSaq] >= valSaq)
                    {
                        saldo[iSaq] -= valSaq;
                        System.out.println("Saque no valor de R$ "+valSaq+" para a conta "+idSaq+" realizado com sucesso!");
                        System.out.println("Novo saldo: R$ "+saldo[iSaq]);
                    }
                    
                    else
                    {
                        System.out.println("Saldo insuficiente.");
                    }
                }

                else
                {
                    System.out.println("Conta não encontrada!");
                }
            }

            if(op == 3) // ativo bancário
            {
                double ativoBancario = 0;
                {
                    for(int i = 0; i < 10; i++)
                    {
                        ativoBancario += saldo[i];
                    }

                    System.out.print("O ativo bancário total é de: R$ "+ativoBancario);
                }
            }

            if(op == 4)
            {
                System.out.println("Finalizando o sistema!");
            }

            else
            {
                System.out.println("Opção inválida!");
            }

        } while (op != 4);
    }

    // função criada por IA (eu não sabia utilizar as funções do JAVA)
    public static int encontrarConta(int[] codigos, int codigo) {
        for (int i = 0; i < codigos.length; i++) {
            if (codigos[i] == codigo) {
                return i;
            }
        }
        return -1;
    }
}