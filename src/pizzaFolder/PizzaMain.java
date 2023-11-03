package pizzaFolder;

import java.util.HashMap;
import java.util.Scanner;

import static pizzaFolder.PizzaApp.myPizza;

public class PizzaMain {
    static Scanner scanner = new Scanner(System.in);
   private final HashMap <String, Integer> boxValue = new HashMap<>();
   private final HashMap<String, Integer> boxPrice = new HashMap<>();
   final int SIZEOFSUPERHUNGRY = 4;
   final int SIZEOFHUNGRY = 2;
   final int SIZEOFCLASSIC = 1;

    public PizzaMain(){
        boxValue.put("BIG", 10);
        boxValue.put("MEDIUM", 6);
        boxValue.put("SMALL", 4);

        boxPrice.put("BIG", 5000);
        boxPrice.put("MEDIUM", 3000);
        boxPrice.put("SMALL", 1200);
    }

    public int pizzaBoxValue(String size) {
        size = size.toUpperCase();
        if (boxValue.containsKey(size)) return boxValue.get(size);
        else return 0;
    }

    public int calculateNumberOfSlices(int superHungry, int hungry, int classic) {
        if (superHungry >= 0 && hungry >= 0 && classic >= 0) {
            return (SIZEOFSUPERHUNGRY * superHungry) + (SIZEOFHUNGRY * hungry) + (SIZEOFCLASSIC * classic);
        }else return -1;
    }

    public int calculateNumberOfBoxes(int superHungry, int hungry, int classic, String size) {
        int returnBox = 0;
        int valueOfBoxSize = pizzaBoxValue(size);
        int sumOfSlices = calculateNumberOfSlices(superHungry, hungry, classic);
        while (sumOfSlices >= valueOfBoxSize){
            sumOfSlices -= valueOfBoxSize;
            returnBox++;
        }
        if (sumOfSlices != 0){
            returnBox++;
        }
        return returnBox;
    }

    public int calculateRemains(int superHungry, int hungry, int classic, String size) {
       int slices =  calculateNumberOfSlices(superHungry, hungry, classic);
       int amountOfSliceInBox = calculateNumberOfBoxes(superHungry, hungry, classic, size) * pizzaBoxValue(size);
        return amountOfSliceInBox - slices;
    }

    public int calculateTotalPrize(int superHungry, int hungry, int classic, String size) {
        return calculateNumberOfBoxes(superHungry,hungry,classic,size) * boxPrice.get(size.toUpperCase());
    }



    static void printOutTheOutPut(PizzaMain myPizza, int superHungry, int hungryPeople, int classicPeople, String size) {
        System.out.printf("""
                =============================
                PIZZA SHOPPING LIST FOR CHILD
                        OF GOD
                =============================
                Number of Slices: %d
                Number of Boxes: %d
                Number Of Excess Slices: %d
                Number Of Total Cost: $%d
                """, myPizza.calculateNumberOfSlices(superHungry, hungryPeople, classicPeople)
                , myPizza.calculateNumberOfBoxes(superHungry, hungryPeople, classicPeople, size)
                , myPizza.calculateRemains(superHungry, hungryPeople, classicPeople, size)
                , myPizza.calculateTotalPrize(superHungry, hungryPeople, classicPeople, size));
    }


    static int getNumberOfPeople(String firstMessage, String message) {
        System.out.println(firstMessage);
        int superHungry = scanner.nextInt();
        superHungry = validateThePeople(superHungry, message);
        return superHungry;
    }

    private static String validateSizeOfBox(PizzaMain myPizza, String size, Scanner scanner) {
        while (myPizza.pizzaBoxValue(size) == 0){
            System.out.println("Enter a valid size of box which are Medium, Big and small: ");
            size = scanner.nextLine();
        }
        return size;
    }
    private static int validateThePeople(int value, String message){
        while (value < 0){
            System.out.println("Invalid input");
            System.out.println(message);
            value = scanner.nextInt();
        }
        return value;
    }
    static String collectInputForSize(){
        System.out.println("Enter the size of box you want to picked: ");
        String size = scanner.nextLine();
        size = validateSizeOfBox(myPizza, size, scanner);
        return size;
    }
}
