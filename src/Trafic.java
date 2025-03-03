class Status extends Thread{
    private String status;

    Status(String status){
        this.status = status;
    }
    @Override
    public void run() {
        System.out.println(status);
        try{
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

public class Trafic {
    public static void main(String[] args) {
        Status G = new Status("Green");
        Status Y = new Status("Yellow");
        Status R = new Status("Red");

        G.start();
        Y.start();
        R.start();
    }
}
