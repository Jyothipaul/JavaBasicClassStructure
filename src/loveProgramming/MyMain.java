package loveProgramming;

public class MyMain {

    public static void main(String[] args) {

        /*

        1. Object is instance of class
        2. new Person() is called Constructor. It is a method with the class name and will have () next to it.
        3. p1 & p2 are objects

         */

        Person p1 = new Person();
        p1.setFirstName("Rahul");
        p1.setLastName("Gandhi");
        p1.setAge(15);

        System.out.println( "My Name is " + p1.getFirstName() + " " + p1.getLastName()+".");
        System.out.println( "I am " + p1.getAge()+ " Years old.");
        System.out.println( "I want to be your PM in 2019.");

        Person p2 = new Person();
        p2.setFirstName("Jyothi");
        p2.setLastName("Paul");
        p2.setAge(36);

        System.out.println( "My Name is " + p2.getFirstName() + " " + p2.getLastName()+".");
        System.out.println( "I am " + p2.getAge()+ " Years old.");
        System.out.println( "I want to develop application using Java.");

    }
}
