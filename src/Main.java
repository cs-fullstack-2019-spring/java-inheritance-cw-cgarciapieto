//importing the packeges and classes in them

import cwpm.*;
//allows an array to becreated and data stored
import java.util.ArrayList;


//main class that runs functions
public class Main {

    public static void main(String[] args) {
        ex1();
        System.out.println();

    }

//    creates an array but inhertinces the attributes
    public static void ex1(){

//        creates and array called PeopleList
        ArrayList<Person> Peoplelist = new ArrayList<Person>();

//        creates new person, friend and teacher and doctor
        Person person1 = new Person("Carlos");
        Friend friend1 = new Friend("Mason");
        Teacher teacher1 = new Teacher("Kevin Yancy");
        Doctor doctor1 = new Doctor("Johnson");

//        actually adds to the array created above
        Peoplelist.add(new Person("Michael"));
        Peoplelist.add(new Friend("Spider-Man"));
        Peoplelist.add(new Teacher("Kevin"));
        Peoplelist.add(new Doctor("Horrible"));

//        console logs or prints out a string

        System.out.println(person1.name);
        System.out.println(friend1.getName());
        System.out.println(teacher1.getName());

//        prints out the entire array
        System.out.println(Peoplelist);
//
//        System.out.println(Peoplelist.get(0).getPhrase());


    }
}
