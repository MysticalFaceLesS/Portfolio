package Dz24;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class AllTests {

	@Test
    public void testEquals() {
        Assert.assertEquals(6, 2 + 4);
        Assert.assertTrue(6 == 2 + 4);
    }
 
    @Test
    public void testNotEquals() {
        Assert.assertFalse(7 == 2 + 3);
    }
    
    @Test
    public void getAllUsers_NULL() {
    	User user = new User();
        List<User> expected = User.getAllUsers();
        Assert.assertNull(expected);
    }
    
    @Test
    public void getAllUser_NOT_NULL() {
    	String TestNotNull = User.getAllUsers2();
    	Assert.assertNotNull(TestNotNull);
    }
}
