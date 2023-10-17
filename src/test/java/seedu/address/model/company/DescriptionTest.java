package seedu.address.model.company;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static seedu.address.testutil.Assert.assertThrows;

import org.junit.jupiter.api.Test;

public class DescriptionTest {

    @Test
    public void constructor_null_throwsNullPointerException() {
        assertThrows(NullPointerException.class, () -> new Description(null));
    }

    @Test
    public void constructor_invalidDescription_throwsIllegalArgumentException() {
        String invalidDescription = "";
        assertThrows(IllegalArgumentException.class, () -> new Description(invalidDescription));
    }

    @Test
    public void isValidDescription() {
        // null description
        assertThrows(NullPointerException.class, () -> Description.isValidDescription(null));

        // invalid descriptions
        assertFalse(Description.isValidDescription("")); // empty string
        assertFalse(Description.isValidDescription(" ")); // spaces only

        // valid descriptions
        assertTrue(Description.isValidDescription("This is a valid description."));
        assertTrue(Description.isValidDescription("Short")); // short description
        assertTrue(Description.isValidDescription("Longer descriptions should also be perfectly valid to handle."));
    }

    @Test
    public void equals() {
        Description description = new Description("Sample description");

        // same values -> returns true
        assertEquals(description, new Description("Sample description"));

        // same object -> returns true
        assertEquals(description, description);

        // null -> returns false
        assertNotEquals(null, description);

        // different types -> returns false
        assertFalse(description.equals(5.0f));

        // different values -> returns false
        assertNotEquals(description, new Description("Different description"));
    }
}
