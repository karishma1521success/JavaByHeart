import java.util.*;
public class Gcd {
    public static void main(String[] args){
        //GCD is based on the Eculidean algorithm where it says that we divide a number until the number gets 0 and at that time the divisor will be the gcd of that two numbers.
        Scanner scn = new Scanner(System.in);
        int number1 = scn.nextInt();
        int number2 = scn.nextInt();
        int lcm =  number1 * number2 ;

        while((number2 % number1) != 0 ){
            int remainder = number2 % number1 ;
            number2 = number1;
            number1 = remainder;
        }
        int gcd = number1;
        System.out.println("The gcd of two numbers is " + number1);

        //LCM can be calcuated using  gcd*Lcm = n1 * n2
        lcm = lcm / gcd;
        System.out.println("The Lcm of two number is " + lcm); 
        scn.close();

    }
    
}
