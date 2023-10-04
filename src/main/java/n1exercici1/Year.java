package n1exercici1;

import java.util.ArrayList;
import java.util.List;

public class Year {
     private List<String> monthList;

     public Year()
     {
         monthList = new ArrayList<String>();
     }

     public void addMonths()
     {
        monthList.add("January");
         monthList.add("February");
         monthList.add("March");
         monthList.add("April");
         monthList.add("May");
         monthList.add("June");
         monthList.add("July");
         monthList.add("August");
         monthList.add("September");
         monthList.add("October");
         monthList.add("November");
         monthList.add("December");
     }

    public List<String> getMonthList() {
        return monthList;
    }
}
