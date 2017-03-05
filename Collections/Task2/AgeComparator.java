package Collections.Task2;

import java.util.Comparator;

public class AgeComparator implements Comparator<students> {
    @Override
    public int compare(students studentsFirst, students studentsSecond) {
        return new Integer(studentsSecond.getAge()).compareTo(studentsFirst.getAge());
    }
}
