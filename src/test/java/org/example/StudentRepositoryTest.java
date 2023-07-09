package org.example;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.example.Student;
import org.example.StudentRepository;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


@QuarkusTest
class StudentRepositoryTest {

    @Inject
    StudentRepository studentRepository;

    @Test
    void findByCountryOK() {
        // 1. Call the findByCountry method on the studentRepository with "Nederland" as the argument
        // 2. Assert that the returned list of students is not null
        // 3. Assert that the returned list of students is not empty
        // 4. Assert that the size of the returned list is 2
        // 5. Assert that the values of the first student with country "Nederland"
    }

    @Test
    void findByCountryKO() {
        // 1. Call the findByCountry method on the studentRepository with "NonExistentCountry" as the argument
        // 2. Assert that the returned list of students is not null
        // 3. Assert that the returned list of students is empty
    }

    @Test
    void findByMajorOK() {
        // 1. Call the findByMajor method on the studentRepository with "Computer Science" as the argument
        // 2. Assert that the returned list of students is not null
        // 3. Assert that the returned list of students is not empty
        // 4. Assert that the id of the first student in the list is 9
        // 5. Assert that the name of the first student in the list is "Emma"
        // 6. Assert that the major of the first student in the list is "Computer Science"
    }

    @Test
    void findByMajorKO() {
        // 1. Call the findByMajor method on the studentRepository with "NonExistentMajor" as the argument
        // 2. Assert that the returned list of students is not null
        // 3. Assert that the returned list of students is empty
    }

    @Test
    void findByMentorOK() {
        // 1. Call the findByMentor method on the studentRepository with "Me" as the argument
        // 2. Assert that the returned list of students is not null
        // 3. Assert that the returned list of students is not empty
        // 4. Assert that the id of the first student in the list is 1
        // 5. Assert that the name of the first student in the list is "Henk"
        // 6. Assert that the mentor of the first student in the list is "Me"
    }

    @Test
    void findByMentorKO() {
        // 1. Call the findByMentor method on the studentRepository with "NonExistentMentor" as the argument
        // 2. Assert that the returned list of students is not null
        // 3. Assert that the returned list of students is empty
    }
}
