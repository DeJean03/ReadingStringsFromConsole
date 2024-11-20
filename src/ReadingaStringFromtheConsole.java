import java.util.Scanner;

public class ReadingaStringFromtheConsole {
/**
 * System.in creates a standard input stream that is already open and ready to supply input data.
 * The scanner is a simple text scanner that can parse primitive types and strings using regular expressions.
 * So, passing System.in to Scanner allows us to parse or read strings from the standard input stream,
 * which is the console.
 */
public void Scanner(){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter three words separated by spaces: ");
    String s1 = input.next();
    String s2 = input.next();
    String s3 = input.next();
    System.out.println("s1 is " + s1);
    System.out.println("s2 is " + s2);
    System.out.println("s3 is " + s3);
    //When the program is run, the execution waits after printing “Enter three words separated by spaces:,”
    // where the user would enter a string similar to “hello world” as shown in the following console window.
    //The program prints the string read from the console input in the next step. The whole output in the console would be as shown in the following.
}
public void Scanner2(){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a character: ");
    String s = input.nextLine();
    char ch = s.charAt(0);
    System.out.println("The character entered is " + ch);
}
}
