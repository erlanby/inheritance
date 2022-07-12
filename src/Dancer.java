public class Dancer extends Person{
        String groupName;

    public Dancer(String name, String lastName, String profession, int age, String groupName) {
        super(name, lastName, profession, age);
        this.groupName = groupName;
    }



    public void dancing(){
        System.out.println(" Belly dance");
    }
    @Override
    public void learn(){
        super.learn();
    }
    @Override
    public void eat(){
        super.eat();
    }
    @Override
    public void walk(){
        super.walk();
    }

}
