import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // Build a Scanner
        Scanner sc = new Scanner(System.in);
        
        // Read the inputs
        int units = sc.nextInt();
        double bill = 0;
        
        // Logic
        if(units<=50){
            bill = units*0.50;
        }
        else if(units<=150){
            bill = 50*0.50 + (units-50)*0.75;
        }
        else if(units<=250){
            bill = 50*0.50 + 100*0.75 + (units-150)*1.20;
        }
        else{
            //beyon 250
            bill = 50*0.50 + 100*0.75 + + 100*1.20 + (units-250)*1.50;
        }
        
        //20% tax
        bill = (1.2)*bill; 
        int final_bill = (int)bill;
        System.out.println(final_bill);
    }
}
