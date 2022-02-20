import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class questao3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a palavra para fazer anagrama");
        String palavra = scanner.next();
        scanner.close();
        verificarAnagrama(palavra);
    }

    public static void verificarAnagrama (String palavra){
        HashMap<String, Integer> map = new HashMap<>();
        int count = 0;

        for (int i = 0; i < palavra.length(); i++) {
            for (int j = i; j < palavra.length(); j++) {
                char[] a = palavra.substring(i, j + 1).toCharArray();
                Arrays.sort(a);
                String substring = new String(a);
                if (map.containsKey(substring)) {
                    map.put(substring, map.get(substring) + 1);
                } else {
                    map.put(substring, 1);
                }
            }
        }
        for (String subs : map.keySet()) {
            int q = map.get(subs);
            count += (q * (q - 1)) / 2;
        }
        System.out.println(count);
    }
}