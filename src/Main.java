public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Person person = new Person("John", "Doe", 20);

        System.out.println("Firstname: " + person.getFirstName());

        System.out.println("LastName: " + person.getLastName());

        System.out.println("Age: " + person.getAge());

        Person person1 = new Person("Cemre", "Guvenilir", 25, "Istanbul", "Web Developer", false);
        System.out.println(person1.isMarried);
        System.out.println(person1.city);
        System.out.println(person1.job);
    }
}