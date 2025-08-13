import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DaysOfWeekManager {
    private final List<String> daysOfWeek;

    public DaysOfWeekManager () {
        this.daysOfWeek = new ArrayList<>();
        
    }

    public List<String> getDaysOfWeek(){
        return new ArrayList<>(this.daysOfWeek);
    }

    public void addDayOfWeek(String day){
        this.daysOfWeek.add(day);
    }


    public int getListLength() {
        return daysOfWeek.size();
    }

    public void removeDay(String day){
        this.daysOfWeek.remove(day);
    }

    public String getDay (int index) {
        return this.daysOfWeek.get(index);
    }

    public boolean checkIfDayExists(String day) {
        return this.daysOfWeek.contains(day);
    }

    public void sortDaysAlphabetically(){
        Collections.sort(this.daysOfWeek);
    }

    public void clear(){
        this.daysOfWeek.clear();
    }
    
}
