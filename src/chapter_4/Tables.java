package chapter_4;

public class Tables {
    public static void main(String[] args) {
        int value = 1;
        int number = 1;
        int number2 = 2;
        int number3 = 3;
        int number4 = 4;
        int number5 = 5;
        int value2 = 1;
        int value3 = 1;
        int value4 = 1;
        int value5 = 1;
        int cube1 = 1;
        int cube2 = 1;
        int cube3 = 1;
        int cube4 = 1;
        int cube5 = 1;
        int result1 = 1;
        int result2 = 1;
        int result3 = 1;
        int result4 = 1;
        int result5 = 1;
//       for (int index = 1; index <= 5; index++) {
//           System.out.printf("%d\n", index);
//       }
            for (int square = 1; square <= 2; square++){
                value *=  number;
                value2 *= number2;
                value3 *= number3;
                value4 *= number4;
                value5 *= number5;
            }
        System.out.printf("%2d\n %d\n %d\n %d\n %d\n",value,value2,value3,value4,value5);
            for (int cube = 1; cube <= 3; cube++){
                cube1 *= number;
                cube2 *= number2;
                cube3 *= number3;
                cube4 *= number4;
                cube5 *= number5;
            }
        System.out.printf("%2d\n %d\n %d\n %d\n %d\n",cube1,cube2,cube3,cube4,cube5);
            for (int cube = 1; cube <= 4; cube++){
                result1 *= number;
                result2 *= number2;
                result3 *= number3;
                result4 *= number4;
                result5 *= number5;
            }
        System.out.println("\t"+result1+ "\n" +  result2 + "\n" + result3+ "\n" + result4+ "\n" + result5);
        }
    }
