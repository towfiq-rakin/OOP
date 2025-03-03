public class TryCatch {
    public static void main(String[] args){
        try{
            int data = 50/0;
            int[] a = {1, 2, 3};
            System.out.println(a[10]);
        }catch(ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        System.out.println("Safe end of program");
    }
}
