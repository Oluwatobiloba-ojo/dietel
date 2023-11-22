package classwork;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProblemTest {

    @Test
    public void testThatProblemHasANameAndAType(){
        Problem problem = new Problem("broke", Type.FINANCIAL);
        assertEquals("broke", problem.getName());
        assertEquals(Type.FINANCIAL, problem.getType());
    }

    @Test
    public void testForATotalDifferentNameAndType(){
        Problem problem = new Problem("Dull", Type.SPIRITUAL);
        assertEquals("Dull", problem.getName());
        assertEquals(Type.SPIRITUAL, problem.getType());
    }

    @Test
    public void testThatAPersonCanAddProblemToHisListOfProblem(){
        Person person = new Person();
        Problem problem = new Problem("dull", Type.FINANCIAL);
        Problem problemA = new Problem("lowSpirit", Type.SPIRITUAL);
        person.add(problem);
        person.add(problemA);
        int lengthOfProblem = person.getProblem().size();
        assertEquals(lengthOfProblem, 2);
    }

    @Test
    public void testThatAProblemCanBeSolvedWhenItsAdded(){
        Person person = new Person();
        Problem problem = new Problem("Proud", Type.BUSINESS);
        Problem secondProblem = new Problem("Failure", Type.EDUCATION);
        person.add(problem);
        person.add(secondProblem);
        assertEquals(2, person.getProblem().size());
        person.solve(problem);
        assertEquals(1, person.getProblem().size());
    }

    @Test
    public void testForTheCountOfUnsolvedProblem(){
        Person person = new Person();
        Problem problem = new Problem("Broke", Type.FINANCIAL);
        Problem problem1 = new Problem("Greedy", Type.SPIRITUAL);
        Problem problem2 = new Problem("Proud of knowledge", Type.EDUCATION);
        person.add(problem);
        person.add(problem1);
        person.add(problem2);
        person.solve(problem2);
        assertEquals(2, person.getUnsolvedProblem().size());
    }

}