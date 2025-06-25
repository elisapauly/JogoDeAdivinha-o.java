public class Strings {

    public static void main (String[] args){

        String senha = "ABCzxc";
        if (senha.length() > 3){
            System.out.println("Senha válida.");
        } else {
            System.out.println("Senha inválida. Tamanho: "+senha.length());
        }

        System.out.println("LowerCase: "+senha.toLowerCase());
        System.out.println("UppserCase: "+senha.toUpperCase());
        System.out.println("Normal Case: "+senha);

        String nome = "Elisa";
        String sobrenome = "Pauly";
        System.out.println(nome+" "+sobrenome);
        System.out.println(nome.concat( " ").concat(sobrenome));
        
            }
}