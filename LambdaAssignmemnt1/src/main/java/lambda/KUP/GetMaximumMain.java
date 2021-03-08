package lambda.KUP;

public class GetMaximumMain {

    public static void main(String[] args) {


        int number1 = 20;
        int number2 = 4;

        GetMaximum_Interface getMaximum = new GetMaximum();
        int maxOfTwoNumbers = getMaximum.getMaximumOfTwoNumbers(number1, number2);

        System.out.println("Two numbers are: " + number1 + "," + number2);

        System.out.println("Maximum number is: " + maxOfTwoNumbers);

    }

}
