package imperative;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person>   people = List.of(
            new Person("John", Gender.MALE),
            new Person("Peculiar", Gender.FEMALE),
            new Person("Yusuf", Gender.MALE),
            new Person("Petter", Gender.MALE),
            new Person("Joy", Gender.FEMALE),
            new Person("Titus", Gender.MALE)
        );

        System.out.println("Declarative Approach");
        // Imperative Approach
        List<Person> females = new ArrayList<>();

        for (Person person: people){
            if (Gender.FEMALE.equals(person.gender)){
                females.add(person);
            }
        }

        for (Person female: females){
            System.out.println(female);

        }

        System.out.println("Declarative Approach");
        //Declarative Approach
        List<Person> female2 = people.stream()
                .filter(person -> Gender.FEMALE.equals(person.gender))
                .collect(Collectors.toList());
        female2.forEach(System.out::println);

    }
    static class Person {
        private final String name;
        private final Gender gender;

        Person(String name, Gender gender){
        this.name = name;
        this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender {
        MALE, FEMALE
    }
}
