package ku.cs.services;

import ku.cs.models.StudentList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentHardCodeDatasourceTest {

    @Test
    void testReadData() {
        StudentHardCodeDatasource s = new StudentHardCodeDatasource();
        StudentList list = new StudentList();
        list.addNewStudent("6710400001", "First");
        list.addNewStudent("6710400002", "Second");
        list.addNewStudent("6710400003", "Third");
        list.addNewStudent("6710400004", "Fourth");
        assertEquals(4, s.readData().getStudents().size());
    }
}