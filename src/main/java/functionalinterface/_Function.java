package functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {

    public static void main(String[] args) {
        int increment = increment(0);

        System.out.println(increment);

        int increment2 = incrementByOneFunction.apply(1);

        System.out.println(increment2);

        int multiply = multiplyBy10.apply(increment2);
        System.out.println(multiply);

        //Functional Functions
        Function<Integer, Integer> addByOneAndThenMultiplyBy10 =
                incrementByOneFunction.andThen(multiplyBy10);
        int addMultiply = addByOneAndThenMultiplyBy10.apply(1);
        System.out.println(addMultiply);

        System.out.println(incrementByOneAndMultiply(4,100));

        //Bi Functional Outprint

        System.out.println(incrementByOneAndMultiplyBy10.apply(5,40));



    }
    //Bi Functions
   static BiFunction<Integer,Integer,Integer>  incrementByOneAndMultiplyBy10 = (number, numMultiply) -> (number +1) * numMultiply;
    //Functional Function
    static Function<Integer, Integer> incrementByOneFunction = num -> num +1;
    static Function<Integer, Integer> multiplyBy10 = num -> num * 10;
    static int increment(int num){
        return num +1;
    }

    static  int incrementByOneAndMultiply(int num, int numToMultiplyBy){
        return (num + 1) * numToMultiplyBy;
    }
}
