package org.example.additionalFeaturesOfInheritance;

import java.net.InterfaceAddress;

public class Test {
    private static Book[] books;

    public static void main(String[] args) {
        ChildBook childBook = new ChildBook();
        YoungAudultBook youngAudultBook = new YoungAudultBook();
        ReferenceBook referenceBook = new ReferenceBook();

        books = new Book[3];
        books[0] = childBook;
        books[1] = youngAudultBook;
        books[2] = referenceBook;

        for (Book b : books) {
            if (Loanable.class.isAssignableFrom(b.getClass()))
                System.out.println(b.getCategory() + " is loanable");
            else
                System.out.println(b.getCategory() + " is not loanable");
            if (b.getClass().isAssignableFrom(ChildBook.class))
                System.out.println(b.getCategory() + " is a childsbook");
            else if (b.getClass().isAssignableFrom(YoungAudultBook.class)) {
                System.out.println(b.getCategory() + " is as young adults books");

            }
            System.out.println("---####---");

        }
    }
}
