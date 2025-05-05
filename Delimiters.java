import java.util.ArrayList;
public class Delimiters
{

private String openDel;
private String closeDel;

public Delimiters(String open, String close)
{
openDel = open;
closeDel = close;
}

public ArrayList<String> getDelimitersList(String[] tokens)
{
    ArrayList<String> delims = new ArrayList<String>();
    for (String str : tokens)
    {
        if (str.equals(openDel) || str.equals(closeDel))
        {
            delims.add(str);
        }   
    }
    return delims;
}

public boolean isBalanced(ArrayList<String> delimiters)
{
    int opencount = 0;
    int closecount = 0;
    for (String str : delimiters)
    {
        if (str.equals(openDel))
        {
            opencount++;
        }  
        if (str.equals(closeDel))
        {
            closecount++;
        }    
        if(closecount > opencount) return false;

    }
    return closecount == opencount;
}

}