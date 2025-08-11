import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class DaysOfWeekManagerTest {
    
    @Test
    void DayOfWeekInitializeWithEmptyList () {

        //given
        DaysOfWeekManager manager = new DaysOfWeekManager ();
        
       /* //then
        //assertNotNull actúa como una red de seguridad, asegurando que el objeto que vas a usar existe antes de que intentes interactuar con él.*/
        assertNotNull(manager.getDaysOfWeek());

        assertTrue(manager.getDaysOfWeek().isEmpty());
    }
    
}
