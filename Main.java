import java.util.ArrayList;
public class Main 
{
    public static void main(String[] args)
    {
        WordChecker w = new WordChecker(); 
        ArrayList<String> words = new ArrayList<String>();
        words.add("an");
        words.add("band");
        words.add("band");
        words.add("abandon");
        System.out.println(words);
        WordChecker x = new WordChecker(words);
        
    }
}