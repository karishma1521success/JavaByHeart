import java.util.*;
public class One {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for(int row=1; row<=n; row++){
            //loop will run n times because it has n rows
            // each row has stars and the     no. of stars = no. of row
            int numberOfStars = row;
            for(int star=1; star<= numberOfStars; star++){
                System.out.print("* ");
            }
            System.out.println();
        }

        scn.close();
    }
    
}



//Question: 
//  *
//  * *
//  * * * 
//  * * * * 
//  * * * * *      
// So this is the pattern  each  ith row has ith stars   1row = 1stars    2row = 2stars  and so on 5th row = 5stars

