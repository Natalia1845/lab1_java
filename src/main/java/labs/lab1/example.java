package labs.lab1;

import java.time.LocalDate;

/**
 * Приклад використання класу {@code Student} та його Builder для створення об'єкта студента.
 */
public class example {

    public static void main(String[] args) {
        Student student = new Student.StudentBuilder("RB123456")
                .firstName("Іван")
                .lastName("Петренко")
                .birthDate(LocalDate.of(2000, 5, 10))
                .build();

        System.out.println(student);
    }
}