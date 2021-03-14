package builder.task;

public enum Size {
    SMALL,
    MEDIUM,
    LARGE;

    public static int displayCM(Size size){
        if (size==Size.SMALL){
           return 15;
        } else if (size==Size.MEDIUM){
            return 22;
        } else{
            return 30;
        }
    }
}
