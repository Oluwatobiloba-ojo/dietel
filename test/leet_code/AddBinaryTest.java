package leet_code;
import org.junit.jupiter.api.Test;
import static leet_code.AddBinary.add;
import static org.junit.jupiter.api.Assertions.*;

class AddBinaryTest {
    @Test
    public void testThatWhenWeAdd11And1ResultIs100(){
        String firstBinary = "11";
        String secondBinary = "1";
        String result = "100";
        assertEquals(result, add(firstBinary, secondBinary));
    }@Test
    public void testThatWhenIAdd1010And1011ResultIs10101(){
        String firstBinary = "1010";
        String secondBinary = "1011";
        String result = "10101";
        assertEquals(result, add(firstBinary, secondBinary));
    }@Test
    public void testThatWhenIAdd11And10ResultIs101(){
        String firstBinary = "11";
        String secondBinary = "10";
        String result = "101";
        assertEquals(result, add(firstBinary, secondBinary));
    }@Test
    public void testThatWhenIAdd101And111ResultWillBe1100(){
        String firstBinary = "101";
        String secondBinary = "111";
        String result = "1100";
        assertEquals(result, add(firstBinary, secondBinary));
    }
}