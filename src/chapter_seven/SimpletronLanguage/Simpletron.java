package chapter_seven.SimpletronLanguage;

import java.util.Arrays;
import java.util.Scanner;

public class Simpletron {
    String [] memory = new String[100];
    private String value;
    String accumulator = "+0000";
    int currentMemoryLocation = 0;

    public Simpletron(){
        Arrays.fill(memory, "+0000");
    }

    public void checkOutTheOperation(String input){
        int operationCode = Integer.parseInt(input.substring(1, 3));
        int memoryLocation = Integer.parseInt(input.substring(3));
        if (operationCode == OperationCode.READ.value){
            collectionInput();
            read(memoryLocation);
        } else if (operationCode == OperationCode.WRITE.value) {
            System.out.println(write(memoryLocation));
        } else if (operationCode == OperationCode.LOAD.value) {
            load(memoryLocation);
        } else if (operationCode == OperationCode.STORE.value) {
            store(memoryLocation);
        }else if (operationCode == OperationCode.SUBTRACT.value){
            subtraction(memoryLocation);
        } else if (operationCode == OperationCode.DIVIDE.value) {
            division(memoryLocation);
        } else if (operationCode == OperationCode.ADD.value) {
            add(memoryLocation);
        } else if (operationCode == OperationCode.MULTIPLY.value) {
            multiply(memoryLocation);
        } else if (operationCode == OperationCode.BRANCH.value) {
            branch(memoryLocation);
        } else if (operationCode == OperationCode.BRANCHNEG.value) {
            branchNeg(memoryLocation);
        } else if (operationCode == OperationCode.BRANCHZERO.value) {
            branchZero(memoryLocation);
        } else if (operationCode == OperationCode.HALT.value) {
            halt();
        }
    }

    private void collectionInput() {
        System.out.println("Enter a number ");
        Scanner scanner = new Scanner(System.in);
        this.value = scanner.nextLine();
    }

    public void halt() {
        currentMemoryLocation = +9999;
    }

    public void branchZero(int memoryLocation) {
        int wordInAccumulator = Integer.parseInt(accumulator);
        if (wordInAccumulator == 0){
            currentMemoryLocation = memoryLocation;
        }
    }

    public void branchNeg(int memoryLocation) {
        int wordInAccumulator = Integer.parseInt(accumulator);
        if (wordInAccumulator < 0){
            currentMemoryLocation = memoryLocation - 1;
        }
    }

    public void branch(int memoryLocation) {
        currentMemoryLocation = memoryLocation;
    }

    public void multiply(int memoryLocation) {
        String word = this.memory[memoryLocation];
        int multiply = Integer.parseInt(this.accumulator) * Integer.parseInt(word);
        accumulator = String.valueOf(multiply);
        if (accumulator.charAt(0) != '-'){
            accumulator = "+" + accumulator;
        }
        if (accumulator.length() < 5){
            accumulator = padWordWithZero(accumulator);
        }else accumulator = accumulator.substring(0, 5);
    }

    public void add(int memoryLocation) {
        String words = this.memory[memoryLocation];
        int sum = Integer.parseInt(accumulator) + Integer.parseInt(words);
        this.accumulator = String.valueOf(sum);
        if (this.accumulator.charAt(0) != '-'){
            this.accumulator = "+" + this.accumulator;
        }
        if (this.accumulator.length() < 5){
            this.accumulator = padWordWithZero(this.accumulator);
        }else {
            this.accumulator = this.accumulator.substring(0, 5);
        }
    }

    public void division(int memoryLocation){
        int valueInMemory = Integer.parseInt(this.memory[memoryLocation]);
        if (valueInMemory == 0){
            throw new ArithmeticException("Value contain zero");
        }
        int division = Integer.parseInt(this.accumulator) / valueInMemory;
        this.accumulator = String.valueOf(division);
        if (accumulator.charAt(0) != '-'){
            accumulator = "+" + accumulator;
        }
        if (accumulator.length() < 5){
            accumulator = padWordWithZero(accumulator);
        }
    }

    public void subtraction(int memoryLocation) {
        int valueInAccumulator = Integer.parseInt(this.accumulator);
        int valueInMemoryLocation = Integer.parseInt(this.memory[memoryLocation]);
        valueInAccumulator -= valueInMemoryLocation;
        this.accumulator = String.valueOf(valueInAccumulator);
        if (this.accumulator.charAt(0) != '-'){
            this.accumulator = "+" + accumulator;
        }
        if (this.accumulator.length() < 5){
            this.accumulator = padWordWithZero(accumulator);
        }
    }

    public void store(int memoryLocation) {
        memory[memoryLocation] = accumulator;
    }

    public void load(int memoryLocation) {
        accumulator = memory[memoryLocation];
    }

    public void read(int memoryLocation) {
        if (value.charAt(0) != '+' && value.charAt(0) != '-'){
            value = "+" + value;
        }
        int valueLength = value.length();
        if (valueLength < 5){
            value = padWordWithZero(value);
        }
        memory[memoryLocation] = value;
    }
    private static String padWordWithZero(String value) {
        int valueLength;
        char operationSign = value.charAt(0);
        value = value.substring(1);
        valueLength = value.length();
        while (valueLength < 4) {
            value = "0" + value;
            valueLength = value.length();
        }
        value = operationSign + "" + value;
        return value;
    }

    public String write(int memoryLocation){
        return memory[memoryLocation];
    }

    public void setValue(String value) {
        if (value.length() <= 4){
            this.value = value;
        }else {
            this.value = "0000";
        }
    }
    public void run(){
        memory[0] = "+1009";
        memory[1] = "+1010";
        memory[2] = "+2009";
        memory[3] = "+3110";
        memory[4] = "+4107";
        memory[5] = "+1109";
        memory[6] = "+4300";
        memory[7] = "+1110";
        memory[8] = "+4300";
        while (currentMemoryLocation < 9999){
            String instructionRegister = memory[currentMemoryLocation];
            checkOutTheOperation(instructionRegister);
            currentMemoryLocation++;
        }
    }

    public void readTenNumbersAndSum(){
        for (int count = 0; count < 10; count++){
            memory[count] = "+" + (1025 + count);
        }
        int counter = 11;
        memory[10] = "+" + 2025;
        for (int count = 0; count < 10; count++){
            memory[counter] = "+" + (3026 + count);
            counter++;
        }
        memory[22] = "+2150";
        memory[23] = "+1150";
        memory[24] = "+4300";
        while (currentMemoryLocation < 9999){
            String instructionRegister = memory[currentMemoryLocation];
            checkOutTheOperation(instructionRegister);
            currentMemoryLocation++;
        }
    }

    public void readSevenNumberAndGetAverage(){
        memory[50] = "+0007";
        int count;
        for (count = 0; count < 7; count++) {
            memory[count] = "+" + (1025 + count);
        }
        memory[count++] = "+2025";
        for (int counter = 0; counter < 6; counter++){
            memory[count] = "+" + (3026+counter);
            count++;
        }
        memory[14] = "+3250";
        memory[15] = "+2155";
        memory[16] = "+1155";
        memory[17] = "+4300";
        while (currentMemoryLocation< 9999){
            String instructionRegister = memory[currentMemoryLocation];
            checkOutTheOperation(instructionRegister);
            currentMemoryLocation++;
        }
    }

    public void checkForTheHighestNumber(){
        memory[0] = "+1070";
        checkOutTheOperation(memory[currentMemoryLocation]);
        int value = Integer.parseInt(memory[70]);
        int count;
        int stopper = value * value + 15;
        for (count = 0; count < value; count++){
            memory[count] = "+10"+ (value * value + count + 15);
        }
        memory[count++] = "+20" + (value * value+15);
        memory[count++] = "+2199";
            for (int counts = 0; counts < value -1; counts++){
                for (int inner = 0; inner < 6; inner++){
                    if (inner == 0) memory[count++] = "+31"+ (++stopper);
                    else if (inner == 1) memory[count++] = "+41" + (count + 2);
                    else if (inner == 2) memory[count++] = "+2099";
                    else if (inner == 3) memory[count++] = "+40"+ (count+1);
                    else if (inner == 4) memory[count++] = "+20" + stopper;
                    else memory[count++] = "+2199";
                }
            }
            memory[count++] = "+1199";
            memory[count++] = "+4300";
        while (currentMemoryLocation< 9999){
            String instructionRegister = memory[currentMemoryLocation];
            checkOutTheOperation(instructionRegister);
            currentMemoryLocation++;
        }

    }
}
