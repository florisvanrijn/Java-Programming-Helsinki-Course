
public class Main {

    public static void main(String[] args) {
        // use this main class to test your program!
        Container container = new Container(1000);
        addSuitcasesFullOfBricks(container);
        System.out.println(container);
    }
    public static void addSuitcasesFullOfBricks(Container container){
        int weightOfSuitcase = 1;
        int maxSuitcaseWeight = 1000;
        
        for (int i = 0; i < 99; i++) {
            Thing brick = new Thing("Brick", weightOfSuitcase);
            Suitcase suitcase = new Suitcase(maxSuitcaseWeight);
            suitcase.addThing(brick);
            container.addSuitcase(suitcase);
            weightOfSuitcase++;
        }
    }
}
