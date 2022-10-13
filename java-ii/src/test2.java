public class test2 extends test1{
    private String department;

    public test2(String name, String department) {
        super(name);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }
}
