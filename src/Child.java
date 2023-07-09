public class Child extends Parent {
    public Child()
    {
        System.out.println("initialization Child");
    }
    public Child(String name){
        System.out.println("initialization Child with name");
    }
    public Child(int age, String name){
        System.out.println("initialization Child with name and age");
    }
}
