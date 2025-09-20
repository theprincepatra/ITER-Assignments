
package Assignment2;
import Assignment2.Q10$1.Test;
import Assignment2.Q10$2.Sports;

public class Q10 {
    public static void main(String[] args){
        Test obj = new Test();
        obj.inputDetails("Rahul" , 1 , 54 , 87);
        int totalMarks = obj.mark1 + obj.mark2 ;
        int totalScore = Sports.SCORE1 +Sports.SCORE2;
        obj.showDetails();
        System.out.println(totalMarks);
        System.out.println(totalScore);

    }
}

/*
Output:-
mark1 = 54
mark2 = 87
141
144
 */
