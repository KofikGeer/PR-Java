package PR_3;

import PR_3.Author;

public class MAuthor {
    public static void main(String[] args) {
        Author a_1 = new Author("Ivan Popov", "ivPopov@somewhere.com", 'M');
        Author a_2 = new Author("Popik Pop", "PopikPOP@ya.ru", 'M');
        a_2.setEmail("anIvanova@somewhere.com");
        System.out.println(a_1);
        System.out.println(a_2);
    }
}
