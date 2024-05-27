class Book {
    // Instance variables to store name and cost of the book
    private String name;
    private double cost;

    // Static variables to keep track of the number of books sold and total amount
    private static int count = 0;
    private static double totalAmount = 0;

    // Constructor to initialize the book name and cost
    Book(String name, double cost) {
        this.name = name;
        this.cost = cost;
        count++;
        totalAmount += cost;
    }

    // Static method to get the count of books sold
    public static int getCount() {
        return count;
    }

    // Static method to get the total amount of books sold
    public static double getTotalAmount() {
        return totalAmount;
    }

    // Instance method to display book details
    public void displayBookDetails() {
        System.out.println("Book Name: " + name);
        System.out.println("Book Cost: " + cost);
        System.out.println(count);
    }

    public static void main(String[] args) {
        // Creating instances of the Book class
        Book book1 = new Book("Java Programming", 30.50);
        Book book2 = new Book("Data Structures", 25.75);
        Book book3 = new Book("Algorithms", 40.00);

        // Displaying details of each book
        book1.displayBookDetails();
        book2.displayBookDetails();
        book3.displayBookDetails();

        // Displaying the total number of books sold and total amount
        System.out.println("Total Books Sold: " + Book.getCount());
        System.out.println("Total Amount: " + Book.getTotalAmount());
    }
}

// static int i = 1;
// i = i + 1; i = 2;
// int i;
// i = 2; i = i+1;
// int i;
// i = 3;