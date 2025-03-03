
public class Matrix {
    public static void main(String[] args){
        int[][] array = {
            {0},
            {1, 2},
            {3, 4, 5},
            {6, 7, 8, 9}
        };

        for(int[] i: array){
            for(int j: i){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
