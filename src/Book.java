    public class Book {

        String title;
        boolean borrowed;


        public Book(String bookTitle) {
            this.title = bookTitle;
            this.borrowed = false;
        }
        public void borrowed () { //determining whether or no the book has been borrowed
            this.borrowed = true;
        }
        public void returned() { 
            this.borrowed = false;
        }
        // Implement this method
        // Returns true if the book is rented, false otherwise
        public boolean isBorrowed() {
// Implement this method
            return this.borrowed;
        }
        // Returns the title of the book
        public String getTitle() {
// Implement this method
            return this.title;
        }
    }

