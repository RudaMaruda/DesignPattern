package decorator.task;

public class Internet extends MultimediaDecorator{

    public Internet(Functionals multimediaDec) {
        super(multimediaDec);
    }

    @Override
    public String description() {
        return multimediaDec.description()+" - Internet ";
    }

    @Override
    public void play() {
        System.out.println("Play in Internet");

    }
}
