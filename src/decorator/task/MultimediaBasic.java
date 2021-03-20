package decorator.task;

public class MultimediaBasic implements Functionals {
    @Override
    public String description() {
        return "You have package with: ";
    }

    @Override
    public void play() {
        System.out.println("Play ");

    }
}
