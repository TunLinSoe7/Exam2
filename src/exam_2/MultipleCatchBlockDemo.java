package exam_2;

public class MultipleCatchBlockDemo {
    public static void main(String[] args) {
        int a =4;
        int b =0;
        int result;
        try{
            result = a/b;
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
