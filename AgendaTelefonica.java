import java.util.HashMap;
/**
 * Write a description of class AgendaTelefonica here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AgendaTelefonica
{
    // instance variables - replace the example below with your own
    HashMap<String , String> agenda;

    /**
     * Constructor for objects of class AgendaTelefonica
     */
    public AgendaTelefonica()
    {
        agenda = new HashMap<>();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void enterNumber (String name , String number){
        agenda.put(name, number);
    }
    
    public void lookupNumber(String name){
        System.out.println(agenda.get(name));
    }
}
