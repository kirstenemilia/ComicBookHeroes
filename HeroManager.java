import java.util.ArrayList;
import java.util.Arrays;

public class HeroManager
{
    private ArrayList<Hero> heroList = new ArrayList<>();

    public void addHero(Hero hero) // add a hero
    {
        heroList.add(hero);
    }

    public boolean removeHero(String name) // remove a hero
    {
        return heroList.removeIf(hero -> hero.getName().equalsIgnoreCase(name));
    }

    public void bubbleSortByPower() // bubble sort by power level (ascening)
    {
        for (int i = 0; i < heroList.size() - 1; i++)
        {
            for (int j = 0; j < heroList.size() - i - 1; j++)
            {
                if (heroList.get(j).getPowerLevel() > heroList.get(j + 1).getPowerLevel())
                {
                    Hero temp = heroList.get(j);
                    heroList.set(j, heroList.get(j + 1));
                    heroList.set(j + 1, temp);
                }
            }
        }
    }

    public void insertionSortByPower() // insertion sort by power level (ascending)
    {
        for (int i = 1; i < heroList.size(); i++)
        {
            Hero key = heroList.get(i);
            int j = i - 1;
            while (j >= 0 && heroList.get(j).getPowerLevel() > key.getPowerLevel())
            {
                heroList.set(j + 1, heroList.get(j));
                j--;
            }
            heroList.set(j + 1, key);
        }
    }

    public void displayHeroes() // display standard list of heroes
    {
        for (Hero hero:heroList)
        {
            System.out.println(hero);
        }
        System.out.println();
    }

    public void displayHeroes2D() // display as a 2d array
    {
        String[][] heroTable = new String[heroList.size()][3];
        for (int i = 0; i < heroList.size(); i++)
        {
            Hero hero = heroList.get(i);
            heroTable[i][0] = hero.getName();
            heroTable[i][1] = String.valueOf(hero.getPowerLevel());
            heroTable[i][2] = hero.getAffiliation().toString();
        }

        System.out.println("2D Hero Table: ");
        System.out.println(Arrays.deepToString(heroTable));
        System.out.println();
    }
}