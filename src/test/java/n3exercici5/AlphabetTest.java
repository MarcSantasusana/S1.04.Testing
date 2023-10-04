package n3exercici5;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.assertj.core.api.Assertions.assertThat;
public class AlphabetTest {

    @Test
    void hasKey()
    {
        Alphabet alphabet = new Alphabet();

        assertThat(alphabet.getAlphabetMap()).containsKey('p');
    }
}
