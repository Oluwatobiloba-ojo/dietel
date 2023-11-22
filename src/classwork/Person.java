package classwork;

import java.util.ArrayList;

public class Person {

    private ArrayList <Problem> problem = new ArrayList<>();

    public void add(Problem problem){
        this.problem.add(problem);
    }

    public ArrayList<Problem> getProblem(){
        return problem;
    }

    public void solve(Problem problem) {
        this.problem.remove(problem);
    }

    public ArrayList<Problem> getUnsolvedProblem() {
        return problem;
    }
}
