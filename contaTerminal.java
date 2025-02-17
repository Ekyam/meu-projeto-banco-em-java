import java.util.Scanner;

public class contaTerminal {
    public static void main(String[] args) {

                int numeroConta;
                String agencia;
                String nomeCliente = "MARIO DE ANDRADE FERREIRA";
                float saldo = 514.05f;

                Scanner sc = new Scanner(System.in);
                System.out.print("Por favor, digite o número da sua conta");
                numeroConta = sc.nextInt();
                sc.nextLine();

                System.out.print("Por favor, digite o número da sua Agencia");
                agencia = sc.nextLine();

                String mensagem = String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", nomeCliente, agencia, numeroConta, saldo);
                System.out.print(mensagem);

                sc.close();
            }
        }



