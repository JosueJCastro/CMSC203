import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DayTestStudent 
{

    @Test
    public void testMonday() 
    {
        assertEquals(Day.MONDAY, Day.valueOf("MONDAY"));
    }

    @Test
    public void testTuesday() 
    {
        assertEquals(Day.TUESDAY, Day.valueOf("TUESDAY"));
    }

    @Test
    public void testWednesday() 
    {
        assertEquals(Day.WEDNESDAY, Day.valueOf("WEDNESDAY"));
    }

    @Test
    public void testThursday() 
    {
        assertEquals(Day.THURSDAY, Day.valueOf("THURSDAY"));
    }

    @Test
    public void testFriday() 
    {
        assertEquals(Day.FRIDAY, Day.valueOf("FRIDAY"));
    }

    @Test
    public void testSaturday() 
    {
        assertEquals(Day.SATURDAY, Day.valueOf("SATURDAY"));
    }

    @Test
    public void testSunday()
{
        assertEquals(Day.SUNDAY, Day.valueOf("SUNDAY"));
    }

    @Test
    public void testEnumValues()
    {
        Day[] values = Day.values();
        assertEquals(7, values.length);
        assertEquals(Day.MONDAY, values[0]);
        assertEquals(Day.TUESDAY, values[1]);
        assertEquals(Day.WEDNESDAY, values[2]);
        assertEquals(Day.THURSDAY, values[3]);
        assertEquals(Day.FRIDAY, values[4]);
        assertEquals(Day.SATURDAY, values[5]);
        assertEquals(Day.SUNDAY, values[6]);
    }

    @Test
    public void testEnumOrder() 
    {
        Day[] values = Day.values();
        assertEquals(Day.MONDAY, values[0]);
        assertEquals(Day.TUESDAY, values[1]);
        assertEquals(Day.WEDNESDAY, values[2]);
        assertEquals(Day.THURSDAY, values[3]);
        assertEquals(Day.FRIDAY, values[4]);
        assertEquals(Day.SATURDAY, values[5]);
        assertEquals(Day.SUNDAY, values[6]);
    }
}