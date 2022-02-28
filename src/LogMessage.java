public class LogMessage
{
    private String machineId;
    private String description;

    /** Precondition: message is a valid log message. */
    public LogMessage(String message)
    {
        machineId = message.substring(0, message.indexOf(":"));
        description = message.substring(message.indexOf(":") + 1);
    }

    /** Returns true if the description in this log message properly contains keyword;
     * false otherwise.
     */
    public boolean containsWord(String keyword)
    {
        int index = description.indexOf(keyword);
        if (description.equals(keyword))
        {
            return true;
        }
        else if (description.substring(description.length() - keyword.length()).equals(keyword))
        {
            return description.substring(description.length() - keyword.length() - 1, description.length() - keyword.length()).equals(" ");
        }
        else if (index == 0)
        {
            return description.substring(keyword.length(), keyword.length() + 1).equals(" ");
        }
        else
        {
            String d = description.substring(keyword.length(), description.length() - keyword.length());
            return d.indexOf(" " + keyword + " ") >= 0;
        }
    }

    public String getMachineId()
    { return machineId; }

    public String getDescription()
    { return description; }

    // There may be instance variables, constructors, and methods that are not shown.
}