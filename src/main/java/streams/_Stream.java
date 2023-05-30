package streams;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static streams._Stream.Gender.*;


public class _Stream {

    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John", MALE),
                new Person("Peculiar", FEMALE),
                new Person("Yusuf", MALE),
                new Person("Petter", MALE),
                new Person("Joy", FEMALE),
                new Person("Titus", MALE)
//                new Person("bOB", PREFARE_NOT_TO_SAY)
        );

   people.stream().map(person -> person.gender).collect(Collectors.toSet()).forEach(System.out::println);

   // SHOW LENGTH OF EACH NAME
        people.stream().map(person -> person.name)
                .mapToInt(String::length)
                .forEach(System.out::println);

        boolean containsOnlyFemales = people.stream().anyMatch(person -> FEMALE.equals(person.gender));
        System.out.println(containsOnlyFemales);

        boolean containsOnly = people.stream().noneMatch(person -> PREFARE_NOT_TO_SAY.equals(person.gender));
        System.out.println(containsOnly);
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
        MALE, FEMALE, PREFARE_NOT_TO_SAY
    }
}
