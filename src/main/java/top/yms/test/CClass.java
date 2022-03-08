package top.yms.test;

public class CClass {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private AClass aClass;

    public AClass getaClass() {
        return aClass;
    }

    public void setaClass(AClass aClass) {
        this.aClass = aClass;
    }

    public void doPrint() {
        System.out.println("the ref class is "+aClass);
        System.out.println("the class name is "+name);
    }
}
