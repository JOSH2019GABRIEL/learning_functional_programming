package combinationpattern;

import java.time.LocalDate;

import static combinationpattern.CustomerRegistrationValidator.*;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer(
                "Joshua",
                "joshua.gabriel@gmail.com",
                "+08185980756",
                LocalDate.of(2000, 02, 24)
        );

        System.out.println(new CustomerValidatorService().isValid(customer));

        //Using Combinator Pattern
        ValidationResult res = isEmailValid()
                .and(isPhoneNumberValid())
                .and(isAnAdult())
                .apply(customer);

        System.out.println(res);

        if(res != ValidationResult.SUCCESS) {
            throw new IllegalStateException(res.name());
        }

    }
}
