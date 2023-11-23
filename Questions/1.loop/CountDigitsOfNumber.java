import java.util.*;

public class CountDigitsOfNumber {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Number");
        int number = scn.nextInt();
        //function gets called to get no of digits in the number
        int count = countDigits(number);
        System.out.println("The Number of Digits in " + number + " is " + count);
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
}
