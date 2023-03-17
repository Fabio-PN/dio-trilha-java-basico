import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        //os argumentos começam com indice 0
        String nome = args [0];
        String sobrenome = args [1];
        int idade = Integer.valueOf(args[2]); //vamos falar sobre Wrappers
        double altura = Double.valueOf(args[3]);

        System.out.println("Ola, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");

        //Usando o scanner para coletar os dados do usuário
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite seu nome: ");
        String name = scanner.next();
        
        System.out.println("Digite seu sobrenome: ");
        String surname = scanner.next();

        System.out.println("Digite sua idade: ");
        int ages = scanner.nextInt();
 
        System.out.println("Digite sua altura: ");
        double height = scanner.nextDouble();

        //Imprimindo os dados obtidos pelo usuário
        System.out.println("Ola, me chamo " + name + " " + surname);
        System.out.println("Tenho " + ages + " anos ");
        System.out.println("Minha altura é " + height + "cm ");


    }
}
