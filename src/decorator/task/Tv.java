package decorator.task;

public class Tv extends MultimediaDecorator{
    public Tv(Functionals multimediaDec) {
        super(multimediaDec);
    }

    @Override
    public String description() {
        return multimediaDec.description()+" - Tv";
    }

    @Override
    public void play() {
        System.out.println("Play on TV");
    }
}
