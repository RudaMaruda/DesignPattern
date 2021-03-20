package university;

import java.util.Comparator;
import java.util.List;

public class ArraysSortedFirstName implements SortedStrategy {
    @Override
    public void display(List<Person> myList) {
        myList.stream()
                .sorted(Comparator.comparing(Person::getFirstName))
                .forEach(System.out::println);
    }
}
