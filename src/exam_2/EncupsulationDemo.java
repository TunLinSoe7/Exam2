package exam_2;
class School{
    private String location;
    private int SchoolNumber;

    public School(String location, int SchoolNumber) {
        this.location = location;
        this.SchoolNumber = SchoolNumber;
    }
    void answer(){
        System.out.println("location is"+ location);
        System.out.println("SchoolNumber is"+ SchoolNumber);
    }
}

public class EncupsulationDemo {
    public static void main(String[] args) {
       School school = new School("Yangon",12);
       school.answer();
    }
}
