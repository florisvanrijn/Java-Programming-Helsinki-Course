
public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
        printWithSmileys("87.");
        printWithSmileys("Interface");
    }
    private static void printWithSmileys(String characterString){
        //find out the length of the string
        //height is fixed at 3.
        //for each length of character string, print a smiley in row 1
        
        if(characterString.length() % 2 == 1){
            int lengthString = characterString.length() + 8;
            printSmileyBox(lengthString, characterString, "  ");
        } else {
            int lengthString = characterString.length() +6;             
            printSmileyBox(lengthString, characterString, " ");
        }
    }
    private static void lineOfSmileys(int numberOfSmileys){
        for (int i = 0; i < numberOfSmileys; i++) {
            System.out.print(":)");
        }
    }
    private static void printSpace(){
        System.out.println("");
    }
    private static void printSmileyBox(int lengthString, String characterString, String spacesToTheRight){
        int lengthSurroundingSmileys = lengthString/2;
        //extra printSpace() kept in for formatting, but tests don't like it
        printSpace();
        lineOfSmileys(lengthSurroundingSmileys);
        printSpace();
        lineOfSmileys(1);
        printActualString(characterString, spacesToTheRight);
        lineOfSmileys(1);
        printSpace();
        lineOfSmileys(lengthSurroundingSmileys);        
    }
    private static void printActualString(String characterString, String spacesToTheRight){
        System.out.print(" " + characterString + spacesToTheRight);        
    }
}
