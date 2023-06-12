import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        

        System.out.println("Digite o seu Nome");
        String nomeCliente = scan.nextLine();
        System.out.println("Digite o numero da sua Agencia");
        String agencia = scan.nextLine();
        System.out.println("Digite o numero da sua Conta");
        int numero = scan.nextInt();  
        System.out.println("Digite o valor do seu Saldo");
        double saldo = scan.nextDouble();
        Conta conta = new Conta(numero,agencia,nomeCliente,saldo);
        System.out.println("Ola " + conta.getNomeCliente() + ",. obrigado por criar uma conta em nosso banco, sua agencia eh : " + conta.getAgencia() + ", conta " + conta.getNumero() + " e seu saldo " + conta.getSaldo() + " ja esta disponivel para saque");
        scan.close();
    }
}
