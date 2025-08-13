import java.util.ArrayList;
import java.util.List;

public class DaysOfWeekManager {
    //@suppress... esta es una anotación que le dice al compilador que ignore la advertencia que salía antes
    @SuppressWarnings("FieldMayBeFinal")
    private List<String> daysOfWeek;

    public DaysOfWeekManager () {
        this.daysOfWeek = new ArrayList<>();
        //this
    }

    public List<String> getDaysOfWeek(){
        return this.daysOfWeek;
    }

    public void addDayOfWeek_AddsDayToList(String day){
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
    
}
