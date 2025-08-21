package ku.cs.models;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    Student s;

    @BeforeAll
    static void init() {

    }

    @BeforeEach
    void setUp() {
        s = new Student("6710451429", "Test");
    }

    @Test
    @DisplayName("ทดสอบการเพิ่มคะแนนให้กับนักเรียน")
    void testAddScore(){
        Student s = new Student("6710451429", "Test");
        s.addScore(45.12);
        assertEquals(45.12, s.getScore());
    }

    @Test
    void testCalculateGrade() {
        Student s = new Student("6710451429", "Test");
        s.addScore(80);
        assertEquals("A", s.getGrade());
    }

    @Test
    @DisplayName("ทดสอบการเปลี่ยนชื่อของนักเรียน")
    void testChangeName() {
        Student s = new Student("6710451429", "Test");
        s.changeName("New Name");
        assertEquals("New Name", s.getName());
    }

    @Test
    @DisplayName("เช็ครหัสนิสิต")
    void testIsId() {
        Student s = new Student("6710451429", "Test");
        assertTrue(s.isId("6710451429"));
        assertFalse(s.isId("1234567890"));
    }

    @Test
    @DisplayName("เช็คชื่อของนิสิต")
    void testIsNameContains() {
        Student s = new Student("6710451429", "Test");
        assertTrue(s.isNameContains("Test"));
        assertFalse(s.isNameContains("Example"));
    }

}