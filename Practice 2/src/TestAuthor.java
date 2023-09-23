import java.sql.SQLOutput;

public class TestAuthor {
    byte numberTest;

    public TestAuthor(byte numberTest) {
        this.numberTest = numberTest;
    }

    public void toTest(Author author) {
        String name = author.getName();
        String email = author.getEmail();
        System.out.println("Author's name: " + name);
        System.out.println("Author's email: " + email);
        String poem = "";
        for (int i = 0; i < numberTest; i++) {
            poem += author.toString();
        }
        System.out.println(poem);
    }
}
