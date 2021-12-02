import java.util.Arrays;
import java.util.List;

public class Condition {
    public static <Itenger> void main(String[] args) {

        // creating list and of gender and initialising the elements
        List<String> words = Arrays.asList("boy", "girl", "woman", "man", "male", "female");

        // creating query parameter
        final String NEEDED_GENDER = "male";

        // using if statement
        if (words.contains(NEEDED_GENDER)){
            System.out.println("Gender: " + NEEDED_GENDER + " is present"); //this will be executed because gender is present
        }
        else{
            System.out.println("Gender: " + NEEDED_GENDER + " is absent");
        }

        // creating list and of gender and initialising the elements
        List<Integer> numbers = Arrays.asList(11,12,13,14,15,16,17,18);

        // using for loop to search and print the first even number
        for(int i = 0; i < numbers.size(); i++){
            if (numbers.get(i)  % 2 == 0){
                System.out.println(numbers.get(i) + " is the first even number in list");
                return;
            }
        }

        // using while to print all even numbers in the list
        int i=0;
        while(i < numbers.size()){
            int y = numbers.get(i) % 2;

            switch(y){
                case 1:
                    System.out.println("number at position "+i+": " + numbers.get(i) + " is odd");
                    break;
                case 0:
                    System.out.println("number at position "+i+": " + numbers.get(i) + " is even");
                    break;
            }
            i++;
        }
    }
}
