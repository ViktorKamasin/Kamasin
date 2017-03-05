package Collections.Task2;


import java.util.Comparator;

public class NameComparator implements Comparator<students> {
    @Override
    public int compare(students studentsFirst, students studentsSecond) {
        int compareResult = studentsFirst.getFirstName().compareTo(studentsSecond.getFirstName());
        if (compareResult == 0) {
            return studentsFirst.getLastName().compareTo(studentsSecond.getLastName());
        }
        return compareResult;

    }
}