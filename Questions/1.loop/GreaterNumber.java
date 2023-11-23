import java.util.*;

//code to find the greater number among three numbers and all the numbers are unique.
public class GreaterNumber {       //class name should be the same as file name if its not then file will not run
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter three numbers");
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        int num3 = scn.nextInt();

        if(num1 >= num2){
            //num1 is greater from num2
            if(num1 >= num3){
                //num1 is greater from num2 and num3 
                System.out.println(num1 + " is greater");
            }else{
                System.out.println(num3 + " is greater");
            }
        }else{
            //num2 is greater from num1
            if(num2 >= num3){
                //num2 is greater from num1 and num3
                System.out.println(num2 + " is greater");
            }else{
                System.out.println(num3 + " is greater");
            }
        }
        scn.close(); //closes the scn object
    }    
}
