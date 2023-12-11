import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BevShopTestStudent 
{

    BevShop bevShop;

    @Before
    public void setUp() throws Exception 
    {
        bevShop = new BevShop();
        bevShop.startNewOrder(10, Day.MONDAY, "John Doe", 25);
    }

    @After
    public void tearDown() throws Exception 
    {
        bevShop = null;
    }

    @Test
    public void testIsValidTime() {
        assertTrue(bevShop.isValidTime(12));
        assertFalse(bevShop.isValidTime(7));
    }

    @Test
    public void testGetMaxNumOfFruits() 
    {
        assertEquals(5, bevShop.getMaxNumOfFruits());
    }

    @Test
    public void testGetMinAgeForAlcohol() 
    {
        assertEquals(21, bevShop.getMinAgeForAlcohol());
    }

    @Test
    public void testIsMaxFruit() 
    {
        assertFalse(bevShop.isMaxFruit(3));
        assertTrue(bevShop.isMaxFruit(6));
    }

    @Test
    public void testGetMaxOrderForAlcohol() 
    {
        assertEquals(3, bevShop.getMaxOrderForAlcohol());
    }

    @Test
    public void testIsEligibleForMore()
    {
        
        bevShop.processAlcoholOrder("Wine", Size.LARGE);
        assertTrue(bevShop.isEligibleForMore());
    }

    @Test
    public void testGetNumOfAlcoholDrink()
    {
        assertEquals(0, bevShop.getNumOfAlcoholDrink());
        bevShop.processAlcoholOrder("Beer", Size.SMALL);
        assertEquals(1, bevShop.getNumOfAlcoholDrink());
    }

    @Test
    public void testIsValidAge()
    {
        assertTrue(bevShop.isValidAge(25));
        assertFalse(bevShop.isValidAge(20));
    }

    @Test
    public void testProcessCoffeeOrder() 
    {
        bevShop.processCoffeeOrder("Latte", Size.MEDIUM, true, false);
        assertEquals(1, bevShop.getCurrentOrder().findNumOfBeveType(Type.COFFEE));
    }

    @Test
    public void testProcessAlcoholOrder() 
    {
    	
    	bevShop.startNewOrder(10, Day.MONDAY, "John Doe", 25);
        bevShop.processAlcoholOrder("Rum", Size.SMALL);
        assertEquals(1, bevShop.getCurrentOrder().findNumOfBeveType(Type.ALCOHOL));
    }

    @Test
    public void testProcessSmoothieOrder()
    {
        bevShop.processSmoothieOrder("Berry Blast", Size.SMALL, 3, true);
        bevShop.startNewOrder(10, Day.MONDAY, "John Doe", 25);
        bevShop.processSmoothieOrder("Blueberry", Size.SMALL, 0, false);
        assertEquals(1, bevShop.getCurrentOrder().findNumOfBeveType(Type.SMOOTHIE));
    }

    @Test
    public void testFindOrder() 
    {
        assertEquals(0, bevShop.findOrder(bevShop.getCurrentOrder().getOrderNo()));
        assertEquals(-1, bevShop.findOrder(999));
    }

    @Test
    public void testTotalOrderPrice() 
    {
        assertEquals(0, bevShop.totalOrderPrice(bevShop.getCurrentOrder().getOrderNo()), 0.01);
        bevShop.processCoffeeOrder("Cappuccino", Size.LARGE, false, true);
        assertEquals(4.5, bevShop.totalOrderPrice(bevShop.getCurrentOrder().getOrderNo()), 0.01);
    }

    @Test
    public void testTotalMonthlySale() 
    {
        bevShop.processCoffeeOrder("Americano", Size.SMALL, true, false);
        assertEquals(2.5, bevShop.totalMonthlySale(), 0.01);
    }

    @Test
    public void testTotalNumOfMonthlyOrders() 
    {
        assertEquals(1, bevShop.totalNumOfMonthlyOrders());
        bevShop.startNewOrder(15, Day.FRIDAY, "Jane Doe", 30);
        assertEquals(2, bevShop.totalNumOfMonthlyOrders());
    }

    @Test
    public void testSortOrders() 
    {
        bevShop.startNewOrder(15, Day.FRIDAY, "Jane Doe", 30);
        bevShop.sortOrders();
        assertTrue(bevShop.getOrderAtIndex(0).getOrderNo() < bevShop.getOrderAtIndex(1).getOrderNo());
        
    }
}