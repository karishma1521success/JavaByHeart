import java.util.*;
//Take a number input and reverse that input number    398 --- 893
public class ReverseNumber {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Number");
        int number = scn.nextInt();
        //first we have to count the total number of digits so the we can create a reverse number for that we need the multiples of 10
        int totalDigits =  countDigits(number);
        System.out.println(totalDigits);
        int reversedNumber  = reversedDigits(number);
        System.out.println("The reversed number of "+number+ " is " + reversedNumber);
        scn.close();
        
    } 

    public static int countDigits(int number){
        int count = 0;
        while(number != 0){
            number = number/10;
            count++;
        }
        return count;
    }



    //optimal solution - can reversed the number without count of digits.
    public static int reversedDigits(int number){
        int reverseNumber = 0;
        while(number != 0){
            int digit = number % 10;
            reverseNumber = (reverseNumber * 10) + digit;
            number = number / 10 ;
        }
        return reverseNumber;
    }
}
