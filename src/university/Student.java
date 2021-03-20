package university;

public class Student extends Person{
    private String course;
    public Student(StudentBuilder studentBuilder){
        super(studentBuilder.firstName,studentBuilder.surName);
        this.course = studentBuilder.course;
    }


    public static class StudentBuilder{
        private String firstName;
        private String surName;
        private String course;

        public StudentBuilder(String firstName, String surName) {
            this.firstName = firstName;
            this.surName = surName;

        }

        public StudentBuilder setCourse(String course) {
            this.course = course;
            return this;
        }

        public Student build(){
            return new Student(this);
        }
    }
}
