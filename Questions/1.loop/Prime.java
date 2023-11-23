import java.util.*;
public class Prime {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scn.nextInt();    //number to check whether it's a prime or not
        if(number==2 || number==3){
            System.out.println("The given number is Prime");
        }else{
           //brute approach
           isPrimeBrute(number); 
           //optimal approach  
           isprimeOptimial(number);
            
        }
        scn.close();
    }


public static void isPrimeBrute(int number){
    int flag = 1;  //prime
            for(int i=2;i<number;i++){  //or search till n i<=number/2
                if(number%i==0){ //means that number is got divisibe by some number from 2 to number-1
                    System.out.println("The given number is not prime");
                    flag = 0;
                    break;
                }
            }
            if(flag == 1){
                //number didn't get divisble by any of the number means it's a prime number
                System.out.println("The given number is prime");
            }
    }

    public static void isprimeOptimial(int number){
        int flag = 1;  //prime
            for(int i=2;i*i<= number;i++){
                if(number%i==0){ //means that number is got divisibe by some number from 2 to number-1
                    System.out.println("The given number is not prime");
                    flag = 0;
                    break;
                }
            }
            if(flag == 1){
                //number didn't get divisble by any of the number means it's a prime number
                System.out.println("The given number is prime");
            }
    }
}