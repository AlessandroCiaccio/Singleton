public class Main {
    private static User user;

    public static User getUser() {
        if (user == null) {
            user = new User();
        }
        return user;
    }

    public static void main(String[] args) {
        User user1 = getUser();
        User user2 = getUser();
//        user1.setName("Luca");
//        user1.setAge(51);
        user1.printInfo(user1.getName(), user1.getAge());

        user2.setName("Paolo");
        user2.setAge(49);
        user2.printInfo(user2.getName(), user2.getAge());
    }
}
