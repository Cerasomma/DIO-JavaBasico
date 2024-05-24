import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        //criando objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //entrada de dados
        System.out.print("Digite o número da Agência: ");
        int numeroAgencia = scanner.nextInt();
        System.out.print("Digite o número da Conta (xxx-x): ");
        String numeroConta = scanner.next();

        scanner.nextLine();//consome o último caractere da linha restante
        System.out.print("Digite seu nome completo: ");
        String nomeCompleto = scanner.nextLine();

        Double saldo = 237.48;

        //exibe dados
        System.out.print("Olá " + nomeCompleto + " obrigado por criar uma conta em nosso banco");
        System.out.print(", sua agência é: " + numeroAgencia);
        System.out.print(", conta número: " + numeroConta);
        System.out.print(" e seu saldo é: $" + saldo);
        System.out.print(" e já está disponível para saque.");
    }
}
