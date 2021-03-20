package university;

import java.util.Comparator;
import java.util.List;

public class ArraysSortedSurName implements SortedStrategy{

    @Override
    public void display(List<Person> myList) {
        myList.stream()
                .sorted(Comparator.comparing(Person::getSurName))
                .forEach(System.out::println);
    }
}

