package university;

import facade.RegisterService;

import java.util.List;

public class PersonFacade {


    public Student addStudent(String firstName, String surName, String course){
        return new Student.StudentBuilder(firstName,surName).setCourse(course).build();
    }

    public Teacher addTeacher(String firstName, String surName, List<String> blocks){
        return new Teacher.TeacherBuilder(firstName,surName).setBlocks(blocks).bulid();
    }

    public void displayFirstNameSorted(List<Person> myList){
        this.display(new ArraysSortedFirstName(),myList);
    }

    public void displaySurNameSorted(List<Person> myList){
        this.display(new ArraysSortedSurName(),myList);
    }

    private void display(SortedStrategy sortedStrategy,List<Person> myList){
        SortedContext sortedContext = new SortedContext();
        sortedContext.setSortedStrategy(sortedStrategy);
        sortedContext.display(myList);
    }
}
