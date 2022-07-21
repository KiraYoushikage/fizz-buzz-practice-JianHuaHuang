package tdd.fizzbuzz;

public class FizzBuzz {

    public static final String FIZZ="Fizz";

    public String countOff(int number){

        String res="";
        if(number%3==0){
            res+=FIZZ;
        }
        return res;
    }
}
