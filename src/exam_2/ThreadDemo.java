package exam_2;
class Buddy implements Runnable{

    @Override
    public void run() {
        System.out.println("I am run method");
    }
}
public class ThreadDemo {
    public static void main(String[] args) {
        Buddy buddy = new Buddy();
        buddy.run();

    }
}
