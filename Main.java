import java.util.ArrayList;
public class Main 
{
    public static void main(String[] args)
    {
        ArrayList<String> words = new ArrayList<String>();
        words.add("an");
        words.add("band");
        words.add("band");
        words.add("abandon");
        WordChecker x = new WordChecker(words);
        System.out.println(x.isWordChain());

        ArrayList<String> more = new ArrayList<String>();
        more.add("to");
        more.add("too");
        more.add("stool");
        more.add("tools");
        WordChecker y = new WordChecker(more);
        System.out.println(y.isWordChain());

        ArrayList<String> beauty = new ArrayList<String>();
        beauty.add("catch");
        beauty.add("bobcat");
        beauty.add("catchacat");
        beauty.add("cat");
        beauty.add("at");
        WordChecker z = new WordChecker(beauty);
        System.out.println(z.createList("cat"));
        System.out.println(z.createList("catch"));
        System.out.println(z.createList("dog"));
    }
}