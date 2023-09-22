package javaapplication3;

abstract class Book {
    protected String title;
    protected String author;
    protected double price;
    public abstract void setDetails(String title, String author, double price);
    public String getTitle() {
        return title;
    }
}
class MyBook extends Book {
    @Override
    public void setDetails(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
}
class main {
    public static void main(String[] args) {
        MyBook book1 = new MyBook();
        MyBook book2 = new MyBook();
        MyBook book3 = new MyBook();
        book1.setDetails("You can", "George Matthew Adams", 19.34);
        book2.setDetails("Do It Today", "Darius Foroux", 29.44);
        book3.setDetails("From Blood And Ash", "Jennifer", 39.69);
        double totalPrice = book1.price + book2.price + book3.price;
        System.out.println("Book 1 Title: " + book1.getTitle());
        System.out.println("Book 1 Author: " + book1.author);
        System.out.println("Book 1 Price: " + book1.price);
        System.out.println("Book 2 Title: " + book2.getTitle());
        System.out.println("Book 2 Author: " + book2.author);
        System.out.println("Book 2 Price: " + book2.price);
        System.out.println("Book 3 Title: " + book3.getTitle());
        System.out.println("Book 3 Author: " + book3.author);
        System.out.println("Book 3 Price: " + book3.price);
        System.out.println("Total Price of the Three Books: " + totalPrice);
    }
}

