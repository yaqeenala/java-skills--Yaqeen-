public class GradeManager {

    public static String[] reverseStudentNames(String[] names) {
        String[] reversed = new String[names.length];
        for (int i = 0; i < names.length; i++) {
            String name = names[i];
            String reversedName = "";
            for (int j = name.length() - 1; j >= 0; j--) {
                reversedName = reversedName + name.charAt(j);
            }
            reversed[i] = reversedName;
        }
        return reversed;
    }

    public static char getLatterGrade(int score) {
        char latterGrade;
        if (90 <= score && score <= 100) {
            latterGrade = 'A';
        } else if (80 <= score && score <= 89) {
            latterGrade = 'B';
        } else if (70 <= score && score <= 79) {
            latterGrade = 'C';
        } else if (60 <= score && score <= 69) {
            latterGrade = 'D';
        } else {
            latterGrade = 'F';
        }
        return latterGrade;
    }

    public static String[] findFailingStudents(String[] names, int[] scores) {
        int count = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] < 60) {
                count++;
            }
        }

        String[] failing = new String[count];
        int index = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] < 60) {
                failing[index] = names[i];
                index++;
            }
        }

        return failing;
    }

    public static void main(String[] args) {
        String[] students = {"Alice", "Bob", "Charlie", "Diana"};
        int[] scores = {95, 67, 45, 78};

        String[] reversedNames = reverseStudentNames(students);
        System.out.print("Reversed names: ");
        for (int i = 0; i < reversedNames.length; i++) {
            System.out.print(reversedNames[i] + " ");
        }
        System.out.println();

        System.out.print("Grades: ");
        for (int i = 0; i < scores.length; i++) {
            System.out.print(getLatterGrade(scores[i]) + " ");
        }
        System.out.println();

        String[] failingStudents = findFailingStudents(students, scores);
        System.out.print("Failing students: ");
        for (int i = 0; i < failingStudents.length; i++) {
            System.out.print(failingStudents[i] + " ");
        }
        System.out.println();
    }
}

