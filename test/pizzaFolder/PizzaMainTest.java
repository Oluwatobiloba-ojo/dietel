package pizzaFolder;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PizzaMainTest {
    pizza_main my_pizza;
    @BeforeEach
    public void setMy_pizza(){
        my_pizza = new pizza_main();
    }

    @Test
    public void testForWhenIPutInTheBoxSizeIGetToGetTheValueOfTheSize(){
       assertEquals(10, my_pizza.pizzaBoxValue("Big"));
    }

    @Test
    public void testForWhenIPutInTheBoxSizeIGetTheValueOfTheSize(){
        assertEquals(6, my_pizza.pizzaBoxValue("Medium"));
    }

    @Test
    public void testForWhenIPutInAWrongBoxSizeIGetZero(){
        assertEquals(0, my_pizza.pizzaBoxValue("Extra Large"));
    }

    @Test
    public void testForWhenIPutALowerCaseOfBoxSizeIGetTheValueOfTheSize(){
        assertEquals(6, my_pizza.pizzaBoxValue("medium"));
    }

    @Test
    public void testForTheCalculationOfNumberOfSlicesNeeded(){
        assertEquals(65, my_pizza.calculateNumberOfSlices(10, 10, 5));
    }

    @Test
    public void testForTheCalculationOfNumberOfSlices(){
        assertEquals(70, my_pizza.calculateNumberOfSlices(10, 10, 10));
    }

    @Test
    public void testForTheCalculationOfNumberOfSlicesWhenTheyInputNegativeValue(){
        assertEquals(0, my_pizza.calculateNumberOfSlices(-10, -10, -10));
    }

    @Test
    public void testForTheCalculationForGettingTheNumberOfBoxesNeeded(){
        assertEquals(7, my_pizza.calculateNumberOfBoxes(10, 10, 5, "Big"));
    }

    @Test
    public void testForTheCalculationForGettingTheNumberOfBoxesNeededWhenBoxSizeIsMedium(){
        assertEquals(11, my_pizza.calculateNumberOfBoxes(10, 10, 5, "medium"));
    }

    @Test
    public void testForTheCalculationForGettingTheNumberOfBoxesNeededIfSizeIsSmall(){
        assertEquals(17, my_pizza.calculateNumberOfBoxes(10, 10, 5, "small"));
    }
}