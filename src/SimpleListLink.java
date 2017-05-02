/**
 * List link accepting Object for Lab07
 * @author Derin Erkan
 * @version 2017-04-28
 */
public class SimpleListLink
{
    String toStore;
    SimpleListLink prev; //previous object
    SimpleListLink next;

    /**
     * Constructs a SimpleListLink with no other linked elements
     * @param x the Object to store
     */
    public SimpleListLink(String x)
    {
        toStore = x;
        prev = null;
        next = null;
    }

    /**
     * Constructs a SimpleListLink that has a previous element linked to it
     * @param prev the link before it
     * @param x the Object to store
     */
    public SimpleListLink(SimpleListLink prev, String x)
    {
        this(x);
        this.prev = prev;
    }

    /**
     * Constructs a SimpleListLink that has both a previous linked element and a next linked element
     * @param prev
     * @param x
     * @param next
     */
    public SimpleListLink(SimpleListLink prev, String x, SimpleListLink next)
    {
        this(prev, x);
        this.next = next;
    }

    public void
}
