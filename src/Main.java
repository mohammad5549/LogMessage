public class Main {
    public static void main(String[] args) {
        LogMessage message1 = new LogMessage("CLIENT3:security alert – repeated login failures");
        LogMessage message2 = new LogMessage("Webserver:disk offline");
        LogMessage message3 = new LogMessage("SERVER1:file not found");
        LogMessage message4 = new LogMessage("SERVER2:read error on disk DSK1");
        LogMessage message5 = new LogMessage("SERVER1:write error on disk DSK2");
        LogMessage message6 = new LogMessage("Webserver:error on /dev/disk");

        System.out.println(message1.getMachineId() + " | " + message1.getDescription());
        System.out.println(message2.getMachineId() + " | " + message2.getDescription());
        System.out.println(message3.getMachineId() + " | " + message3.getDescription());
        System.out.println(message4.getMachineId() + " | " + message4.getDescription());
        System.out.println(message5.getMachineId() + " | " + message5.getDescription());
        System.out.println(message6.getMachineId() + " | " + message6.getDescription());

        LogMessage m1 = new LogMessage("1:error on disk");
        LogMessage m2 = new LogMessage("2:error on disk3");

        System.out.println(m1.containsWord("disk"));
        System.out.println(m2.containsWord("disk"));

        SystemLog.add(message1);
        SystemLog.add(message2);
        SystemLog.add(message3);
        SystemLog.add(message4);
        SystemLog.add(message5);
        SystemLog.add(message6);
        SystemLog.add(m1);
        SystemLog.add(m2);

        System.out.println(SystemLog.removeMessages("on"));
        System.out.println(SystemLog.getList());
    }
}
