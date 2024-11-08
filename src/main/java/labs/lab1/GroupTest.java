package labs.lab1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GroupTest {
    Group group1;
    Group group2;

    @BeforeEach
    void setUp() {
        group1 = new Group.GroupBuilder("CS-101")
                .yearOfCreation(2021)
                .department("Computer Science")
                .curatorFirstName("John")
                .curatorLastName("Doe")
                .build();

        group2 = new Group.GroupBuilder("CS-102")
                .yearOfCreation(2021)
                .department("Computer Science")
                .curatorFirstName("Jane")
                .curatorLastName("Smith")
                .build();
    }

    @Test
    void testStringRepresentation() {
        String expected = "Group{groupNumber='CS-101', yearOfCreation=2021, department='Computer Science', curator='John Doe'}";
        assertEquals(expected, group1.toString());
    }

    @Test
    void testEquality() {
        assertNotEquals(group1, group2, "Groups with different group numbers should not be equal");
    }

    @Test
    void testHashCode() {
        assertNotEquals(group1.hashCode(), group2.hashCode(), "Hash codes for different groups should not be equal");
    }
}
