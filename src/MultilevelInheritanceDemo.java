class Phone{
    int a = 2;
}
class Keypad extends  Phone{
    int b =1;
    void show(){
        System.out.println("I am method of B");
    }
}
class SmartPhone extends Keypad{
    int c = 9;
}

public class MultilevelInheritanceDemo {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone();
        System.out.println(smartPhone.a);
        System.out.println(smartPhone.b);
        System.out.println(smartPhone.c);
    }
}