/**
 * List link accepting Object for Lab07
 * @author Derin Erkan
 * @version 2017-04-28
 */
public class SimpleListLink
{
    private String toStore;
    private SimpleListLink prev; //previous object
    private SimpleListLink next;

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

    public SimpleListLink(SimpleListLink prev, String x, SimpleListLink next)
    {
        this(prev, x);
        this.next = next;
    }

    /**
     * Sets the next element of a SimpleLinkedList
     * @param next the element to set
     */
    public void setNext(SimpleListLink next)
    {
        this.next = next;
    }

    /**
     * Gets the next SimpleListLink in line
     * @return the next SimpleListLink
     */
    public SimpleListLink getNext()
    {
        return next;
    }

    /**
     * Sets the previous SimpleListLink
     * @param prev the new link to set
     */
    public void setPrev(SimpleListLink prev)
    {
        this.prev = prev;
    }

    /**
     * Gets the previous link in order
     * @return the link
     */
    public SimpleListLink getPrev()
    {
        return prev;
    }

    /**
     * Sets the data to be stored
     * @param s a string that this link will contain
     */
    public void storeData(String s)
    {
        this.toStore = s;
    }

    /**
     * Returns the stored String
     * @return the String in storage
     */
    public String getData()
    {
        return toStore;
    }

}
