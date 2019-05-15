package cwpm;

public class Teacher extends Person {

    public Teacher() {
    }

    public String name;


    public Teacher(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return(name);
    }

    public String toString()
    {
        return "Hello Mr/Ms: " + name;
    }
}
