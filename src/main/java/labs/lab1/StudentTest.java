package labs.lab1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    Student student1;
    Student student2;

    @BeforeEach
    void setUp() {
        student1 = new Student.StudentBuilder()
                .firstName("Alice")
                .lastName("Johnson")
                .birthDate(LocalDate.of(2000, 5, 15))
                .recordBookNumber("RB-123")
                .build();

        student2 = new Student.StudentBuilder()
                .firstName("Bob")
                .lastName("Smith")
                .birthDate(LocalDate.of(2001, 7, 20))
                .recordBookNumber("RB-124")
                .build();
    }

    @Test
    void testStringRepresentation() {
        String expected = "Student{firstName='Alice', lastName='Johnson', birthDate=2000-05-15, recordBookNumber='RB-123'}";
        assertEquals(expected, student1.toString());
    }

    @Test
    void testEquality() {
        assertNotEquals(student1, student2, "Students with different record book numbers should not be equal");
    }

    @Test
     void testHashCode() {
        assertNotEquals(student1.hashCode(), student2.hashCode(), "Hash codes for different students should not be equal");
    }
}