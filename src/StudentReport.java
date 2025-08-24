import java.util.*;
public class StudentReport {

    public static int[] studentReport(int noOfStudents, int noOfSubjects, int[][] marksPerSubjectPerStudent ){
        int[] result = new int[noOfStudents];
        int[] totals = new int[noOfSubjects];

        for(int i=0; i<noOfStudents; i++){
            for(int j=0; j<noOfSubjects; j++){
                totals[j] +=marksPerSubjectPerStudent[i][j];
            }

        }
        int subjectId = 0;

        for (int i = 1; i < totals.length; i++) {
            if (totals[i] < totals[subjectId]) {
                subjectId = i;
            }
        }

        for(int i=0; i<noOfStudents; i++){
            for(int j=0; j<noOfSubjects; j++){
                if(j != subjectId) {
                    result[i] += marksPerSubjectPerStudent[i][j];
                }
            }

        }

        return result;
    }

    public static void main(String args[]) {

        int[][] marksPerSubjectPerStudent = {{50,30,70},
                                             {30,70,99},
                                             {99,20,30}};
        studentReport(3,3,marksPerSubjectPerStudent);

    }
}