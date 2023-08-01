public class Reader {
    String fullName;
    int libraryCardNumber;
    String faculty;
    int dateOfBirth;
    int  number;

    public Reader(String fullName, int libraryCardNumber, String faculty, int dateOfBirth, int number) {
        this.fullName = fullName;
        this.libraryCardNumber = libraryCardNumber;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.number = number;
    }

    public void takeBook(int numberOfBooks){
        System.out.println(fullName + " взял " + numberOfBooks + " книги.");

    }
    public void returnBook(int numberOfBooks){
        System.out.println(fullName + " вернул " + numberOfBooks + " книги.");


    }
}
