public class Person {
    String firstName;
    String lastName;
    int age;
    String city;
    String job;
    boolean isMarried;


    public Person(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstName, String lastName, int age, String city, String job, boolean isMarried){
        this(firstName, lastName, age);
        this.city = city;
        this.job = job;
        this.isMarried = isMarried;
    }

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public int getAge() {
        return age;
    }

    public boolean isTeen(){
        if(age<19 && age>13){
            return true;
        }
        return false;
    }

}
