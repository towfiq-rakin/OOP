class Person{
    int id;
    String name;
    int i =10;
    Person(int id,String name){
        this.id=id;
        this.name=name;
        System.out.println(id+" "+name);
    }
}
class Emp extends Person{
    float salary;
    int i = 20;
    Emp(int id,String name,float salary){
        super(id,name);
        this.salary=salary;
    }
    void display(){
        System.out.println(id+" "+name+" "+salary + " " + super.i);
    }
}
public class Super{
    public static void main(String[] args){
        Emp e1=new Emp(1,"CR Muhit",45000);
        e1.display();
    }
}