package _05_class_components;

public class Demo4 {
    void im1(){
        System.out.println("Demo4:im1() --> instance method");
    }
    static void sm1(){
        System.out.println("Demo4:sm1() --> static method");
    }

    void caller1(){
        //call im1, sm1
        im1();
        this.im1(); // recommended

        sm1();
        Demo4.sm1();//recommended
        this.sm1();
    }


    static void caller2(){
        //call im1, sm1
        Demo4 ref = new Demo4();
        ref.im1();
        // this keyword is not applicable as static methods wont need object to call them

        sm1();
        Demo4.sm1();//recommended

    }

}
