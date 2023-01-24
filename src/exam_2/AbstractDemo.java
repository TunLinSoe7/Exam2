package exam_2;
abstract class CodeWall{
    abstract void student();
}
public class AbstractDemo extends CodeWall{
    @Override
    void student() {
        System.out.println("I am a student");
    }

    public static void main(String[] args) {
        AbstractDemo abstractDemo = new AbstractDemo();
        abstractDemo.student();
    }
}
