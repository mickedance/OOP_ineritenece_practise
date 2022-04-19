package org.example.additionalFeaturesOfInheritance;

public class ChildBook extends Book implements Loanable {

    public ChildBook() {
        super.setCategory(Category.CHILD);
    }

    @Override
    public void loan() {
        System.out.println("This childbook is loanable");
    }
}
