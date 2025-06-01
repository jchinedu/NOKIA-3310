import java.util.Scanner;

public class Reverse2 {

    public static String reverseUpToChar(String word, char ch) {
        int index = word.indexOf(ch);
        if (index == -1) {
            return word; 
        }
        
        String result = "";
        for (int i = index; i >= 0; i--) {
            result += word.charAt(i);
        }
        for (int i = index + 1; i < word.length(); i++) {
            result += word.charAt(i);
        }
        
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String word = input.nextLine();

        System.out.print("Enter a character to reverse up to: ");
        char ch = input.next().charAt(0);

        String output = reverseUpToChar(word, ch);
        System.out.println(output);

        input.close();
    }
}
