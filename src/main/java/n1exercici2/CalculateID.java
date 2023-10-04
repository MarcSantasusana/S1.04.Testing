package n1exercici2;

import java.util.HashMap;

public class CalculateID {

    private HashMap<Integer,Character> letterMap;


    public CalculateID()
    {

        letterMap = new HashMap<Integer, Character>();
        setLetterMap();

    }

    public char calculateLetter(int number)
    {
        int remainder;
        char letter;

        remainder = number%23;

       letter = letterMap.get(remainder);

        return letter;
    }

    public void setLetterMap()
    {
        letterMap.put(0,'T');
        letterMap.put(1,'R');
        letterMap.put(2,'W');
        letterMap.put(3,'A');
        letterMap.put(4,'G');
        letterMap.put(5,'M');
        letterMap.put(6,'Y');
        letterMap.put(7,'F');
        letterMap.put(8,'P');
        letterMap.put(9,'D');
        letterMap.put(10,'X');
        letterMap.put(11,'B');
        letterMap.put(12,'N');
        letterMap.put(13,'J');
        letterMap.put(14,'Z');
        letterMap.put(15,'S');
        letterMap.put(16,'Q');
        letterMap.put(17,'V');
        letterMap.put(18,'H');
        letterMap.put(19,'L');
        letterMap.put(20,'C');
        letterMap.put(21,'K');
        letterMap.put(22,'E');

    }


}
