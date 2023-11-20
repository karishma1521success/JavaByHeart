//We have given a number and value of K (no of rotation if k = +ve (right rotations) , k= -ve (left rotaions) )
//Step 1. find actual no of rotation = k % (no of digits);
//Step 2. if K = 0 (no changes) ans = number
//Step 3. if K > 0 (then ans = n % pow(10,k) + n / pow (10,k))
import java.util.*;
public class RotateANumber {
    public static void main(String[] args){
        Scanner scn  = new Scanner(System.in);
        //Take an input Number N and input of K
        int number = scn.nextInt();
        int rotations = scn.nextInt();
        //Find ACtual no. of rotaions because it repeat after the certain rotations and for that find no. of digits in number

        int actual_rotation = 
    }

    public static int CountDigits(int number){
        int count = 0;
        while(number != 0){
            number = number/10;
            count++;
        }
        return count;
    }
}
