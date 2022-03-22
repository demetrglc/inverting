package invertingatext;

import java.util.Scanner;


public class InvertingAText {

    public static void main(String[] args) {
        System.out.println("Please enter a text: ");
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        
        StringBuilder invertText = new StringBuilder();
        invertText.append(text);
        //inverting text 
        invertText = invertText.reverse();
        System.out.println(invertText);
    }
}
