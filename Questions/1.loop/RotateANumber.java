//We have given a number and value of K (no of rotation if k = +ve (right rotations) , k= -ve (left rotaions) )
//Step 1. find actual no of rotation = k % (no of digits); 
//step 2. if actual rotation - -ve then actual rotation = count + actual rotation;
//Step 2. if K = 0 (no changes) ans = number
//Step 3. if K > 0 (then ans = (n % pow(10,k) * pow(10,count - k)) + n / pow (10,k)) if n-12345  , k=2  then  45*1000 + 123 
import java.util.*;
public class RotateANumber {
    public static void main(String[] args){
        Scanner scn  = new Scanner(System.in);
        //Take an input Number N and input of K
        int number = scn.nextInt();
        int rotations = scn.nextInt();
        //Find ACtual no. of rotaions because it repeat after the certain rotations and for that find no. of digits in number
        int count = countDigits(number);
        int actual_rotation = rotations % count;
        if(actual_rotation < 0){
            //then convert negative rotation into postive logical one
            //because left rotation at some point will match the right rotation value
            actual_rotation = actual_rotation + count;
            //by doing so we have to work for the the +ve rotations 1
        }
         System.out.println(actual_rotation);
        

         if(actual_rotation == 0){
            System.out.println("The rotation of number " + number + " at " + rotations + " times is " + number);
         }else{
            //positive - right rotations.
            int temp1 = (int)Math.pow(10,actual_rotation);   //pow(10,k)
            int temp2 = (int)Math.pow(10,(count-actual_rotation));  //pow(10,c-k)
            int rotatedNumber = (number % temp1) * temp2 + (number / temp1); 
            System.out.println(rotatedNumber);
         }
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
