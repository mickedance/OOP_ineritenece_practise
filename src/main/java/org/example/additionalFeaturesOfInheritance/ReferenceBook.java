package org.example.additionalFeaturesOfInheritance;

public class ReferenceBook extends Book {

    public ReferenceBook() {
        super.setCategory(Category.NOT_LOANABLE);
    }
}
