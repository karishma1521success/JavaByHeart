//We have given a number and value of K (no of rotation if k = +ve (right rotations) , k= -ve (left rotaions) )
//Step 1. find actual no of rotation = k % (no of digits);
//Step 2. if K = 0 (no changes) ans = number
//Step 3. if K > 0 (then ans = (n % pow(10,k) * pow(10,count - k)) + n / pow (10,k)) if n-12345  , k=2  then  45*1000 + 123 
//step 4. if k < 0 then  ans = n%pow(10,c+k) * pow(10,k*-1) + n/pow(10,c+k);   c- count  , k - actual rotations  we do c+k because k - -ve  then (c-k) 
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
         System.out.println(actual_rotation);

         if(actual_rotation == 0){
            System.out.println("The rotation of number " + number + " at " + rotations + " times is " + number);
         }else if(actual_rotation > 0){
            //positive - right rotations.
            int rotatedNumber = ((number % (int)Math.pow(10,actual_rotation)) * (int)Math.pow(10,(count-actual_rotation))) + (number / (int)Math.pow(10,actual_rotation));
            System.out.println(rotatedNumber);
         }else{
            //negative - left rotations
            int rotatedNumber = number % (int)Math.pow(10,(actual_rotation+count)) * (int)Math.pow(10,actual_rotation*-1) + number / (int)Math.pow(10,(count+actual_rotation));
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
