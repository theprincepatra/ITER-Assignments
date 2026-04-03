package Assignment3;

public class HQ3 {
    public static void main(String[] args) {
    int n = 1+(int)(Math.random()*12);
    String mounth ="";
    switch (n) {
        case 1:
            mounth ="January";
            break;
        case 2:
            mounth ="February";
            break;
        case 3:
            mounth ="March";
            break;
        case 4:
            mounth ="April";
            break;
        case 5:
            mounth ="May";
            break;
        case 6:
            mounth ="June";
            break;
        case 7:
            mounth ="July";
            break;
        case 8:
            mounth ="August";
            break;
        case 9:
            mounth ="September";
            break;
        case 10:
            mounth ="October";
            break;
        case 11:
            mounth ="November";
            break;
        case 12:
            mounth ="December";
            break;
        
    }
    System.out.println(mounth);
    }
}

// Sample output 
// February
