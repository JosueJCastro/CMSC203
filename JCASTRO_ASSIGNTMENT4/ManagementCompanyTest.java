import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ManagementCompanyTest {

    Property myProp;
    ManagementCompany novaLiving;
    @BeforeEach
    void setUp() throws Exception {
        novaLiving = new ManagementCompany("Khandan", "01001", 25);
        myProp = new Property("SumerSet", "Silver Spring", 2100, "BillyBob Wilson", 2, 5, 2, 2);
    }

    @AfterEach
    void tearDown() throws Exception {
        novaLiving = null;
    }

    @Test
    public void testGetHighestRentProperty() {
        novaLiving.addProperty(myProp);
        assertEquals(myProp, novaLiving.getHighestRentProperty());
    }

    @Test
    public void testGetTotalRent() {
        assertEquals(novaLiving.addProperty(myProp), 0, 0);
        assertEquals(2100, novaLiving.getTotalRent());
    }

    @Test
    public void isMangementFeeValid() {
        equals(novaLiving.isMangementFeeValid());
    }

    @Test
    public void testGetName() {
        assertEquals("Khandan", novaLiving.getName());
    }

    @Test
    public void testGetTaxID() {
        assertEquals("01001", novaLiving.getTaxID());
    }

    @Test
    public void testGetProperties() {
        assertEquals(novaLiving.addProperty(myProp), 0, 0);
        assertEquals("SumerSet, Silver Spring, 2100.0, BillyBob Wilson, null, null, null, null", novaLiving.getProperties());
    }

    @Test
    public void testGetMgmFeePer() {
        assertEquals(25.0, novaLiving.getMgmFeePer());
    }

    @Test
    public void testGetPlot() {
        novaLiving.addProperty(myProp);
        assertEquals("2, 5, 2, 2", myProp.getPlot());
    }

    @Test
    public void testIsPropertiesFull() {
        assertFalse(novaLiving.isPropertiesFull());
    }

    @Test
    public void testRemoveLastProperty() {
        novaLiving.addProperty(myProp);
        // Uncomment this line if you want to test the removeLastProperty method
        // assertTrue(null, novaLiving.removeLastProperty());
    }

    @Test
    public void testAddProperty3() {
        assertEquals(novaLiving.addProperty(myProp), 0, 0);
    }

    @Test
    public void testAddProperty2() {
        assertEquals(novaLiving.addProperty(myProp), 0, 0);
    }

    @Test
    public void testAddProperty() {
        assertEquals(novaLiving.addProperty(myProp), 0, 0);
    }

    @Test
    public void testGetPropertiesCount() {
        assertEquals(novaLiving.addProperty(myProp), 0);
        assertEquals(novaLiving.getPropertiesCount(), 1);
    }

    @Test
    public void testToString() {
        assertEquals(novaLiving.addProperty(myProp), 0);
        String expectedString = "List of the properties for Khandan, taxID: 01001\n"
                + "______________________________________________________\n"
                + "SumerSet, Silver Spring, BillyBob Wilson, 2100.0\n"
                + "______________________________________________________\n"
                + "\n"
                + "Total management Fee: 525.0";
        System.out.println(expectedString);
        System.out.println(novaLiving.toString());
        assertEquals(expectedString, novaLiving.toString());
    }
}
