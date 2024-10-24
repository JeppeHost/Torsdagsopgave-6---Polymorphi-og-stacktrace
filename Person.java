public abstract class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name != null && name != ""){
            this.name = name;
        }
    }

    public abstract boolean addCourse(String course);


}
