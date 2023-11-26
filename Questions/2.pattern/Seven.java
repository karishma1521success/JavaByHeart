import java.util.*;

public class Seven {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int row = 1, nspaces = n/2, nstars = 1;
        while(row <= n){
            //spaces
            for(int space = 1; space <= nspaces; space++){
                System.out.print("  ");
            }
            //stars
            for(int star = 1; star <= nstars; star++){
                System.out.print("* ");
            }
            //next line
            System.out.println();

            row++;

            //preparation for next row
            if(row <= n/2){ //upper half
                nstars = nstars + 1;
            }else if(row == n/2 + 1){// middle row
                nspaces = 0;
                nstars = n;
            }else if(row == n/2 + 1 + 1){//next row to the middle row means if n = 7 then row = 5
                nspaces = n/2; 
                nstars = n/2;
            }else{
                nstars--;
            }
            scn.close();

        }
    }
}
