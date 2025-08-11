import java.util.ArrayList;
import java.util.List;

public class DaysOfWeekManager {
    //@suppress... esta es una anotación que le dice al compilador que ignore la advertencia que salía antes
    @SuppressWarnings("FieldMayBeFinal")
    private List<String> daysOfWeek;

    public DaysOfWeekManager () {
        this.daysOfWeek = new ArrayList<>();
    }

    public List<String> getDaysOfWeek(){
        return this.daysOfWeek;
    }


}
