import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[] text = scan.nextLine().toCharArray();
        for (int i = text.length - 1; i >= 0; i--){
            System.out.print(text[i]);
        }
    }
}
