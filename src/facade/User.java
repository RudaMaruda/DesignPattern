package facade;

public class User {
    private String firstName;
    private String surName;



    public String getFirstName() {
        return firstName;
    }

    public User setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getSurName() {
        return surName;
    }

    public User setSurName(String surName) {
        this.surName = surName;
        return this;
    }

//    public void register(){
//        System.out.println("Register user");
//    }

    public void sentMail(){
        System.out.println("sending mail to user");
    }

    public void delete(){
        System.out.println("User was deleted");
    }
}
