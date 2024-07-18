package test.java.model;

import LAB1.Student;
import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTestCase {

    @Test
    public void testGetAnnualFee() {
        Student student = new Student();
        student.setFeePerMonth(500.0f);
        assertEquals(6000.0f, student.getAnnualFee(), 0.001);
    }

    @Test
    public void testGetAnnualFeeZero() {
        Student student = new Student();
        student.setFeePerMonth(0.0f);
        assertEquals(0.0f, student.getAnnualFee(), 0.001);
    }

    @Test
    public void testGetAnnualFeeLargeValue() {
        Student student = new Student();
        student.setFeePerMonth(1000000.0f);
        assertEquals(12000000.0f, student.getAnnualFee(), 0.001);
    }

    @Test
    public void testGetTotalMarks() {
        Student student = new Student();
        student.setMarks1(70);
        student.setMarks2(80);
        student.setMarks3(90);
        assertEquals(240, student.getTotalMarks());
    }

    @Test
    public void testGetTotalMarksZero() {
        Student student = new Student();
        student.setMarks1(0);
        student.setMarks2(0);
        student.setMarks3(0);
        assertEquals(0, student.getTotalMarks());
    }

    @Test
    public void testGetTotalMarksMaxValue() {
        Student student = new Student();
        student.setMarks1(100);
        student.setMarks2(100);
        student.setMarks3(100);
        assertEquals(300, student.getTotalMarks());
    }
    @Test
    public void gethighesttotalmarks(){
     Student student=new Student();
     student.getTotalMarks();
        student.setMarks1(0);
        student.setMarks2(0);
        student.setMarks3(0);
        assertEquals(0,student.getTotalMarks());
    }

    @Test
    public void testGetAverage() {
        Student student = new Student();
        student.setMarks1(70);
        student.setMarks2(80);
        student.setMarks3(90);
        assertEquals(80.0f, student.getAverage(), 0.001);
    }

    @Test
    public void testGetAverageZero() {
        Student student = new Student();
        student.setMarks1(0);
        student.setMarks2(0);
        student.setMarks3(0);
        assertEquals(0.0f, student.getAverage(), 0.001);
    }

    @Test
    public void testGetAverageMaxValue() {
        Student student = new Student();
        student.setMarks1(100);
        student.setMarks2(100);
        student.setMarks3(100);
        assertEquals(100.0f, student.getAverage(), 0.001);
    }
    @Test
    public void testhighesttotalmarks(){
        Student student= new Student();
        student.setMarks1(100);
        student.setMarks2(200);
        student.setMarks3(134);
        assertEquals(434,student.getTotalMarks());
    }

    @Test
    public void testGetResultPass() {
        Student student = new Student();
        student.setMarks1(70);
        student.setMarks2(80);
        student.setMarks3(90);
        assertEquals("pass", student.getResult());
    }

    @Test
    public void testGetResultBoundaryPass() {
        Student student = new Student();
        student.setMarks1(60);
        student.setMarks2(60);
        student.setMarks3(60);
        assertEquals("fail", student.getResult());
    }

    @Test
    public void testGetResultBoundaryFail() {
        Student student = new Student();
        student.setMarks1(59);
        student.setMarks2(60);
        student.setMarks3(60);
        assertEquals("fail", student.getResult());
    }

    @Test
    public void testGetResultFail() {
        Student student = new Student();
        student.setMarks1(50);
        student.setMarks2(80);
        student.setMarks3(90);
        assertEquals("fail", student.getResult());
    }

    @Test
    public void testGetResultFailAllMarks() {
        Student student = new Student();
        student.setMarks1(50);
        student.setMarks2(50);
        student.setMarks3(50);
        assertEquals("fail", student.getResult());
    }
    public void testResultAllpass() {
        Student student = new Student();
        student.setMarks1(100);
        student.setMarks2(100);
        student.setMarks3(100);

        assertEquals("pass", student.getResult());
    }
}
