package decorator.task;

public class Telephone extends MultimediaDecorator{
    public Telephone(Functionals multimediaDec) {
        super(multimediaDec);
    }

    @Override
    public String description() {
        return multimediaDec.description()+" - Telephone";
    }

    @Override
    public void play() {
        System.out.println("Play on Telephone");
    }
}
