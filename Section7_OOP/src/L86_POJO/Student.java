package L86_POJO;

public class Student {

    private String id;
    private String name;
    private String dOB;
    private String classList;

    //constructor

    public Student(String id, String name, String dOB, String classList) {
        this.id = id;
        this.name = name;
        this.dOB = dOB;
        this.classList = classList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dOB='" + dOB + '\'' +
                ", classList='" + classList + '\'' +
                '}';
    }


    //"boilerplate" code; setter and getter

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getdOB() {
        return dOB;
    }

    public void setdOB(String dOB) {
        this.dOB = dOB;
    }

    public String getClassList() {
        return classList;
    }

    public void setClassList(String classList) {
        this.classList = classList;
    }
}
