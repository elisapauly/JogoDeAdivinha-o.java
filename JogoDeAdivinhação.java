import java.util.Scanner;

public class JogoDeAdivinhacao {

    public static void main(String[] args){
    Scanner entrada = new Scanner(System.in);
    int numero = (int)(Math.random() *101);
    int numeroDigitado=0;
    int cont=0;


System.out.println("Numero gerado: "+numero);

do {

   System.out.println("Digite um numero entre 0 e 100: ");
    numeroDigitado = entrada.nextInt ();

    if(numeroDigitado > numero){
        System.out.println("Numero digitado é menor!!");
    } else if (numeroDigitado < numero){
        System.out.println("Numero gerado é maior!!");
    } else {
        System.out.println("Voce acertou o numero!!");
    }
    cont++;
  } while (numeroDigitado !=numero);

    System.out.println("Numero de tentativas: "+cont);
    }

    }  


