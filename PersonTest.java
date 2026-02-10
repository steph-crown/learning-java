import static org.junit.Assert.*;

import org.junit.Test;

public class PersonTest {
    @Test
    public void testConstructorAndToString() {
        Person p = new Person("Steph", 25);
        // This checks if your toString() matches your logic on line 27
        String expected = "Name: Steph\nAge: 25 years";
        assertEquals(expected, p.toString());
    }
}
