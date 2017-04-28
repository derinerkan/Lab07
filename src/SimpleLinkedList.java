/**
 * SimpleLinkedList for Lab07
 * @author Derin Erkan
 * @version 2017-04-28
 */
public class SimpleLinkedList
{
    private SimpleLinkedList next;
    private SimpleLinkedList prev;
    private String toStore;
    /**
     * Constructs a new SimpleLinkedList
     */
    public SimpleLinkedList();

    public void addToHead( String item);

    public String removeFromHead();

    public boolean isEmpty();

    public String get( int index);

    public String toString();
}
