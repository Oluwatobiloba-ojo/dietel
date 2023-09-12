package Chapter3Test.tdd;

import chaptertwo.PetrolPurchase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PetrolPurchaseTest {
    PetrolPurchase mobile;
    @BeforeEach
    public void setOn(){
        mobile = new PetrolPurchase();
    }
    @Test
    public void testThatPetrolPurchaseExist(){
        assertNotNull(mobile);
    }
    @Test
    public void testThatPetrolPurchaseHasAType(){
        mobile.setType("Bitumen");
        assertEquals("Bitumen",mobile.getType());
    }
    @Test
    public void testThatPetrolHasLocation(){
        mobile.setLocation("Agege");
        assertEquals("Agege",mobile.checkLocation());
    }
}
