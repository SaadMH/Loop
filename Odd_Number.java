package Loop;

import java.util.Scanner;

public class Odd_Number {

    public static void main(String[] args) {
    
    Scanner input=new Scanner(System.in);     
   
    int i, number;
    System.out.print("Enter Number=");
    number=input.nextInt();
   
    for(i=1; i<number; i+=2)
       {
       System.out.println(i+"");
       }
    
    }
    
}
