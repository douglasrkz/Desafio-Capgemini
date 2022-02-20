import java.util.Scanner;

class questao1{
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro para ser feito em pirâmide: ");
        int numero = scanner.nextInt();
        piramide(numero);
        scanner.close();


    }
    public static void piramide(int n) {
        String espaco = " ";
        String asterisco = "*";

        for (int j = 1; j <= n; j++){
            for (int i = n; i > 0; i--){
                if(i == 1){
                    System.out.println(asterisco);
                } else if(j >= i){
                    System.out.print(asterisco);
                }else{
                    System.out.print(espaco);
                }
            }
        }
    }
}