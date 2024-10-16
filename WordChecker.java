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
        for (String og : wordList)
        {
            if (og.indexOf(target) == 0)
            {
                String after = og.substring(target.length());
                newList.add(after);
            }
        }
        return newList;
    }
}