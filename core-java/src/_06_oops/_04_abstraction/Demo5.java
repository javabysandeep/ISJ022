package _06_oops._04_abstraction;

public class Demo5 {
    public static void main(String[] args) {
        interface NotificationService {
            void notifyUser();
        }
        class NotificationServiceImpl implements NotificationService {
            @Override
            public void notifyUser() {
                System.out.println("Notification Service is notified");
            }
        }

        NotificationService notificationService = new NotificationServiceImpl();
        notificationService.notifyUser();
    }
}
