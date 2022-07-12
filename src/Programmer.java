public class Programmer extends Person {
     String companyName;

    public Programmer(String name, String lastName, String profession, int age, String companyName) {
        super(name, lastName, profession, age);
        this.companyName = companyName;
    }

    public void coding (){
        System.out.println(" I love coding");
    }

    @Override
    public void learn() {
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
