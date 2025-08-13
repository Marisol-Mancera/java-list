import static org.junit.jupiter.api.Assertions.assertFalse;
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
    void setup() {
        manager = new DaysOfWeekManager();
    }

    @Test
    void shouldInitializeWithEmptyList() {
        assertNotNull(manager.getDaysOfWeek());
        assertTrue(manager.getDaysOfWeek().isEmpty());
    }

    @Test
    void shouldAddDayAndIncreaseLength() {
        manager.addDayOfWeek("Lunes");
        assertEquals(1, manager.getListLength());
        assertFalse(manager.getDaysOfWeek().isEmpty());
    }

    @Test
    void shouldReturnZeroLengthWhenListIsEmpty() {
        assertEquals(0, manager.getListLength());
    }

    @Test
    void shouldRemoveDayAndDecreaseSize() {
        populateDays();
        manager.removeDay("Lunes");
        assertEquals(2, manager.getListLength());
        assertFalse(manager.getDaysOfWeek().contains("Lunes"));
    }

    @Test
    void shouldReturnCorrectDayByIndex() {
        populateDays();
        assertEquals("Martes", manager.getDay(0));
    }

    @Test
    void shouldReturnTrueWhenDayExists() {
        populateDays();
        boolean exists = manager.checkIfDayExists("Lunes");
        assertTrue(exists);
    }

    @Test
    void shouldSortListAlphabetically() {
        populateDays();
        manager.sortDaysAlphabetically();
        assertIterableEquals(List.of("Lunes", "Martes", "Miércoles"), manager.getDaysOfWeek());
    }

    @Test
    void shouldEmptyListAndReturnZeroLength() {
        populateDays();
        manager.clear();
        assertTrue(manager.getDaysOfWeek().isEmpty());
        assertEquals(0, manager.getListLength());
    }

    private void populateDays() {
        manager.addDayOfWeek("Martes");
        manager.addDayOfWeek("Lunes");
        manager.addDayOfWeek("Miércoles");
    }
}