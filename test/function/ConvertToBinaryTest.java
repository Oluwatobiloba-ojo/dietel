package function;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConvertToBinaryTest {

    @Test
    public void testForTheConversionOfBinaryToDecimal(){
        int binaryNumber = 101;
        int result = 5;
        assertEquals(result, ConvertToBinary.binaryToDecimal(binaryNumber));
    }
    @Test
    public void testForTheConversionOfBinaryToDecimal2(){
        int binary = 111;
        assertEquals(7, ConvertToBinary.binaryToDecimal(binary));
    }
    @Test
    public void testForTheConversionsOfBinaryToDecimal(){
        int binary = 1000;
        assertEquals(ConvertToBinary.binaryToDecimal(binary), 8);
    }
    @Test
    public void testForTheConversionOfBinaryToDecimal3(){
        int binary = 1001;
        assertEquals(ConvertToBinary.binaryToDecimal(binary), 9);
    }
    @Test
    public void testForTheConversionOfBinaryToDecimal4(){
        int binary = 1101;
        assertEquals(ConvertToBinary.binaryToDecimal(binary), 13);
    }
    @Test
    public void testForTheConversionOfDecimalToBinary(){
        int decimal = 13;
        assertEquals(ConvertToBinary.decimalToBinary(decimal), 1101);
    }
    @Test
    public void testForTheConversionOfDecimalToBinary2(){
        assertEquals(ConvertToBinary.decimalToBinary(9), 1001);
    }
    @Test
    public void testForTheConversionOfDecimalToBinary3(){
        assertEquals(ConvertToBinary.decimalToBinary(8), 1000);
    }
    @Test
    public void testForTheConversionOfDecimalToBinary4(){
        assertEquals(ConvertToBinary.decimalToBinary(5), 101);
    }
    @Test
    public void testForTheConversionOfDecimalToBinary5(){
        assertEquals(ConvertToBinary.decimalToBinary(7), 111);
    }
    @Test
    public void testForTheConversionOfDecimalToBinary6(){
        assertEquals(ConvertToBinary.decimalToBinary(20), 10100);
    }
    @Test
    public void testForTheConversionOfBinaryToDecimal5(){
        assertEquals(ConvertToBinary.binaryToDecimal(10100), 20);
    }

}
