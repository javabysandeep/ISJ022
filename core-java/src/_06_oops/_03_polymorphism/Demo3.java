package _06_oops._03_polymorphism;

public class Demo3 {
    public static void main(String[] args) {

        class UserNotification {
            protected void notifyUser() {
                System.out.println("notifyUser using email");
            }
        }

        class UserNotificationImpl extends UserNotification {
            @Override
             public void notifyUser() {
                //super.notifyUser();
                System.out.println("notifyUser using whatsApp");
                System.out.println("notifyUser using SMS");
            }
        }

        UserNotificationImpl ref = new UserNotificationImpl();
        ref.notifyUser();

    }

}
