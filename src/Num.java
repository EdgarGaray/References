public class Num
{
    private int value;
    //Sets up the new Num object, storing an initial value
    public Num(int update)
    {
        value = update;
    }
    //returns the stored integer value
    public int getValue()
    {
        return value;
    }
    //sets the stored value to the newly specified value
    public void setValue (int update)
    {
        value = update;
    }
    //returns the stored integer value as a string
    public String toString()
    {
        return value + "";
    }
}
