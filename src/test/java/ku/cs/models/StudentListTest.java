package ku.cs.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StudentListTest {

    @Test
    void testAddNewStudent() {
        StudentList s = new StudentList();
        s.addNewStudent("6710451429", "Test");
        s.addNewStudent("6710451431", "Example", 200);
        assertEquals(2, s.getStudents().size());
    }

    @Test
    void testFindStudentById() {
        StudentList s = new StudentList();
        s.addNewStudent("6710451429", "Test");
        s.addNewStudent("6710451431", "Example", 200);
        assertEquals("Test", s.findStudentById("6710451429").getName());
        assertEquals("Example", s.findStudentById("6710451431").getName());

    }

    @Test
    void testFilterByName() {
        StudentList s = new StudentList();
        s.addNewStudent("6710451429", "Test");
        s.addNewStudent("6710451431", "Example", 200);
        StudentList filtered = s.filterByName("Test");
        assertEquals(1, filtered.getStudents().size());
    }

    @Test
    void testGiveScoreToId() {
        StudentList s = new StudentList();
        s.addNewStudent("6710451431", "Example", 200);
        s.giveScoreToId("6710451431", 20);
        assertEquals(220, s.findStudentById("6710451431").getScore());
    }

    @Test
    void testViewGradeOfId() {
        StudentList s = new StudentList();
        s.addNewStudent("6710451429", "Test");
        s.giveScoreToId("6710451429", 85);
        assertEquals("A", s.viewGradeOfId("6710451429"));
    }

}