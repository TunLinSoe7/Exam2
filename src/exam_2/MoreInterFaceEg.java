package exam_2;
interface A{
    void B();
}
interface  C{
    void E();
}
public class MoreInterFaceEg implements A,C {

    @Override
    public void B() {
        System.out.println("Override method of B");
    }

    @Override
    public void E() {
        System.out.println("Override method of E");
    }

    public static void main(String[] args) {
        MoreInterFaceEg moreInterFaceEg = new MoreInterFaceEg();
        moreInterFaceEg.B();
        moreInterFaceEg.E();
    }
}
