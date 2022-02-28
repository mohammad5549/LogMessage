import java.util.ArrayList;

public class SystemLog
{
    /** Contains all the entries in this system log.
     * Guaranteed not to be null and to contain only non-null entries.
     */

    private static ArrayList<LogMessage> messageList;
    /** Removes from the system log all entries whose descriptions properly contain keyword,
     * and returns a list (possibly empty) containing the removed entries.
     * Postcondition:
     * - Entries in the returned list properly contain keyword and
     * are in the order in which they appeared in the system log.
     * - The remaining entries in the system log do not properly contain keyword and
     * are in their original order.
     * - The returned list is empty if no messages properly contain keyword.
     */

    public static void add(LogMessage m)
    {
        messageList.add(m);
    }

    public static ArrayList<LogMessage> getList()
    {
        return messageList;
    }

    public static ArrayList<LogMessage> removeMessages(String keyword)
    {
        ArrayList<LogMessage> contains = new ArrayList<LogMessage>();
        for (int i = 0; i < messageList.size(); i++)
        {
            if (messageList.get(i).containsWord(keyword))
            {
                contains.add(messageList.get(i));
            }
        }
        return contains;
    }
// There may be instance variables, constructors, and methods that are not shown.
}