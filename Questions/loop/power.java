import java.util.*;
public class Power {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        int powerValue = scn.nextInt();
        int power = number;
        for(int i=1; i< powerValue; i++){
            power = power * number;
        }
        System.out.println(power);
        scn.close();
    }

}
