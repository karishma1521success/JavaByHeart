import java.util.*;
//find out all the prime factors of number n . 
//n = 18 --  2, 3, 3       n = 25  -- 5, 5 
public class PrimeFactorization {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        //note - all factors of any number is less than or equal to the root of that number
        // factors <= root of number
        for(int factor = 2; factor * factor <= number ; factor++){
            while(number % factor == 0){
                number = number / factor;
                System.out.print(factor + " ");
            }
        }
         // if number != 1 then number is not factorized completely last number is left which is a prime number
         if(number != 1){
            System.out.print(number);
         }
         scn.close();
    }
    
}
