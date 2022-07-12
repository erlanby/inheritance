public class Main {
    public static void main(String[] args) {
        Programmer programmer = new Programmer("Azamat", "Asanov", "backend developer", 25, "Peaksoft" );
        Dancer dancer = new Dancer("Aida", "Imanalieva", "Dance", 25, "Super Girls" );
        Singer singer = new Singer(" Elnura ", " Tadzhibaeva", "Singer", 23, "Best Girls");

        System.out.println(programmer + " \n"+ "I work "+  programmer.companyName);
        programmer.coding();
        programmer.learn();
        programmer.eat();
        programmer.walk();

        System.out.println("--------------");


        System.out.println(dancer + " \n" + "My group name " + dancer.groupName);
        dancer.dancing();
        dancer.learn();
        dancer.walk();
        dancer.eat();

        System.out.println("--------------");

        System.out.println(singer + " \n" + "My band name  " + singer.bandName);
        singer.singing();
        singer.playGitar();
        singer.learn();
        singer.walk();
        singer.eat();


    }
}