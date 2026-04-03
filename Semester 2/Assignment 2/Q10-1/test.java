package Assignment2.Q10$1;

public class Test extends Student{
    public int mark1;
    public int mark2;
    public void inputDetails(String name , int roll ,int mark1, int mark2) {
        super.inputDetails(name, roll);;
        this.mark1 = mark1;
        this.mark2 = mark2;
    }
    public void showDetails(){
        System.out.println("mark1 = "+this.mark1 );
        System.out.println("mark2 = "+ this.mark2);
    }

    
}
