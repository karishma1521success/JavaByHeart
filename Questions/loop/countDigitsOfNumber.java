import java.util.*;

public class countDigitsOfNumber {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Number");
        int number = scn.nextInt();
        int copyOfNumber = number;
        int count = 0;
        while(copyOfNumber != 0){
            copyOfNumber = copyOfNumber/10;
            count++;
        }
        System.out.println("The Number of Digits in " + number + " is " + count);
        scn.close();
    }    
}
