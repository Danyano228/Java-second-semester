public class Main {
    public static void main(String[] args) {
        Author author = new Author("Pushkin", "Pushkin@gmail.com", 'm');
        int quantityTest = 10;
        TestAuthor test = new TestAuthor((byte) quantityTest);
        test.toTest(author);
    }
}