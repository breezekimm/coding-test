import java.time.LocalDate;
import java.util.*;

class Solution {
    public String solution(int a, int b) {
        String answer = "";
        Map<Integer, String > dayOfTheWeek = new HashMap<>();
        dayOfTheWeek.put(1, "MON"); dayOfTheWeek.put(2, "TUE"); dayOfTheWeek.put(3, "WED"); 
        dayOfTheWeek.put(4, "THU"); dayOfTheWeek.put(5, "FRI"); dayOfTheWeek.put(6, "SAT"); dayOfTheWeek.put(7, "SUN");

        LocalDate date = LocalDate.of(2016, a, b);
        answer = dayOfTheWeek.get(date.getDayOfWeek().getValue());
        return answer;
    }
}