import  java.util.ArrayList;
public class Main {

    public static void main(String[] args) {

        Fighter player1 = new Fighter("Doug");
        player1.showStats();

        System.out.println("There are, "+PlayerCharacter.numCharacters()+" characters\n");

        Paladin player2 = new Paladin("Neeraj");
        player2.showStats();

        System.out.println("There are, "+PlayerCharacter.numCharacters()+" characters\n");

        Priest player3 = new Priest("Sai");
        player3.showStats();

        System.out.println("There are, "+PlayerCharacter.numCharacters()+" characters\n");

        Mage player4 =new Mage("Ryan");
        player4.showStats();

        System.out.println("There are, "+PlayerCharacter.numCharacters()+" characters\n");

        ArrayList<PlayerCharacter> players = new ArrayList<PlayerCharacter>();
        players.add(new Fighter ("Doug"));
        players.add(new Paladin("Neeraj"));
        players.add(new Priest("Sai"));
        players.add(new Mage("Ryan"));
    }
}
