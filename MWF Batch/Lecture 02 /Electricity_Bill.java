import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){
        
        Scanner myScanner = new Scanner(System.in);
        int units = myScanner.nextInt();
        
        float ans;
        
        if(units<=50){
            ans = 0.50f * units;
        }
        else if(units<=150){
            ans = 0.50f*50 + (units-50)*0.75f;
        }
        else if(units<=250){
            ans = 0.50f*50 + 0.75f*100 + (units - 150)*1.20f;
        }
        else{
            ans = 0.50f*50 + 0.75f*100 + 100*1.20f + (units - 250)*1.50f;
        }
        
        //Adding the Surcharge and rounding it off using typecasting
        int bill = (int)(1.2f*ans);
        System.out.println(bill);
        
    }
}
