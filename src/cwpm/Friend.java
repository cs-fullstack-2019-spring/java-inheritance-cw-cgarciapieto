package cwpm;

public class Friend extends Person{

    public Friend() {
    }

    public String name;


    public Friend(String name)
    {
        this.name = name;
    }
    @Override
    public String getName()
    {
        return (name);
    }

    public String toString()
    {
        return "Whats' Up " + name;
    }
}