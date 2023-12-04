import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class StudentAttendanceRecordTest {
    @Test public void testThatStudentReceiveAwardIfPresentForThreeDays(){
        String attendance = "PPALLP";
        boolean awardGiven = StudentAttendanceRecord.isAwardGranted(attendance);
         assertTrue(awardGiven);
    }
    @Test public void testThatStudentWontReceiveAwardIfLateForThreeDays(){
        String attendance = "PPALLL";
        boolean awardGiven = StudentAttendanceRecord.isAwardGranted(attendance);
        assertFalse(awardGiven);
    }
    @Test public void whenStudentIsAlwaysLateResultTest(){
        String attendance = "LLLLLL";
        boolean awardGiven = StudentAttendanceRecord.isAwardGranted(attendance);
        assertFalse(awardGiven);
    }
    @Test public void whenStudentIsAlwaysPresentTest(){
        String attendance = "ppppp";
        boolean awardGiven = StudentAttendanceRecord.isAwardGranted(attendance);
        assertFalse(awardGiven);
    }
    @Test public void whenStudentIsAbsentForMoreTwoDayTest(){
        String attendance = "papaa" +
                "p";
        boolean awardGiven = StudentAttendanceRecord.isAwardGranted(attendance);
        assertFalse(awardGiven);
    }






}