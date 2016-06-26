package dima.lessons;

/**
 * Created by root on 5/19/16.
 */
public class L5SquareArray {

    public static void main(String[] args) {

        int [][] arr = new int[10][15];

       // System.out.println(arr.length);
        for (int i = 0; i<arr.length; i++){
            for (int j=0; j<arr[i].length; j++){
                arr[i][j]= (j+1);
                System.out.print( arr[i][j]+ ", ");
            }
            System.out.println("\n");

        }

        System.out.println("\n");

    }
}
