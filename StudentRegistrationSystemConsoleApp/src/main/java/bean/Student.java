package bean;

public class Student {
    private String name;
    private String surname;
    private int age;
    private String className;

    public Student(String name, String className, int age, String surname) {
        this.name = name;
        this.className = className;
        this.age = age;
        this.surname = surname;
    }

    public Student() {

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getFullInfo(){
        return this.getName()+" "+this.getSurname()+" "+this.getAge()+" "+this.getClassName();
    } //bunlari birlesdirir return edir
}
