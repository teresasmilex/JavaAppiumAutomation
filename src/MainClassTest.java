import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass {
    @Test
    public void testGetLocalNumber() {
        int localNumber = this.getLocalNumber();
        Assert.assertEquals("The local number should be 14", 14, localNumber);
    }

    @Test
    public void testGetClassNumber() {
        int classNumber = this.getClassNumber();
        if (classNumber == 45) {
            Assert.fail("Class number is 45, should be more than 45");
        } else if (classNumber < 45) {
            Assert.fail("Class number is less than 45, should be more than 45");
        } else {
            Assert.assertTrue(true);
        }
    }

    @Test
    public void testGetClassString() {
        String classString = this.getClassString();
        Assert.assertTrue("Class string doesn't contain 'Hello' or 'hello'",
                classString.contains("hello") || classString.contains("Hello"));
    }
}