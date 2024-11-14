
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a sentense:");
        String input = scanner.nextLine();
        int count = 0;
        String newStr = "";
        int lastspaceInSentence = input.lastIndexOf(' ');
        int lastCharachter = input.length();
        while (lastspaceInSentence > -1) {
            newStr = newStr.concat(" ").concat(input.substring(lastspaceInSentence + 1, lastCharachter));
            lastCharachter = lastspaceInSentence;
            lastspaceInSentence = input.lastIndexOf(' ', lastspaceInSentence - 1);
            count++;
            System.out.println(count);
        }
        System.out.println(newStr + " " + input.substring(0, lastCharachter));

    }
}
