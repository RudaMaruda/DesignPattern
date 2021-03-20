package decorator.task;

public abstract class MultimediaDecorator implements Functionals{
    protected Functionals multimediaDec;

    public MultimediaDecorator(Functionals multimediaDec) {
        this.multimediaDec = multimediaDec;
    }
}
