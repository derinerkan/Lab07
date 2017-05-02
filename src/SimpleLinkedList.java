/**
 * SimpleLinkedList for Lab07
 * @author Derin Erkan
 */
public class SimpleLinkedList
{
    private SimpleLinkedList prev;
    private SimpleLinkedList next;
    private String toStore;
    private int index;

    /**
     * Constructs a SimpleLinkedList with no other links
     * @param x the string to be stored in this link
     */
    public SimpleLinkedList(String x)
    {
        prev = null;
        next = null;
        toStore = x;
        index = 0;
    }

    /**
     * Constructs a SimpleLinkedList with a previous element
     * @param prev the previous element to link to
     * @param x the string to store
     */
    public SimpleLinkedList(SimpleLinkedList prev, String x)
    {
        this.prev = prev;
        next = null;
        toStore = x;
        index = 0;
    }

    /**
     * Constructs a SimpleLinkedList storing nothing
     */
    public SimpleLinkedList()
    {
        this.prev = null;
        this.next = null;
        this.toStore = null;
        index = 0;
    }

    /**
     * Sets the index of this SimpleLinkedList
     * @param i the current index
     */
    public void setIndex(int i)
    {
        this.index = i;
    }

    /**
     * Adds the item to the end of the list creating a new element
     * @param item the item to be added
     */
    public void addToHead( String item)
    {
        if(next == null)
        {
            next = new SimpleLinkedList(this, item);
            next.setIndex(index + 1);
        }
        else next.addToHead(item);
    }

    /**
     * Removes the item from the end of the list
     * @return the item at the end of the list
     */
    public String removeFromHead()
    {
        if(next.isEnd())
        {
            String output = get(index+1);
            next = null;
            return output;
        }
        else return next.removeFromHead();
    }

    /**
     * Checks whether this element is the end of the list
     * @return true if it is
     */
    public boolean isEnd()
    {
        return next == null;
    }

    /**
     * Checks if the SimpleLinkedList is empty
     * @return true if it is
     */
    public boolean isEmpty()
    {
        return toStore == null && next == null && prev == null;
    }

    /**
     * Gets the element in the specified index
     * @param index the index to get from
     * @return the gotten string
     */
    public String get( int index)
    {
        if(this.index < index ) return next.get(index);
        else if(this.index == index) return toStore;
        else if(this.index > index) return prev.get(index);
        return null; //safety
    }

    /**
     * Returns a string representation of the list recursively.
     * @return a string representation of this list
     */
    public String toString()
    {
        if(!isEnd()) next.toString();
        String output = "";

        for(int i=0; get(i) != toStore; i++)
        {
            output += get(i) + ", ";
        }
        return output;
    }
}
