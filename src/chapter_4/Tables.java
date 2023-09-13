package chapter_4;

public class Tables{
    public static void main(String[] args) {
        for (int count = 1; count < 6; count++){
            System.out.printf("%2d\t %d\t %2d\t %-2d\n",count,count*count,count*count*count,count*count*count*count);
        }
    }
}