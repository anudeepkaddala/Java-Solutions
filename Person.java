public class Person{
    String name;
    long mobile;
    Person(String name, long mobile){
        this.name=name;
        this.mobile=mobile;
    }
    public String toString(){
        return name+" "+mobile;
    }
    public static void main(String args[]){
        Person p1=new Person("Zaheer",943211L);
        System.out.println(p1);
        System.out.println(p1.toString());
    }
}