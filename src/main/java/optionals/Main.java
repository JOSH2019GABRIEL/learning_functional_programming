package optionals;

import java.util.Objects;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {

    Object value =  Optional.ofNullable("Hello")
                .orElseThrow(() -> new IllegalStateException("Exception"));

        System.out.println(value);
//One time if statement
        Optional.ofNullable("joshua.Gabriel@gmail.com").ifPresent(email -> System.out.println("Sending email to " +email));

        //If else statement using Java Functional
        Optional.ofNullable("null").ifPresentOrElse(email-> System.out.println("Sending email to " + email), ()->{
            System.out.println("No emails provided; cannot send email");
        });
    }
}
