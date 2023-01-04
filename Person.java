public class Person {
    private String fullName;
    private int age;
    public void move(){
        System.out.print("Person is moving!");
    }
    public void talk(){
        System.out.print("Person is talking!");
    }
    public Person(){

    }
    public Person(String fullName, int age){//3
        this.fullName = fullName;
        this.age = age;
    }
    public void SetfullName(String fullName){
        this.fullName = fullName;
    }
    public void SetAge(int age){
        this.age = age;
    }
    public String getFullName(){
        return fullName;
    }
    public int getAge(){
        return age;
    }

}