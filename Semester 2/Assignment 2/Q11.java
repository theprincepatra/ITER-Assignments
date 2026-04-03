
package Assignment2;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] stud = new Student[5];
        for (int i = 0; i < stud.length; i++) {
            System.out.println("Enter the details");
            stud[i]  = new Student();
            stud[i].setdata(sc.nextInt(), sc.nextDouble());
        }
        
        double max = Math.max(stud[0].dsa_mark , Math.max(stud[1].dsa_mark, Math.max(stud[2].dsa_mark , Math.max(stud[3].dsa_mark, stud[4].dsa_mark) )));
        System.out.println("Dsa topper got "+ max +" marks");
        
        sc.close();
    }
}
class Student {
    int roll ;
    double dsa_mark;

    public void  setdata(int roll , double  dsa_marks){
        this.roll = roll ;
        this.dsa_mark = dsa_marks;
    }

    public void showdata(){
        System.out.println("Roll = "+ this.roll);
        System.out.println("DSA Marks = "+ this.dsa_mark);
    }
}

/*
Output:-
Enter the details
1
98
Enter the details
2
87
Enter the details
3
97
Enter the details
4
97
Enter the details
5
98.8
Dsa topper got 98.8 marks
 */
