public class Main
{
    public static void main(String[] args)
    {
        HeroManager manager = new HeroManager();

        manager.addHero(new Hero("Spider-Man", 85, Affiliation.AVENGERS));
        manager.addHero(new Hero("Batman", 90, Affiliation.JUSTICE_LEAGUE));
        manager.addHero(new Hero("Wolverine", 88, Affiliation.X_MEN));
        manager.addHero(new Hero("Storm", 90, Affiliation.FANTASTIC_FOUR));

        System.out.println(".... Original Hero List ...."); // display original hero list
        manager.displayHeroes();

        System.out.println(".... Bubble Sort by Power Level ...."); // sort thru bubble sort
        manager.bubbleSortByPower();
        manager.displayHeroes();

        System.out.println("\n.... Insertion Sort by Power Level ...."); // sort thru insertion sort
        manager.insertionSortByPower();
        manager.displayHeroes();

        System.out.println("\n... Removing 'Wolverine' ..."); // remove a hero
        manager.removeHero("Wolverine");
        manager.displayHeroes();

        System.out.println("\n... Adding 'Wonder Woman' ..."); // add a hero
        manager.addHero(new Hero("Wonder Woman", 95, Affiliation.JUSTICE_LEAGUE));
        manager.displayHeroes();

        System.out.println("\n.... Heroes in 2D Format ....");
        manager.displayHeroes2D();

    }
}