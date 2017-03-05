package Collections.Task2;

import java.util.Comparator;

public class MarkComparator implements Comparator<students> {
    @Override
    public int compare(students studentFirst, students studentsSecond) {
        return new Double(studentsSecond.getMark()).compareTo(studentFirst.getMark());

    }
}