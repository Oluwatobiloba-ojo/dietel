package classwork;

import java.util.Arrays;

public class Characters {
    public static void main(String[] args) {
        String [] chars = {"A", "B", "C", "D", "E", "F", "G", "H"};
        System.out.println(Arrays.toString(shuffle(3, chars)));
    }
    public static String[] shuffle(int number , String [] characters){
        String [] newList = new String[characters.length];
        int distance = (characters.length/2) - 1;
        int count = 0;
        for (int x = 0; x < characters.length; x++){
            if(count % 2 == 0){
                newList[count] = characters[x];
            }else {
                newList[count] = characters[x + distance];
                x -= 1;
            }
            count++;
            if (count == characters.length){
                break;
            }
        }
        return newList;
    }
}
