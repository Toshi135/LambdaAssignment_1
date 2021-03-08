package lambda.KUP;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GetMaximumTest {

    @Test
    void getMaximumOfTwoNumbers() {

        GetMaximum getMaximum = new GetMaximum();
        int test1 = getMaximum.getMaximumOfTwoNumbers(4,5);
        Assertions.assertEquals(5, test1);

        int test2 = getMaximum.getMaximumOfTwoNumbers(0, 10);
        Assertions.assertEquals(10,test2);

        int test3 = getMaximum.getMaximumOfTwoNumbers(-90, 90);
        Assertions.assertEquals(90, test3);

    }
}

