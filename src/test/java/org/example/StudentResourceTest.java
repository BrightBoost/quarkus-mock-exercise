package org.example;

import io.quarkus.hibernate.orm.panache.PanacheQuery;
import io.quarkus.test.junit.QuarkusTest;
import io.quarkus.test.junit.mockito.InjectMock;
import jakarta.inject.Inject;
import jakarta.ws.rs.core.Response;
import org.example.Student;
import org.example.StudentRepository;
import org.example.StudentResource;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@QuarkusTest
class StudentResourceTest {

    @InjectMock
    StudentRepository studentRepository;
    @Inject
    StudentResource studentResource;

    private Student student;

    @BeforeEach
    void setUp() {
        // 1. Create a new Student instance with id, name, major, mentor, and country.
        // 2. Assign this student instance to the 'student' field.
    }

    @Test
    void getAll() {
        // 1. Create a List<Student> instance and add the 'student' to this list.
        // 2. Use Mockito to prepare studentRepository.listAll() to return this list.
        // 3. Invoke studentResource.getAll() and store its result in a variable.
        // 4. Validate the response by asserting the following:
        //    - The response should not be null.
        //    - The status of the response should be OK.
        //    - The entity within the response should not be null.
        // 5. Extract the entity from the response, cast it to List<Student>, and assert that it contains 'student'.
    }

    @Test
    void getByIdOK() {
        // 1. Use Mockito to make studentRepository.findByIdOptional(1L) return an Optional of 'student'.
        // 2. Invoke studentResource.getById(1L) and store its result in a variable.
        // 3. Validate the response by asserting the following:
        //    - The response should not be null.
        //    - The status of the response should be OK.
        //    - The entity within the response should not be null.
        // 4. Extract the entity from the response, cast it to Student, and assert that it equals 'student'.
    }

    @Test
    void getByIdKO() {
        // 1. Use Mockito to make studentRepository.findByIdOptional(1L) return an Optional.empty().
        // 2. Invoke studentResource.getById(1L) and store its result in a variable.
        // 3. Validate the response by asserting the following:
        //    - The response should not be null.
        //    - The status of the response should be NOT_FOUND.
        //    - The entity within the response should be null.
    }

    // Further expand instructions for the remaining tests:
    // getByNameOK(), getByNameKO(), getByCountry(), createOK(), createKO()

    @Test
    void updateOK() {
        // 1. Prepare your test environment by setting up the necessary mocks.
        // 2. Invoke the appropriate method in studentResource and store the result.
        // 3. Assert on the result of the invocation to verify the expected outcome.
    }

    @Test
    void updateKO() {
        // 1. Set up the necessary conditions for the test to execute.
        // 2. Call the appropriate method in studentResource.
        // 3. Assert that the result of the invocation matches the expected outcome.
    }

    @Test
    void createOK() {
        // 1. Set up the necessary conditions for the test to execute.
        //    Hint: You need to create a new Student instance and set its fields. Use Mockito to simulate a successful create operation.
        // 2. Call the appropriate method in studentResource with the new student instance.
        // 3. Assert that the result of the invocation matches the expected outcome.
        //    Hint: You will probably want to assert that the creation was successful, which could mean checking the HTTP status code or the location header in the response.
    }

    @Test
    void createKO() {
        // 1. Set up the necessary conditions for the test to execute.
        //    Hint: Think about what could cause a create operation to fail. Maybe the student already exists in the database?
        // 2. Create a new Student instance and set its fields.
        // 3. Call the appropriate method in studentResource with the new student.
        // 4. Assert that the result of the invocation matches the expected outcome.
        //    Hint: In this case, you would expect the operation to fail. You might want to check if the HTTP status code indicates an error.
    }

    @Test
    void deleteOK() {
        // 1. Set up the necessary conditions for the test to execute.
        //    Hint: Use Mockito to simulate a successful delete operation. You'll need an existing student in the database.
        // 2. Call the appropriate method in studentResource with the id of the student to delete.
        // 3. Assert that the result of the invocation matches the expected outcome.
        //    Hint: You will probably want to assert that the delete was successful, which could mean checking the HTTP status code or verifying the student is no longer in the database.
    }

    @Test
    void deleteKO() {
        // 1. Set up the necessary conditions for the test to execute.
        //    Hint: Think about what could cause a delete operation to fail. Maybe the student doesn't exist in the database?
        // 2. Call the appropriate method in studentResource with the id of the student to delete.
        // 3. Assert that the result of the invocation matches the expected outcome.
        //    Hint: In this case, you would expect the operation to fail. You might want to check if the HTTP status code indicates an error.
    }

    // also add tests in for:
    // - getByNameOK()
    // - getByNameKO()
    // - getByCountry()
}





