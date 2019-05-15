package cwpm;

public class Person {
    public Person() {
    }

    public String name;


    public Person(String name)
    {
        this.name = name;
    }

//    gernerated a getter so i can use the callback function 'name 'on the main java script file
    public String getName()
    {
        return (name);
    }

    public String toString()
    {
        return  name;
    }
}


