public class Singer extends  Person{
    String bandName;
    public Singer(String name, String lastName, String profession, int age, String bandName) {
        super(name, lastName, profession, age);
        this.bandName = bandName;
    }

    public  void singing(){
        System.out.println(" i love sing");
    }
    public void playGitar(){
        System.out.println(" i play gitar");
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
