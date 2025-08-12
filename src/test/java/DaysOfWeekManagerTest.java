
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



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
    }
