package chibuzorarrayexcercise;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static chibuzorarrayexcercise.StudentGradeFunction.*;
import static org.junit.jupiter.api.Assertions.*;

class StudentGradeFunctionTest {
    @Test
    public void testForPositionOfAGrade(){
        int [] totalSum = {137, 216, 154, 227};
        int [] answer = {4, 2, 3, 1};
        int [] result = StudentGradeFunction.calculatePosition(totalSum);
        assertArrayEquals(answer, result);
    }
    @Test
    public void testForPosition2OfAGrade(){
        int [] total = {227, 227, 137, 216};
        int [] answer = {1, 1, 4, 3};
        int [] result = StudentGradeFunction.calculatePosition(total);
        assertEquals(answer[0], result[0]);
        assertEquals(answer[1], result[1]);
        assertEquals(answer[2], result[2]);
        assertEquals(answer[3], result[3]);
    }

    @Test
    public void testForSumOfAList(){
        int [] scores = {34, 25, 56, 78};
        int result = StudentGradeFunction.calculateTotalScore(scores);
        int answer = Arrays.stream(scores).sum();
        assertEquals(result, answer);
    }
    @Test
    public void testForTheNumbersOfStudentWhoPassesScoreInAnArray(){
        int [] scores = {67, 98, 93, 78};
        assertEquals(4,calculateStudentPasses(scores));
    }
    @Test
    public void testForTheAmountOfStudentWhoFailedScoreInAnArray(){
        int [] scores = {67, 98, 93, 78};
        assertEquals(0,calculateStudentFailure(scores));
    }
    @Test
    public void testForTheLowestStudentByTheColumnInACollectionOfScores(){
        int [] scores = {67, 98, 93, 78};
        assertEquals(1, calculateLowestStudent(scores));
    }
    @Test
    public void testForTheLowestStudentByTheColumnInACollectionOfScores2(){
        int [] scores = {67, 34, 21, 78};
        assertEquals(3, calculateLowestStudent(scores));
    }
    @Test
    public void testForTheLowestScore(){
        int [] scores = {67, 98, 93, 78};
        assertEquals(67, calculateLowerScore(scores));
    }
    @Test
    public void testForTheLowestScore2(){
        int [] scores = {67, 34, 21, 78};
        assertEquals(21, calculateLowerScore(scores));
    }
    @Test
    public void testForTheHighestStudentByTheColumn(){
        int [] scores = {67, 34, 21, 78};
        assertEquals(4, calculateHigherStudent(scores));
    }
    @Test
    public void testForTheHighestStudentByTheColumn2(){
        int [] scores = {67, 98, 93, 78};
        assertEquals(2, calculateHigherStudent(scores));
    }
    @Test
    public void testForTheHighestScore(){
        int [] scores = {67, 34, 21, 78};
        assertEquals(78, calculateHigherScore(scores));
    }
    @Test
    public void testForTheHighestScore2(){
        int [] scores = {67, 98, 93, 78};
        assertEquals(98, calculateHigherScore(scores));
    }
    @Test
    public void testForTheOverallLowestStudentByRowColumnAndTheScore(){
        int [][] grades = {{67, 21, 49}, {98, 62, 56}, {93, 34, 27}, {78, 83, 66}};
        int [] result  = {1, 2, 21};
        assertArrayEquals(result, calculateLowerStudentScore(grades));
    }
    @Test
    public void testForTheOverallHighestStudentByRowColumnAndTheScore(){
        int [][] grades = {{67, 21, 49}, {98, 62, 56}, {93, 34, 27}, {78, 83, 66}};
        int [] result = {2, 1, 98};
        assertArrayEquals(result, calculateHigherStudentScore(grades));
    }
    @Test
    public void testForTheOverallHighestStudentWithTheTotal(){
        int [][] grades = {{67, 21, 49}, {98, 62, 56}, {100, 78, 89}, {78, 83, 66}};
        int [] result = {3, 267};
        assertArrayEquals(result, calculateOverallStudentScore(calculateSum(grades)));
    }
    @Test
    public void testForTheOverallHighestStudentWithTheTotal2(){
        int [][] grades = {{67, 21, 49}, {98, 62, 56}, {93, 34, 27}, {78, 83, 66}};
        int [] result = {4, 227};
        assertArrayEquals(result, calculateOverallStudentScore(calculateSum(grades)));
    }
    @Test
    public void testForTheOverallLowestStudentAndItsTotalScore(){
        int [][] grades = {{67, 21, 49}, {98, 62, 56}, {93, 34, 27}, {78, 83, 66}};
        int [] result = {1, 137};
        assertArrayEquals(result, calculateOverallLowestStudentScore(calculateSum(grades)));
    }
    @Test
    public void testForTheOverallLowestStudentAndItsTotalScore2(){
        int [][] grades = {{67, 21, 49}, {50, 2, 50}, {93, 34, 27}, {78, 83, 66}};
        int [] result = {2, 102};
        assertArrayEquals(result, calculateOverallLowestStudentScore(calculateSum(grades)));
    }


}