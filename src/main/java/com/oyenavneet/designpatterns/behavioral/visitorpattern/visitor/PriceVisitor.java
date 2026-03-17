package com.oyenavneet.designpatterns.visitorpattern.visitor;

import com.oyenavneet.designpatterns.visitorpattern.element.Book;
import com.oyenavneet.designpatterns.visitorpattern.element.Electronics;

public class PriceVisitor implements ShoppingCartVisitor {


    @Override
    public int visit(Book book) {
        int cost = book.getPrice();

        System.out.println("Book: " + book.getName() + " Price: " + cost);

        return cost;
    }

    @Override
    public int visit(Electronics electronics) {
        int cost = electronics.getPrice();

        System.out.println("Electronics: " + electronics.getName() + " Price: " + cost);

        return cost;
    }
}
