/**
 * Linked list node for Lab07
 * @author Derin Erkan
 * @version 2017-05-02
 */
public class Node
{
    Node prev;
    Node next;
    String data;
    int index;

    /**
     * Creates a node storing a string
     * @param toStore the string to be stored
     */
    public Node(String toStore)
    {
        data = toStore;
    }

    public void updateIndex()
    {
        if(prev != null) index = prev.index + 1;
        else index = 0;
        if(next != null) next.updateIndex(); //recursively update each element in line
    }

    /**
     * Gets the int at that particular index
     * @param index the index to check
     * @return the string at that index
     */
    public String get(int index)
    {
        if(this.index == index) return data;
        else if(this.index > index && prev != null) return prev.get(index);
        else if(this.index < index && next != null) return next.get(index);
        else return null;
    }

    /**
     * Returns a string of the entire linked list from this node onwards.
     * @return a string representation of the linked list
     */
    public String toString()
    {
        if(next == null) return data;
        return data + ", " + next.toString();
    }
}
