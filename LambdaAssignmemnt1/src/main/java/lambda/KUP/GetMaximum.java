package lambda.KUP;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class GetMaximum implements GetMaximum_Interface {
    @Override
    public int getMaximumOfTwoNumbers(int numberOne, int numberTwo) {

        List<Integer> numList = Arrays.asList(numberOne, numberTwo);
        Optional<Integer> getMaxNum = numList.stream().max((num1, num2) -> {

            int getMaxNumberOfTwo = Integer.compare(num1, num2);
            return getMaxNumberOfTwo;
        });
        return getMaxNum.get();
    }
}
