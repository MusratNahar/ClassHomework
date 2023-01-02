package example;
//3. Class, Object, constructor, Method & Variable
public class Employee {

    int id;
    String name;
    float salary;
    String fullname;
    int roll;
    Employee(int t, String m) {
        fullname=m;
        roll=t;


    }
    void insert(int i, String n,float s) {
        id=i;
        name=n;
        salary=s;

    }

    void display ()
    {
        System.out.println(id+" "+name+" "+salary);
        System.out.print(roll+ " "+fullname+" ");
    }

    public static void main(String[] args) {
        Employee e1= new Employee(11,"maria");
        Employee e2= new Employee(12,"selina");
       Employee e3= new Employee(14,"Jetlin");


        e1.insert(1,"k1",100);
        e2.insert(2,"k2",100);
        e3.insert(3,"k3",100);

        e1.display();
        e2.display();
        e3.display();


    }


















}
