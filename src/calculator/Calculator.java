package calculator;

import java.util.ArrayList;

public class Calculator {

    ArrayList<String> numbers = new ArrayList<>();
    public  int calculate(String expression) {
        int start = 0;
        for (int num = 0; num < expression.length(); num++){
            if (!String.valueOf(expression.charAt(num)).matches("\\d+")){
                numbers.add(expression.substring(start, num));
                numbers.add(String.valueOf(expression.charAt(num)));
                start = num+1;
            }
        }
        numbers.add(String.valueOf(expression.charAt(expression.length() - 1)));
        System.out.println(numbers);
        performBoardMax("/");
        System.out.println(numbers);
        performBoardMax("*");
        System.out.println(numbers);
        performBoardMax("+");
        System.out.println(numbers);
        performBoardMax("-");
        return Integer.parseInt(numbers.get(0));
    }

    private void performBoardMax(String sign) {
        while (numbers.contains(sign)){
            int result = 0;
            ArrayList<String>nums = new ArrayList<>();
            int index = numbers.indexOf(sign);
            if (sign.equals("+")){
                result = Integer.parseInt(numbers.get(index - 1)) + Integer.parseInt(numbers.get(index+1));
            } else if (sign.equals("*")) {
                result = Integer.parseInt(numbers.get(index - 1)) * Integer.parseInt(numbers.get(index+1));
            } else if (sign.equals("/")) {
                result = Integer.parseInt(numbers.get(index - 1)) / Integer.parseInt(numbers.get(index+1));
            }else if (sign.equals("-")){
                result = Integer.parseInt(numbers.get(index - 1)) - Integer.parseInt(numbers.get(index+1));
            }
            for (int numb = 0; numb < numbers.size(); numb++){
                if (numb == index-1){
                    nums.add(String.valueOf(result));
                    numb+=2;
                }
                else {
                    nums.add(numbers.get(numb));
                }
            }
            numbers = nums;
        }
    }
}
