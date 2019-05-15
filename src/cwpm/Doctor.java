package cwpm;

public class Doctor extends  Person{
    public Doctor() {
    }

    public String name;


    public Doctor(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return(name);
    }
    public String toString()
    {
        return "Good morning/Afternoon Dr. " + name;
    }
}
