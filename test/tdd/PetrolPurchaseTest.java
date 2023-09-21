package tdd;

import chapterthree.PetrolPurchase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PetrolPurchaseTest {
    PetrolPurchase mobile;
    @BeforeEach
    public void setOn(){
        mobile = new PetrolPurchase("Ijebu", "Bitumen",
                2,500, 7);
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
        assertEquals("Agege",mobile.getLocation());

        mobile.setPercentageDiscount(9);
        assertEquals(9, mobile.getPercentageDiscount());

        mobile.setPricePerLitre(500);
        assertEquals(500, mobile.getPricePerLitre());

        mobile.setQuantityPurchaseLitre(5);
        assertEquals(5, mobile.getQualityPurchaseLitre());
    }
    @Test
   public void testThatPetrolCanCalculatePurchaseAmountOfThePetrol(){
        mobile.setPercentageDiscount(9);
        assertEquals(0.09, mobile.getPercentageDiscount());

        mobile.setPricePerLitre(500);
        assertEquals(500, mobile.getPricePerLitre());

        mobile.setQuantityPurchaseLitre(5);
        assertEquals(5, mobile.getQualityPurchaseLitre());

        double amount = mobile.getPurchaseAmount();
        assertEquals(2275, amount);
    }
}
