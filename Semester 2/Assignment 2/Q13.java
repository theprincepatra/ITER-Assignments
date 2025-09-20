
package Assignment2;

import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank[] b = new Bank[5];
        for (int i = 0; i < b.length; i++) {
            b[i] = new Bank();
            System.out.println("Enter the name of the bank ");
            b[i].setBankName(sc.nextLine());
            System.out.println("Enter the amount to be deposited");
            b[i].setDepositAmount(sc.nextDouble());
            sc.nextLine();

        }
        minDeposite(b);
        sc.close();
        
    }
    static void minDeposite(Bank[] b){
        int min = 0;
        for (int i = 0; i < b.length; i++) {
            if(b[i].depositAmount < min){
                min = i;
            }
        }
        System.out.println(b[min].bankName);
    }

}
class Bank {
    String bankName ;
    double depositAmount ;
    static double totalAmount;
    public void setBankName(String bankName ){
        this.bankName =bankName;
    }
    public void setDepositAmount (double depositAmount){
        this.depositAmount =depositAmount;
        totalAmount += depositAmount;
    }

    public void showData(){
        System.out.println("Bank Name = "+this.bankName);
        System.out.println("Deposit Amount = "+this . depositAmount);
    }
}
/*
Output:-
Enter the name of the bank 
HDFC
Enter the amount to be deposited
10000
Enter the name of the bank 
ICICI
Enter the amount to be deposited
4567
Enter the name of the bank 
YES BANK
Enter the amount to be deposited
9450   
Enter the name of the bank 
PNB
Enter the amount to be deposited
5679563
Enter the name of the bank 
AXIS BANK
Enter the amount to be deposited
49765
HDFC
 */
