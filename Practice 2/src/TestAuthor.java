import java.sql.SQLOutput;

public class TestAuthor {
    byte numberTest;

    public TestAuthor(byte numberTest) {
        this.numberTest = numberTest;
    }

    public void toTest(Author author) {
        String poem = "";
        for (int i = 0; i < numberTest; i++) {
            poem += author.toString();
        }
        System.out.println(poem);
    }
}
