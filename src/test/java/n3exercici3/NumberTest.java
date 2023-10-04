package n3exercici3;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class NumberTest {

    @Test
    void arraysAreIdentical()
    {
        int[] array1 = {4,6,8,3,2};
        int[] array2 = {4,6,8,3,2};

        Number a = new Number(array1);
        Number b = new Number(array2);

        assertThat(a).isEqualToComparingOnlyGivenFields(b, "numbersList");
    }

}