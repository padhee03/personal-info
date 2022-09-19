 
 package interitance_example;

public class Example_main 
{
    public static void main(String args[])
    {
      child_class obj=new child_class(11,"xyz",12345.89);
        System.out.println(obj);
    }
}
class super_class
{
    int emp_id;
    String name;

    public super_class(int emp_id,String name) {
        this.emp_id = emp_id;
        this.name=name;
    }

    @Override
    public String toString() {
        return "super_class{" +
                "emp_id=" + emp_id +
                ", name='" + name + '\'' +
                '}';
    }
}
class child_class extends super_class
{
    double sal;

    public child_class(int emp_id, String name, double sal) {
        super(emp_id, name);
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "child_class{" +super.toString()+
                "sal=" + sal +
                '}';
    }
}
