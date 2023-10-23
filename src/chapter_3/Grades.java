package chapter_3;

import java.util.Scanner;

public class Grades {
//    collect score from the user
//    save the score
//    output the result
//    if (userinput less than 60)
//        print ("F")
//    else if (userinput = 60 to  69)
//          print("D")
//    else if(userinput = 70 to  79)
//       print("C")
//   else if(userinput = 80 to  89)
//            print("B")
//   else if(userinput = 90 to  100)
//             print("A")
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the score:");
    int userInput = scanner.nextInt();

    if(userInput < 60) System.out.println("F");
    else if (userInput == 60 || userInput <= 69) System.out.println("D");
    else if(userInput == 70 || userInput <= 79) System.out.println("C");
    else if (userInput == 80 || userInput <= 89) System.out.println("B");
    else if(userInput == 90 || userInput <= 100) System.out.println("A");
}
}
