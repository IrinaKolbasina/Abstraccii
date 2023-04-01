public class Main {
    public static void main(String[] args) {
        args: {}
        Post post = new Post();
        post.name = "Иван";
        post.patronymic = "Иванович";
        post.surname = "Иванов";
        post.passport = "4444 № 44444444";
        post.phone = "+7 (999)-999-99-99";
        post.birthday = new Date();
        post.birthday.day = 13;
        post.birthday.month = 2;
        post.birthday.year = 1999;
        post.subscription = true;

    }
}