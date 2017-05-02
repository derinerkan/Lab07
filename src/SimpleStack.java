/**
 * Simple Stack for Lab07
 * @author Derin Erkan
 * @version 2017-05-02
 */
public class SimpleStack
{
    SimpleLinkedList stack;

    /**
     * Create an empty stack
     */
    public SimpleStack()
    {
        stack = new SimpleLinkedList();
    }

    /**
     * Push an item on the stack
     * @param item the item to be added
     */
    public void push(String item)
    {
        stack.addToHead(item);
    }

    /**
     * Remove an item from the top of the stack, returning it to the user.
     * @return the item that is popped
     */
    public String pop()
    {
        return stack.removeFromHead();
    }

    /**
     * Check if the stack is empty
     * @return true if it is empty
     */
    public boolean isEmpty()
    {
        return stack.isEmpty();
    }
}
