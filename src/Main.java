import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Math.random;

public class Main {
    public final static int SIZE_TAB = 25;

    public static void main(String[] args) {
        System.out.println("Metoda sortowania kubełkowego\n");
        List<Integer> listNumber;

        System.out.println("Lista nieposortowana");
        listNumber = generateList();
        for (int nr : listNumber) System.out.print(nr + ", ");
        System.out.println();

        listNumber = sort(listNumber, 1);

        listNumber = sort(listNumber, 2);

        listNumber = sort(listNumber, 3);

        listNumber = sort(listNumber, 4);

        listNumber = sort(listNumber, 5);

        System.out.println("Lista posortowana");
        for (int nr : listNumber) System.out.print(nr + ", ");

    }

    public static List<Integer> generateList() {
        List<Integer> listNumber = new ArrayList<>();
        for (int i = 0; i < SIZE_TAB; i++) listNumber.add((int) (random() * 1000));
        return listNumber;
    }

    public static List<Integer> sort(List<Integer> listNumber, int degree) {
        List<Integer> list0 = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();
        List<Integer> list4 = new ArrayList<>();
        List<Integer> list5 = new ArrayList<>();
        List<Integer> list6 = new ArrayList<>();
        List<Integer> list7 = new ArrayList<>();
        List<Integer> list8 = new ArrayList<>();
        List<Integer> list9 = new ArrayList<>();

        int choice = 0;

        for (int nr : listNumber) {
            switch (degree) {
                case 1 -> choice = nr % 10;  // sortowanie po jednościach
                case 2 -> choice = (nr / 10) % 10;  // sortowanie po dziesiątkach
                case 3 -> choice = (nr / 100) % 10;  // sortowanie po setkach
                case 4 -> choice = (nr / 1000) % 10;  // sortowanie po tysiącach
                case 5 -> choice = (nr / 10000) % 10;  // sortowanie po dziesiątkach tysięcy
            }

            switch (choice) {
                case 0 -> list0.add(nr);
                case 1 -> list1.add(nr);
                case 2 -> list2.add(nr);
                case 3 -> list3.add(nr);
                case 4 -> list4.add(nr);
                case 5 -> list5.add(nr);
                case 6 -> list6.add(nr);
                case 7 -> list7.add(nr);
                case 8 -> list8.add(nr);
                case 9 -> list9.add(nr);
            }
        }

        listNumber.clear();
        listNumber.addAll(list0);
        listNumber.addAll(list1);
        listNumber.addAll(list2);
        listNumber.addAll(list3);
        listNumber.addAll(list4);
        listNumber.addAll(list5);
        listNumber.addAll(list6);
        listNumber.addAll(list7);
        listNumber.addAll(list8);
        listNumber.addAll(list9);

        return listNumber;
    }

}