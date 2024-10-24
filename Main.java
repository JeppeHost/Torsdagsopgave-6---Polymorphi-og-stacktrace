import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        testMethods();
        testSchool();
        testShapes();
    }

    public static void testShapes(){
        Square square1 = new Square(5.67);
        System.out.println("The area of square1 is: " + square1.getArea());
        Circle circle1 = new Circle(2.8);
        System.out.println("The area of circle1 is: " + circle1.getArea());
        ShapeBuilder shapeBuilder = new ShapeBuilder();
        shapeBuilder.addShape(square1);
        shapeBuilder.addShape(circle1);
        System.out.println("The total area of all shapes is: " + shapeBuilder.getTotalArea());

    }

    public static void testSchool() {

        ArrayList<Person> persons = new ArrayList<>();

        ArrayList<String> student1PassedCourses = new ArrayList<>();
        student1PassedCourses.add("Java 1.0");
        student1PassedCourses.add("Python");
        persons.add(new Student("Jeppe", student1PassedCourses));

        ArrayList<String> student2PassedCourses = new ArrayList<>();
        student2PassedCourses.add("Python");
        persons.add(new Student("Rasmus", student2PassedCourses));

        ArrayList<String> teacher1CanTeachCourses = new ArrayList<String>();
        teacher1CanTeachCourses.add("Python");
        teacher1CanTeachCourses.add("Java 1.0");
        persons.add(new Teacher("Signe", teacher1CanTeachCourses));

        ArrayList<String> teacher2CanTeachCourses = new ArrayList<String>();
        teacher2CanTeachCourses.add("Python");
        teacher2CanTeachCourses.add("C#");
        persons.add(new Teacher("Tess", teacher2CanTeachCourses));

        for (Person p : persons) {
            boolean courseAdded = p.addCourse("Java 1.0");
            if(courseAdded) {
                continue;
            }
            if(p instanceof Student) {
                System.out.println(p.getName() + " har allerede bestået dette kursus.");
            } else if(p instanceof Teacher) {
                System.out.println(p.getName() + " kan ikke undervise i dette fag.");
            }
        }
    }


    public static void testMethods(){

        Methods methods = new Methods();
        methods.methodA();
        methods.methodB();
        methods.methodC();
        methods.methodD();
        methods.methodE();
        methods.methodF();
        methods.methodG();
        methods.methodH();
        methods.methodI();
        methods.methodJ();
        methods.methodK();
    }
}







