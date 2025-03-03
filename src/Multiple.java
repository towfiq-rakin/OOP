interface Printable{
    void print();
}
interface Showable{
    void show();
    default void display() {};
}
public class Multiple implements Printable,Showable{
    public void print(){
        System.out.println("CR ");
    }
    @Override
    public void show(){
        System.out.println("Muhit");
    }
    public void display(){
        System.out.println("CR Muhit");
    }

    public static void main(String[] args){
        Multiple obj = new Multiple();
        obj.print();
        obj.show();
        obj.display();
    }
}