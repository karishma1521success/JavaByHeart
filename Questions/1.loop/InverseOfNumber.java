import java.util.*;
public class InverseOfNumber {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scn.nextInt();     //number to be inverse
        int inverseOfANumber = inverseNumber(number);
        System.out.println("The inverse of a "+ number + " is " +  inverseOfANumber);
        scn.close();
    }


    //Time complexity  is O(Total number Of digits);
    //space complexity is O(1);
    public static int inverseNumber(int number){
        int inverse = 0;
        int position = 1; 
        while(number != 0){
            int digit = number % 10;
            inverse = inverse + (position * (int)Math.pow(10,digit-1));
            position++;
            number = number/10;
        }
        return inverse;
    }
}
