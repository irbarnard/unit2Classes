

/**
 * Write a description of class VendingMachine here.
 * 
 * @author Ian Barnyard
 * @version 9/19/2014
 */
public class VendingMachine
{
    private int cans;
    private int tokens;
  
    /**
     * Default constructor for objects of class VendingMachine
     */
    public VendingMachine()
    { 
        cans = 10;
        tokens = 0;
    }

    /**
     * pay_for_can() will subtract one from the variable 'cans' and add one to the varaible
     * 'tokens'
     */
    public void insertToken()
    {
       tokens = tokens + 1;
       cans = cans - 1;
    }
    public int get_cans()
    {
        return this.cans;
       
    }
    public int get_tokens()
    {
        return this.tokens;
    }
    
}
