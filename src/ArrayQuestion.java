import java.util.Arrays;

public class ArrayQuestion {

    public static void main(String[] args) {
        int [] numbers = {1, 1, 3, 4, 5, 6, 7, 8, 3, 4};
        int count = 0;
        int value = 0;
        int [] arrange = Arrays.stream(numbers).sorted().toArray();
        System.out.println(Arrays.toString(arrange));
        for (int i = 0; i < arrange.length ; i++) {
            if (arrange[i] == value){
                i++;
            }
            for (int j = 0; j < numbers.length ; j++) {
                if (arrange[i] == arrange[j]){
                    count++;
                }
            }
            value = arrange[i];
            System.out.println(arrange[i]+" occurs " + count + " times ");
            count = 0;
        }
    }
}
