import java.util.*;
public class Five {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(); //input and the value of n should be odd
        //prepare row 1 
        int row  = 1, nspaces = 2, nstars = 1;
        while(row <= n){
            //spaces
            for(int space = 1; space<=nspaces; space++){
                System.out.print("  ");
            }
            //stars
            for(int star=1; star <= nstars; star++){
                System.out.print("* ");
            }
            // go to the next line
            System.out.println();

            //prepare for the next row
            if(row <= n/2){
                nspaces = nspaces - 1;
                nstars = nstars + 2;
            }else{
                nspaces = nspaces + 1;
                nstars = nstars - 2;
            }

            row++;
            
        }
        scn.close();

    }
}


//question  -   take all the values for row 1 and prepare the next row with the logic the logic that 
//first half of space is decreasing by 1 and stars and inceasing by 2 
//second half of space is increasing by 1 and stars are decreasing by2

//                                row      spaces     stars      
//         *                      1         2           1
//      *  *  *                   2         1           3
//   *  *  *  *  *                3         0           5
//      *  *  *                   4         1           3
//         *                      5         2           1           