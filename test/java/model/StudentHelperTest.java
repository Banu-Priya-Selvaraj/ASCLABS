package test.java.model;

import LAB1.Student;
import LAB1.StudentHelper;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class StudentHelperTest {

    @Test
    public void testFindStudentWithHighestTotalMarks() {
        // Simulate user input by creating a list of Student objects
        List<Student> students = new ArrayList<>();

        Student s1 = new Student();
        s1.setStudentId(1);
        s1.setStudentName("Banu");
        s1.setCity("Coimbatore");
        s1.setMarks1(70);
        s1.setMarks2(80);
        s1.setMarks3(90);
        students.add(s1);

        Student s2 = new Student();
        s2.setStudentId(2);
        s2.setStudentName("Priya");
        s2.setCity("Chennai");
        s2.setMarks1(65);
        s2.setMarks2(75);
        s2.setMarks3(85);
        students.add(s2);

        Student s3 = new Student();
        s3.setStudentId(3);
        s3.setStudentName("Saranya");
        s3.setCity("Bangalore");
        s3.setMarks1(90);
        s3.setMarks2(95);
        s3.setMarks3(100);
        students.add(s3);

        // Use the method to find the student with the highest total marks
        Student highestMarksStudent = StudentHelper.findStudentWithHighestTotalMarks(students);

        // Verify that the correct student is identified
        assertNotNull(highestMarksStudent);

        // Print the student who scored the highest total marks
        System.out.println("Student with the highest total marks: " + highestMarksStudent.getStudentName());
        System.out.println("Total Marks: " + highestMarksStudent.getTotalMarks());

        // Check that no other student has higher total marks
        int highestMarks = highestMarksStudent.getTotalMarks();
        for (Student student : students) {
            assertTrue(student.getTotalMarks() <= highestMarks);
        }
    }

    @Test
    public void testFindStudentWithHighestTotalMarks_EmptyList() {
        // Test with an empty list
        List<Student> students = new ArrayList<>();

        Student highestMarksStudent = StudentHelper.findStudentWithHighestTotalMarks(students);

        assertNull(highestMarksStudent);
    }

    @Test
    public void testFindStudentWithHighestTotalMarks_NullList() {
        // Test with a null list
        List<Student> students = null;

        Student highestMarksStudent = StudentHelper.findStudentWithHighestTotalMarks(students);

        assertNull(highestMarksStudent);
    }
}
