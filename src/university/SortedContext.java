package university;

import java.util.List;

public class SortedContext {
    private SortedStrategy sortedStrategy;

    public SortedContext setSortedStrategy(SortedStrategy sortedStrategy) {
        this.sortedStrategy = sortedStrategy;
        return this;
    }
    public void display(List<Person> myList){
        sortedStrategy.display(myList);
    }
}
