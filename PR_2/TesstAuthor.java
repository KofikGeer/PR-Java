public class TestAuthor{
    public static void main(String[] args) {
        Author a_1 = new Author("Ivan Popov", "ivPopov@somewhere.com", 'M');
        Author a_2 = new Author("Tatyana Kryachek", "Tatyanakrya@ya.ru", 'F');
        a_2.setEmail("anIvanova@somewhere.com");
        System.out.println(a_1);
        System.out.println(a_2);
    }
}
