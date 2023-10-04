package n3exercici7;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class OptionalTest {

    @Test
    void isEmptyObject()
    {
        Optional optional = new Optional();

        assertThat(optional).hasAllNullFieldsOrProperties();
    }

}