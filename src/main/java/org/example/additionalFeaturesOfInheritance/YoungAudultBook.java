package org.example.additionalFeaturesOfInheritance;

public class YoungAudultBook extends Book implements Loanable {
    public YoungAudultBook() {
        super.setCategory(Category.ADULT);
    }

    @Override
    public void loan() {
        System.out.println("this young-adult book is loanable");
    }
}
