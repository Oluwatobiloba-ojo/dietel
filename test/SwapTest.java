import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SwapTest {

    @Test
    public void testThatNumberWithinAParticularIndexCanSwap(){
        int [] numbers = {10, 20, 30, 40, 50};
        int startIndex = 0;
        int swapper = 2;
        int [] result =  Swaping.swap(numbers, startIndex, swapper);
        int [] swapped = {30, 20, 10, 40, 50};
        assertArrayEquals(result, swapped);
    }
    @Test
    public void testThatNumberWithinAParticularIndexCanSwap2(){
        int [] numbers = {1, 2, 3, 4, 5, 6, 7};
        int startIndex = 3;
        int swapper = 6;
        int [] result =  Swaping.swap(numbers, startIndex, swapper);
        int [] swapped = {1, 2, 3, 7, 5, 6, 4};
        assertArrayEquals(result, swapped);
    }
}
