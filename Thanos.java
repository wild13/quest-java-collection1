import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Thanos {

    public static void main( String[] args ) {

        // TODO 1 : Create an empty heroes list

        List<Hero> heroes = new ArrayList<Hero>();

        // TODO 2 : Add those heroes to the list

        // Instanciation des héros
        Hero black_Wido = new Hero( "Black Widow", 34 );
        Hero captain_America = new Hero( "Captain America", 100 );
        Hero vision = new Hero( "Vision", 3 );
        Hero iron_Man = new Hero( "Iron Man", 48 );
        Hero scarlet_Witch = new Hero( "Scarlet Witch", 29 );
        Hero thor = new Hero( "Thor", 1500 );
        Hero spider_Man = new Hero( "Spider-Man", 18 );
        Hero hulk = new Hero( "Hulk", 49 );
        Hero doctor_Strange = new Hero( "Doctor Strange", 42 );

        // Ajout dans la liste
        heroes.add( black_Wido );
        heroes.add( captain_America );
        heroes.add( vision );
        heroes.add( iron_Man );
        heroes.add( scarlet_Witch );
        heroes.add( thor );
        heroes.add( spider_Man );
        heroes.add( hulk );
        heroes.add( doctor_Strange );

        // TODO 3 : It's Thor birthday, now he's 1501

        thor.setAge( 1501 );

        // TODO 4 : Shuffle the heroes list

        Collections.shuffle( heroes );

        // TODO 5 : Keep only the half of the list

        heroes = heroes.subList( 0, heroes.size() / 2 );

        // TODO 6 : Loop throught the list and display the name of the remaining
        // heroes

        for ( Hero h : heroes ) {
            System.out.println( h.getName() + " " + h.getAge() );
        }
    }
}