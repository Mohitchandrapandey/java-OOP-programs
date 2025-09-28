//class & object in java 
class student 
{
    String name;
    int age;
}

public class basic
{
    public static void main(String args[])
    {
        student s1 = new student(); 
        s1.name = "Ravi";
        s1.age = 18;
        System.out.println("Name: " + s1.name);
        System.out.println("Age: " + s1.age);
    }
}

