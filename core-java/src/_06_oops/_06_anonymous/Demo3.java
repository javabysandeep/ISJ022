package _06_oops._06_anonymous;

public class Demo3 {
    public static void main(String[] args) {
        interface NotificationService {
            void notifyUser();
        }

        NotificationService notificationService = new NotificationService() {
            public void notifyUser() {
                System.out.println("notifyUser::sms");
            }
        };
        notificationService.notifyUser();


    }
}
