import java.util.ArrayList;
import java.util.Comparator;

public class ESort {

    // Roll number comparator class
    public static class RollNumberComparator implements Comparator<Student> {
        @Override
        public int compare(Student s1, Student s2) {
            return Integer.compare(s1.getRollno(), s2.getRollno());
        }
    }


    // Merge sort by name
    public static void mergeSortName(ArrayList<Student> students) {
        if (students.size() <= 1) {
            return;
        }

        int mid = students.size() / 2;
        ArrayList<Student> left = new ArrayList<>();
        ArrayList<Student> right = new ArrayList<>();

        for (int i = 0; i < mid; i++) {
            left.add(students.get(i));
        }
        for (int i = mid; i < students.size(); i++) {
            right.add(students.get(i));
        }

        mergeSortName(left);
        mergeSortName(right);

        mergeByName(students, left, right);
    }

    private static void mergeByName(ArrayList<Student> students, ArrayList<Student> left, ArrayList<Student> right) {
        int i = 0, j = 0, k = 0;

        while (i < left.size() && j < right.size()) {
            if (left.get(i).getName().compareToIgnoreCase(right.get(j).getName()) <= 0) { // Compare names
                students.set(k, left.get(i));
                i++;
            } else {
                students.set(k, right.get(j));
                j++;
            }
            k++;
        }

        while (i < left.size()) {
            students.set(k, left.get(i));
            i++;
            k++;
        }

        while (j < right.size()) {
            students.set(k, right.get(j));
            j++;
            k++;
        }
    }
}

