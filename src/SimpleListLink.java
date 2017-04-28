/**
 * List link accepting Object for Lab07
 * @author Derin Erkan
 * @version 2017-04-28
 */
public class SimpleListLink
{
    Object toStore;
    SimpleListLink prev; //previous object
    SimpleListLink next;

    /**
     * Constructs a SimpleListLink with no other linked elements
     * @param x the Object to store
     */
    public SimpleListLink(Object x)
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
    public SimpleListLink(SimpleListLink prev, Object x)
    {
        this(x);
        this.prev = prev;
    }

    public SimpleListLink(SimpleListLink prev, Object x, SimpleListLink next)
}
