import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // ArrayList to store Student objects
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(10, "Bill", "1111 Twix St"));
        students.add(new Student(9, "Will", "1212 Snickers St"));
        students.add(new Student(8, "Bob", "1313 Nerds St"));
        students.add(new Student(7, "Jeremy", "1414 Skittles St"));
        students.add(new Student(6, "Julie", "1515 AirHeads St"));
        students.add(new Student(5, "Debbie", "1616 Twizzlers St"));
        students.add(new Student(4, "George", "1717 GummyWorm St"));
        students.add(new Student(3, "Lukas", "1818 Butterscotch St"));
        students.add(new Student(2, "Remi", "1919 ButterFingers St"));
        students.add(new Student(1, "Landen", "2020 Warheads St"));

        System.out.println("Before Sorting:");
        for (Student student : students) {
            System.out.println(student);
        }

        // Sort the students by roll number
        students.sort(new ESort.RollNumberComparator());
        System.out.println("\nAfter Sorting by Roll Number:");
        for (Student student : students) {
            System.out.println(student);
        }

        // Sort the students by name
        ESort.mergeSortName(students);
        System.out.println("\nAfter Sorting by Name:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}