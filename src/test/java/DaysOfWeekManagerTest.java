import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertLinesMatch;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;



public class DaysOfWeekManagerTest {

    private DaysOfWeekManager manager;

    @BeforeEach
    void setup(){
        manager = new DaysOfWeekManager();
    }
    

    @Test
    void DayOfWeekInitializeWithEmptyList() {

        /* //then
        //assertNotNull actúa como una red de seguridad, asegurando que el objeto que vas a usar existe antes de que intentes interactuar con él.*/
        assertNotNull(manager.getDaysOfWeek());

        assertTrue(manager.getDaysOfWeek().isEmpty());
    }

    

    @Test
    void addDayOfWeek_AddsDayToList(){
        
        String dayToAdd = "Lunes";

        //when
        manager.addDayOfWeek_AddsDayToList(dayToAdd);

        //then
        assertFalse(manager.getDaysOfWeek().isEmpty());
        assertTrue(manager.getDaysOfWeek().contains(dayToAdd));

    }

    @Test
    void getListOfDaysOfWeek_ReturnsListOfDays() {

        int listLength = manager.getListLength(); //esto debe fallar porque no existe el método getListLenght

        assertEquals(0, listLength); //esto también fallará porque la lista está vacía

        }
    

    @Test
    void removeDay_removesDayFromList(){
        manager.removeDay("Martes"); 
    }

    @Test
    void getDay_ReturnsCorrectDay() {
        manager.addDayOfWeek_AddsDayToList("Lunes");
        manager.addDayOfWeek_AddsDayToList("Martes");

        String retrieveDay = manager.getDay(0);
        
        assertEquals("Lunes", retrieveDay);
    }

    @Test
    void checkIfDayExists_ReturnsTrueIfDayExists() {
       
       manager.addDayOfWeek_AddsDayToList("jueves");
       boolean exists = manager.checkIfDayExists("jueves");

        assertTrue(manager.getDaysOfWeek().contains("jueves"));
    }

    @Test
    void sortDaysAlphabetically_sortsDaysInAlphabeticalOrder(){
        manager.addDayOfWeek_AddsDayToList("Martes");
        manager.addDayOfWeek_AddsDayToList("Lunes");
        manager.addDayOfWeek_AddsDayToList("Miércoles");

        manager.sortDayAlphabetically();

       assertIterableEquals(List.of("Lunes", "Martes", "Miércoles"), manager.getDaysOfWeek());

    }  
}
