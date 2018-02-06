package consonantscounter.qu6;
import java.util.Scanner;

public class Consonantscounter {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a word and I will tel you how many constants are in it:");
        
        String word = input.nextLine();
        
        //String word = ("joey");
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            String letter = ("");
            letter = word.substring(i, i + 1); // to check letter by letter

            if (letter.equals("a") || letter.equals("e") || letter.equals("i") || letter.equals("o") || letter.equals("u")) {
                word.indexOf(i, i + 1); // keep moving to the next posotion.

            } else {
                count++;
            }

        }
        System.out.println("Number of constants in the word " + word + " is " + count);

    }
}
