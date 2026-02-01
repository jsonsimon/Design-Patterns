public class Main {
    public static void main(String[] args) {

        Singleton s1 = Singleton.getInstance();
        s1.setAppName("MyApp");
        s1.setDatabaseConnection("jdbc:mysql://localhost");
        s1.setVersion("2.0.1");
        s1.setMaxConcurrentUsers(5);

        Singleton s2 = Singleton.getInstance();
        s2.setDebugModeEnabled(false);

        System.out.println(s1 == s2);

        System.out.println(s2.getAppName());
        System.out.println(s2.getDatabaseConnection());
        Client client = new Client();
        client.soutThings();
        System.out.println(s1.getMaxConcurrentUsers());
        System.out.println(s1.isDebugModeEnabled());
    }
}

