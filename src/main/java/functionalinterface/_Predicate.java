package functionalinterface;

import java.util.function.Predicate;

public class _Predicate {

    public static void main(String[] args) {

        System.out.println("Without Predicates");
        System.out.println(isPhoneNumberValid("08185980756"));
        System.out.println(isPhoneNumberValid("07185980756"));
        System.out.println(isPhoneNumberValid("081880756"));
        System.out.println(isPhoneNumberValid("08085980756"));
        System.out.println(isPhoneNumberValid("08160479248"));

        System.out.println("With Predicates");
        System.out.println(isPhoneNumberPredicate.test("08185980756"));
        System.out.println(isPhoneNumberPredicate.test("07185980756"));
        System.out.println(isPhoneNumberPredicate.test("081880756"));
        System.out.println(isPhoneNumberPredicate.test("08085980756"));
        System.out.println(isPhoneNumberPredicate.test("08160479248"));


        System.out.println(
                "Is Phone Number a valid MTN number 081, 0816 "+
                     isPhoneNumberPredicate.and(isPhoneNumberMTN).test("08130479248")
        );

        System.out.println(
                "Is Phone Number a valid MTN number 081, 0816 "+
                        isPhoneNumberPredicate.and(isPhoneNumberMTN).test("08170479248")
        );
    }

    //Predicate Method to dictate an MTN Number
    static Predicate<String> isPhoneNumberMTN = phoneNumber ->
            (phoneNumber.contains("0813") || phoneNumber.contains("0816")) & phoneNumber.length()==11;
    static Predicate<String> isPhoneNumberPredicate = phoneNumber ->
            (phoneNumber.startsWith("081") || phoneNumber.startsWith("080")) && phoneNumber.length() ==11;
    static boolean isPhoneNumberValid(String phoneNumber){
        return (phoneNumber.startsWith("081") || phoneNumber.startsWith("080")) && phoneNumber.length() ==11;
    }
}
