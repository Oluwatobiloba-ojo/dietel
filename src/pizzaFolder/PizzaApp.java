package pizzaFolder;

import static pizzaFolder.PizzaMain.*;

public class PizzaApp {
   static PizzaMain myPizza = new PizzaMain();
    public static void main(String[] args) {
        PizzaMain myPizza = new PizzaMain();
        String size = collectInputForSize();
        int superHungry = getNumberOfPeople("Enter the number of Super Hungry People: ", "Enter number of Super Hungry People");
        int hungryPeople = getNumberOfPeople("Enter the number of Hungry People Highlighted: ", "Enter the number of hungry people");
        int classicPeople = getNumberOfPeople("Enter the number of classic people highlighted", "Enter the number of classic people");
        printOutTheOutPut(myPizza, superHungry, hungryPeople, classicPeople, size);
    }
}
