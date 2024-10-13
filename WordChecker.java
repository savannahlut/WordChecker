import java.util.ArrayList;
public class WordChecker {
    private ArrayList<String> wordList;
    public WordChecker (ArrayList<String> list)
    {
        wordList = list;
    }
    public WordChecker ()
    {
        wordList = new ArrayList<String>();
    }
    public boolean isWordChain() 
    {
        for(int i = 1; i < wordList.size(); i++)
        {
            String after = wordList.get(i); 
            String before = wordList.get(i - 1); 
            if (after.indexOf(before) < 0) return false; 
        }
        return true;
    }
    public ArrayList<String> createList(String target)
    {
        ArrayList<String> newList = new ArrayList<String>();
        if (wordList.get(0) == target)
        {
            String after = wordList.get(0);
            after = after.substring(3, after.length());
            newList.add(after);
        }
        return newList; 
    }
}