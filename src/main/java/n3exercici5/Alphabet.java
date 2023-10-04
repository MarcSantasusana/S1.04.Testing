package n3exercici5;

import java.util.HashMap;

public class Alphabet {

    HashMap<Character, Integer> alphabetMap;

    public Alphabet()
    {
       alphabetMap = new HashMap<Character, Integer>();

        setAlphabetMap();

    }

    public void setAlphabetMap() {

      int value = 0;

        for (char key = 'a'; key <= 'z'; ++key) {

            alphabetMap.put(key, value);

            value++;
        }
    }

    public HashMap<Character, Integer> getAlphabetMap() {
        return alphabetMap;
    }
}
