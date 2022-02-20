import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class questao2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(
                " Sua senha deverá conter:\n Mínimo 6 caracteres\n Mínimo 1 digito\n Mínimo 1 letra minúscula\n Mínimo 1 letra maiúscula\n 1 Caractere especial (!@#$%^&*()-+)");
        String senhaDigitada = scanner.next();
        scanner.close();
        validaFinal(senhaDigitada);

    }

    public static boolean validaTamanho(String senha) { // verificar se tem 6 caracteres
        int numeroSenha = senha.length();
        if (numeroSenha >= 6) {
            return true;
        }
        int valorSenha = 6 - numeroSenha;
        if (valorSenha > 0) {
            System.out.println("A senha precisa de " + valorSenha + " para completar o minimo de caracteres");
        }
        return false;
    };

    public static boolean validaDigito(String senha) { // verificar se tem 1 digito
        String regex = "(?=.*[0-9])";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(senha);
        if (m.find())
            return true;
        System.out.println("A senha precisa de no mínimo 1 digito");
        return false;
    };

    public static boolean validaMinusculo(String senha) { // verificar se tem 1 minusculo
        for (int i = 0; i < senha.length(); i++) {
            if (Character.isLowerCase(senha.charAt(i))) {
                return true;
            }
        }
        System.out.print("A senha precisa de uma letra minuscula");
        return false;
    };

    public static boolean validaMaiusculo(String senha) { // verificar se tem um maiusculo
        for (int i = 0; i < senha.length(); i++) {
            if (Character.isUpperCase(senha.charAt(i))) {
                return true;
            }
        }
        System.out.println("A senha precisa de uma letra maiuscula");
        return false;
    }

    public static boolean validaCaractereEspecial(String senha) { // verifica se tem um caractere especial
        String regex = "(?=.[!@#$%^&()-+])";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(senha);
        if (m.find())
            return true;
        System.out.println("A senha precisa ter um caractere especial");
        return false;
    }

    public static void validaFinal(String senhaDigitada) {
        if (validaTamanho(senhaDigitada) &&
                validaTamanho(senhaDigitada) &&
                validaDigito(senhaDigitada) &&
                validaMinusculo(senhaDigitada) &&
                validaMaiusculo(senhaDigitada) &&
                validaCaractereEspecial(senhaDigitada)) {
            System.out.println("Parabéns, sua senha é forte!");
        }
    }

}
