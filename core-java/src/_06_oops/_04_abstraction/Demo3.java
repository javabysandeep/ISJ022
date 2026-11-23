package _06_oops._04_abstraction;

public class Demo3 {
    public static void main(String[] args) {

        interface NotificationService {
        // java 7 : only abstract methods
        // java 8
            //  variables : public static final
            // methods : public abstract {static method, default method}
            // nested classes : public static

            int x = 100;
            public static final int y = 200;

            //void m1(){} // IM not allowed


            void m1();

            public abstract void m2();

            public static void m3() {
            }

            public default void m4() {
            }


        }
        // new NotificationService();//cte
    }
}

