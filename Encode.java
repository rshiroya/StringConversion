
/**
 * This class has a constructor method which has a for loop ongoing.
 *
 * @author R. Shiroya
 * @version 02-20-2020
 */
public class Encode
{
    String original;
    String modified;
    public Encode(String mod)
    {
       
       original = new String(mod);
       modified = new String(mod);
       for( int k = 0; k<modified.length(); k++)
       {
           modified = mod.setCharAt(mod, char mod + 1);
        }
       
    }

}
