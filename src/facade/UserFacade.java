package facade;

public class UserFacade {
    private final RegisterService registerService;
    private final SendNotificationService sendNotificationService;


    public UserFacade(RegisterService registerService, SendNotificationService sendNotificationService) {
        this.registerService = registerService;
        this.sendNotificationService = sendNotificationService;
    }

    public void register(String firstName, String surName){
        User user = new User();
        user.setFirstName(firstName);
        user.setSurName(surName);

        this.registerService.register(user);
        this.sendNotificationService.sendMail();
    }
}
