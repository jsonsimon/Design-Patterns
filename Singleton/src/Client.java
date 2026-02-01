public class Client {
    Singleton s3 = Singleton.getInstance();

    public void soutThings(){
        System.out.println(s3.getVersion());
        System.out.println(s3.getMaxConcurrentUsers());
        s3.setMaxConcurrentUsers(10);
    }
}
