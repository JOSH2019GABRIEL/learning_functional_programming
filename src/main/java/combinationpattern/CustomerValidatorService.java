package combinationpattern;

import java.time.LocalDate;
import java.time.Period;

public class CustomerValidatorService {

    private boolean isEmailValid(String email){
        return email.contains("@");
    }

    private boolean isNumberValid(String phoneNumber){
        return phoneNumber.startsWith("+234");
    }

    private boolean isAdult(LocalDate dob){
        return Period.between(dob, LocalDate.now()).getYears() > 16;
    }

    public boolean isValid(Customer customer){
      return   isNumberValid(customer.getPhoneNumber()) &&
                isEmailValid(customer.getEmail()) &&
                isAdult(customer.getDob());
    }
}
