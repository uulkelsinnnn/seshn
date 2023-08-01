public class Main {
    public static void main(String[] args) {
        Reader reader1 = new Reader("Нурдинова Уулкелсин",12345,"FEN",12-10-23,990552118);
        Reader reader2 = new Reader("Айдай  Аскарова",123456,"FEN",12-11-23,991552121);
        reader1.takeBook(3);
        reader1.returnBook(3);
    }
}