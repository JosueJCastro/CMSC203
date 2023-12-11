import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TypeTestStudent 
{

    @Test
    public void testCoffee() 
    {
        assertEquals(Type.COFFEE, Type.valueOf("COFFEE"));
    }

    @Test
    public void testSmoothie() 
    {
        assertEquals(Type.SMOOTHIE, Type.valueOf("SMOOTHIE"));
    }

    @Test
    public void testAlcohol() 
    {
        assertEquals(Type.ALCOHOL, Type.valueOf("ALCOHOL"));
    }

    @Test
    public void testEnumValues() 
    {
        Type[] values = Type.values();
        assertEquals(3, values.length);
        assertEquals(Type.COFFEE, values[0]);
        assertEquals(Type.SMOOTHIE, values[1]);
        assertEquals(Type.ALCOHOL, values[2]);
    }

    @Test
    public void testEnumOrder() 
    {
        Type[] values = Type.values();
        assertEquals(Type.COFFEE, values[0]);
        assertEquals(Type.SMOOTHIE, values[1]);
        assertEquals(Type.ALCOHOL, values[2]);
    }
}