package Collections.Task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Iterator;

public class Univercity {
    public static void main(String[] args) {
        List<students> students = new ArrayList<>();
        students.add(new students("Nikolay", "Rastorguev", 50, 7.9));
        students.add(new students("Oleg", "Gazmanov", 52, 8.1));
        students.add(new students("Alla", "Pugacheva", 63, 9.2));
        students.add(new students("Fillip", "Kirkorov", 18, 9.5));
        System.out.println("Сортировка по ФИО");
        Collections.sort(students, new NameComparator());
        printList(students);
        System.out.println("Сортировка по оценкам");
        Collections.sort(students, new MarkComparator());
        printList(students);
        System.out.println("Сортировка по возрасту");
        Collections.sort(students, new AgeComparator());
        printList(students);
        System.out.println("Самая высока оценка у: ");
        highestMark(students);
    }

    public static void highestMark(List<students> students) {
        if (students.size() == 0) {
            return;
        }
        double maxMark = students.get(0).getMark();

        Iterator<students> iterator = students.iterator();
        while (iterator.hasNext()) {
            students students1 = iterator.next();
            if (students1.getMark() > maxMark) {
                maxMark = students1.getMark();
            }
        }

        iterator = students.iterator();
        while (iterator.hasNext()) {
            students temp = iterator.next();
            if (temp.getMark() == maxMark) {
                System.out.println(temp);
            }
        }
    }

    public static void printList(List<students> student) {
        for (students students : student) {
            System.out.println(students);
        }
        System.out.println();
    }
}
