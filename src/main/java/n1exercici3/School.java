package n1exercici3;

import java.util.ArrayList;
import java.util.List;

public class School {

    private List<String> studentsList;

    public School()
    {
        studentsList = new ArrayList<String>();
        setStudentsList();
    }

    public void setStudentsList() {

        studentsList.add("Pere");
        studentsList.add("Maria");
        studentsList.add("Joan");

    }

    public void printStudent(int index) throws ArrayIndexOutOfBoundsException
    {
        if(index < 0 || index >= studentsList.size())
        {
            throw new ArrayIndexOutOfBoundsException();
        }
        else
        {
            System.out.println(studentsList.get(index));
        }

    }
}
