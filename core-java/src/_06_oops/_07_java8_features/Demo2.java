package _06_oops._07_java8_features;

public class Demo2 {
    public static void main(String[] args) {

        interface NotificationService {
            void notifyUser();
            default void pushNotification(){
                System.out.println("default implementation for all the subclasses");
            }
        }

        class Impl1 implements NotificationService {
            @Override
            public void notifyUser() {
                System.out.println("Impl1");
            }
        }
        class Impl2 implements NotificationService {
            @Override
            public void notifyUser() {
                System.out.println("Impl2");
            }
        }

        Impl1 impl1 = new Impl1();
        Impl2 impl2 = new Impl2();

        impl1.pushNotification();
        impl2.pushNotification();
    }
}
