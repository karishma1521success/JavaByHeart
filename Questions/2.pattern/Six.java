import java.util.*;
public class Six {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter an odd number : ");
        int n = scn.nextInt();// input and it must be an odd number
        //do the code for 1st row
        int row = 1, nspaces = 1, nstars = 6;
        while(row<=n){
            //print half stars
            for(int star = 1; star <= nstars/2; star++){
                System.out.print("* ");
            }
            //spaces 
            for(int space = 1; space <= nspaces; space++){
                System.out.print("  ");
            }
            //print another half stars
            for(int star = 1; star <= nstars/2; star++){
                System.out.print("* ");
            }

            //move into a next row
            System.out.println();

            //preparation for the next row
            if(row <= n/2){
                nspaces = nspaces + 2;
                nstars = nstars -2;
            }else{
                nspaces = nspaces - 2;
                nstars = nstars + 2;
            }
            row++;
            
        }
        scn.close();

    }
}

//pattern 

// * * *   * * *
// * *       * *
// *           * 
// * *       * *
// * * *   * * *
