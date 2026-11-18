package Lab8;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class GradeUtilityTest {

    GradeUtility util = new GradeUtility();

    @Test
    void testGradeA() {
        assertEquals("A", util.getGrade(90));
    }

    @Test
    void testGradeC() {
        assertEquals("C", util.getGrade(65));
    }

    @Test
    void testGradeF() {
        assertEquals("F", util.getGrade(40));
    }

    @Test
    void testInvalidInput() {
        assertThrows(IllegalArgumentException.class, () -> {
            util.getGrade(-5);
        });
    }
}
