import java.util.*;

class Person {
    private String name;
    private int age;
    private String city;

    public Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    public String toString() {
        return "Name: " + name + ", Age: " + age + ", City: " + city;
    }
}

public class SortAndFilterLambda {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 25, "New York"));
        people.add(new Person("Bob", 30, "San Francisco"));
        people.add(new Person("Charlie", 22, "New York"));
        people.add(new Person("David", 35, "Los Angeles"));

        people.sort(Comparator.comparingInt(Person::getAge));

        String cityToFilter = "New York";
        List<Person> filteredPeople = new ArrayList<>();
        for (Person person : people) {
            if (person.getCity().equals(cityToFilter)) {
                filteredPeople.add(person);
            }
        }

        System.out.println("Sorted List by Age:");
        for (Person person : people) {
            System.out.println(person);
        }

        System.out.println("\nFiltered list from " + cityToFilter + ":");
        for (Person person : filteredPeople) {
            System.out.println(person);
        }
    }
}
