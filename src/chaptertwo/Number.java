package chaptertwo;

public class Number {
    public static void main(String[] args) {
        for (int number = 2; number <= 100; number = number + 2) {
            int number3 = number * number;
            System.out.printf("\t%d",number3);

             if (number3 == 100) {
                    break;
               }

            int result = number % 2;
            // Odd number
            if (result == 1 && number != result) {
                //    System.out.printf("\t%d",number);
            }
            // even number
            int answer = number % 2;
            if (result == 0 && number != result) {
                int number2 = number * number;
               // System.out.printf("\t%d", number2);
            }
            //    if ( answer == 0 && number != answer){
              //      int number2 = number * number;
                //    System.out.print(number2);
               // }



            }
        }
    }
