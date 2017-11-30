import java.util.Scanner;

public class IndexOfLetters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[] letters = scan.nextLine().toCharArray();
        for (int i = 0; i < letters.length; i++){
            char letter = letters[i];
            System.out.printf("%s -> %d", letter, letter-97);
            System.out.println();
        }
    }
}
