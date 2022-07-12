public class Person {
    private String name;
    private String lastName;
    private String profession;
    private int age;

    public void learn(){
        System.out.println("I learn ");
    }
    public void walk(){
        System.out.println("I can every day walk");
    }
    public void eat(){
        System.out.println(" I love Beshbarmak");
    }

    public Person(String name, String lastName, String profession, int age) {
        this.name = name;
        this.lastName = lastName;
        this.profession = profession;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString(){
        return "My name is " + name + "\n" + " My last name " + lastName + "\n"
                + " i am  " + age + " years old " + "\n" +  " I am " + profession;
    }
}
