public class StudentAttendanceRecord {

    public static boolean isAwardGranted(String attendance) {
        String covertAttendance = attendance.toUpperCase();
        int countA = 0;
        int countL = 0;
        int countP = 0;
        if (covertAttendance.length() == 6) {
            for (int index = 0; index < attendance.length(); index++) {
                if (covertAttendance.charAt(index) == 'A') {
                    countA++;
                } else if (covertAttendance.charAt(index) == 'L') {
                    countL++;
                } else if (covertAttendance.charAt(index) == 'P') {
                    countP++;
                }
            }
        }
        if (countA <= 2 && countL < 3 && countP >= 3) return true;
        return false;
    }
}
