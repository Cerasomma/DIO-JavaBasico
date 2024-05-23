import java.util.Locale;
import java.util.Scanner;

public class AboutMeIDE {
    public static void main(String[] args) {
        
        //criando objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.print("Digite seu nome: ");
        String nome = scanner.next();
        System.out.print("Digite seu sobrenome: ");
        String sobrenome = scanner.next();
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        System.out.print("Digite sua altura ");
        Double altura = scanner.nextDouble();
        

        //imprimindo as entradas
        System.out.println("Me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Minha altura é " + altura + " cm");


        
    }
}
