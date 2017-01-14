package Loop;

import java.util.Scanner;

public class Sum_Average {

    public static void main(String[] args) {
    
    int number, digit, sum=0, average, i = 1;
    Scanner input=new Scanner(System.in);
    
    System.out.println("Enter Digit");
    number=input.nextInt();
    
    System.out.println("Enter"+number+"Digit");
    
    while(i<=number)
         {
         digit=input.nextInt();
         sum=sum+digit;
         i++;
         }    
    average=sum/number;
    System.out.print("Sum="+sum+"Average="+average);
    
    }    
}
