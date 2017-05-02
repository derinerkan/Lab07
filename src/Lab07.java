/**
 * Lab07 main class
 * @author Derin Erkan
 * @version 2017-05-02
 */
public class Lab07
{
    public static void main(String[] args)
    {
        //Testing SimpleLinkedList
        SimpleLinkedList list = new SimpleLinkedList();
        for(int i=0; i<255; i++)
        {
            list.addToHead(Integer.toHexString(i));
        }
        System.out.println(list);

        for(int i=0; i<255; i++) System.out.println(list.get(i));

        while(!list.isEmpty()) System.out.println(list.removeFromHead());
    }
}
