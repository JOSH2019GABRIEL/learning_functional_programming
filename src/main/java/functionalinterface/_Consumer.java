package functionalinterface;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public class _Consumer {

    public static void main(String[] args) {

        //Normal Method calls that returns no value
       greetCustomer(new Customer("Peculiar", "08160448101"));

       //Functional Interface (Consumer) Method calls that returns no value
       greetCustomerConsumer.accept(new Customer("Joshua", "08185980756"));

       //BiConsumer Functional Interface Method calls that returns no value
        greetCustomerV2.accept(new Customer("John", "092757564"), false);
    }

//BiFunctional Interface Method
    static BiConsumer<Customer, Boolean> greetCustomerV2 = (customer, showPhoneNumber) ->
        System.out.println("Hello " + customer.customerName +
                ", Thanks for registration phone number "
                +(showPhoneNumber ? customer.customerPhoneNumber : "***@!@***"));
    //Functional Interface Methods Consumer
    static Consumer<Customer> greetCustomerConsumer = customer ->
            System.out.println("Hello " + customer.customerName + ", thanks for registering phone Number " +customer.customerPhoneNumber);

    //Normal Methods
    static void greetCustomer(Customer customer){
        System.out.println("Hello " + customer.customerName + ", thanks for registering phone Number" +customer.customerPhoneNumber);
    }
    static class Customer{
        private final String customerName;
        private final String customerPhoneNumber;

        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}
