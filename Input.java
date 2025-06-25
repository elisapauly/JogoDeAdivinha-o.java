import java.util.Scanner;

public class Input { 
    
    public static void main(String [] args){

        //Entrada de dados
        Scanner scanner = new Scanner (System.in); //Instancia de uma classe (Classe -> Objeto)
        System.out.println("Digite o seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();
        System.out.println(" Seu nome é "+nome+" e você tem "+idade+" anos. " );

        //Saida de dados
        System.out.println("Olá a todos");
        System.out.print("Hoje faz 7 graus");
        System.out.print("Mesma linha");
    }
}

