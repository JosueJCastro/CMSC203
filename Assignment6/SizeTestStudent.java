import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SizeTestStudent 
{

    @Test
    public void testSmall() 
    {
        assertEquals(Size.SMALL, Size.valueOf("SMALL"));
    }

    @Test
    public void testMedium() 
    {
        assertEquals(Size.MEDIUM, Size.valueOf("MEDIUM"));
    }

    @Test
    public void testLarge() 
    {
        assertEquals(Size.LARGE, Size.valueOf("LARGE"));
    }

    @Test
    public void testEnumValues() 
    {
        Size[] values = Size.values();
        assertEquals(3, values.length);
        assertEquals(Size.SMALL, values[0]);
        assertEquals(Size.MEDIUM, values[1]);
        assertEquals(Size.LARGE, values[2]);
    }

    @Test
    public void testEnumOrder()
    {
        Size[] values = Size.values();
        assertEquals(Size.SMALL, values[0]);
        assertEquals(Size.MEDIUM, values[1]);
        assertEquals(Size.LARGE, values[2]);
    }
}