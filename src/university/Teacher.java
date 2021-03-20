package university;

import java.util.List;

public class Teacher extends Person{
    private List<String> blocks;

    public Teacher(TeacherBuilder teacherBuilder){
        super(teacherBuilder.firstName, teacherBuilder.surName);
        this.blocks = teacherBuilder.blocks;
    }
    public static class TeacherBuilder{
        private String firstName;
        private String surName;
        private List<String> blocks;

        public TeacherBuilder(String firstName, String surName) {
            this.firstName = firstName;
            this.surName = surName;

        }

        public TeacherBuilder setBlocks(List<String> blocks) {
            this.blocks = blocks;
            return this;
        }
        public Teacher bulid(){
            return new Teacher(this);
        }
    }

}
