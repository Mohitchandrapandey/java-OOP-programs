//constructor in java

class car 
{
    String model;
    int year;
// constructor with parameters we can also create constructor without the parameter
    car(String m, int y ){
        model=m;
        year =y;
    }

}

public class constructor1
{
    public static void main(String args[])
    {
        car c1 = new car("Civic", 2016);
        System.out.println("Model: " + c1.model + " Year: " + c1.year);
    }
}
