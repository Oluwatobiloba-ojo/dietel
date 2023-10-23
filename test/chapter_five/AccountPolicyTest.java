package chapter_five;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountPolicyTest {
    AccountPolicy myPolicy;
    @BeforeEach
    public void setMyPolicy(){
        myPolicy = new AccountPolicy(1111111, "Benz Camry", "New York");
        assertNotNull(myPolicy);
    }
    @Test
    public void testThatAccountPolicyExist(){
        assertNotNull(myPolicy);
    }
    @Test
    public void testForNewYorkHasAnAutoPolicyStatus(){
        myPolicy.setState("New York");
        boolean result = myPolicy.isNoFaultState();
        assertTrue(result);
    }
    @Test
    public void testThatMaineHasAnAutoPolicyStatus(){
        myPolicy.setState("Maine");
        boolean result = myPolicy.isNoFaultState();
        assertTrue(result);
    }
    @Test
    public void testForTheShortFormOfMaineWhichIsMEHasAnAutoPolicy(){
        myPolicy.setState("ME");
        boolean result = myPolicy.isNoFaultState();
        assertTrue(result);
    }
    @Test
    public void testThatNigeriaDoesNotHaveAnAutoPolicy(){
        myPolicy.setState("Nigeria");
        boolean result = myPolicy.isNoFaultState();
        assertFalse(result);
    }
    @Test
    public void testThatNewYorkWithSWillResultToFalse(){
        myPolicy.setState("New Yorks");
        boolean result = myPolicy.isNoFaultState();
        assertFalse(result);
    }

}