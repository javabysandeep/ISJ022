package _04_control_statements._03_jump;

public class Demo5Return {
    public static void main(String[] args) {
        //break; //CTE : break can be written only inside the switch or loop
        switch (1){
            case 0: System.out.println("zero");return;
            case 1 : System.out.println("one");break;
            case 2 : System.out.println("two");break;
            case 3 : System.out.println("three");break;
            case 4 : System.out.println("four");break;
            case 5 : System.out.println("five");break;
            case 6 : System.out.println("six");break;
            case 7 : System.out.println("seven");break;
            case 8 : System.out.println("eight");break;
            case 9 : System.out.println("nine");break;
            default: System.out.println("invalid digit");break;
        }
        System.out.println("rest of the main method");
    }
}
