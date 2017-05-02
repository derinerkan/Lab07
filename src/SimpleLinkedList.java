/**
 * SimpleLinkedList for Lab07
 * @author Derin Erkan
 * @version 2017-05-02
 */
public class SimpleLinkedList
{
    Node first;

    /**
     * Construct an empty SimpleLinkedList with no elements within.
     */
    public SimpleLinkedList()
    {
        first = null;
    }

    /**
     * Adds the string to the beginning of the list
     * @param item the string to be added
     */
    public void addToHead( String item)
    {
        Node temp = new Node(item);
        temp.next = first;
        first = temp;
        first.updateIndex();
    }

    /**
     * Removes the string at the beginning and returns it
     * @return the string at position zero
     */
    public String removeFromHead()
    {
        String temp = first.data;
        if(first.next != null) first = first.next;
        else first = null;
        return temp;
    }

    /**
     * Check if this list is empty.
     * @return true if it is empty
     */
    public boolean isEmpty()
    {
        return first == null;
    }

    /**
     * Gets the item at that index
     * @param index the index to check
     * @return the item there
     */
    public String get( int index)
    {
        //return first.get(index);

        Node current = first;
        for(int i=0; i<index; i++) current = current.next;
        return current.data;
    }

    /**
     * Returns a string representation of the entire list
     * @return the string
     */
    public String toString()
    {
        return first.toString();
    }
}
