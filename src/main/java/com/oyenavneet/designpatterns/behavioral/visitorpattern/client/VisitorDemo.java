package com.oyenavneet.designpatterns.visitorpattern.client;

import com.oyenavneet.designpatterns.visitorpattern.element.Book;
import com.oyenavneet.designpatterns.visitorpattern.element.Electronics;
import com.oyenavneet.designpatterns.visitorpattern.element.ItemElement;
import com.oyenavneet.designpatterns.visitorpattern.visitor.PriceVisitor;
import com.oyenavneet.designpatterns.visitorpattern.visitor.ShoppingCartVisitor;

public class VisitorDemo {

    public static void main(String[] args) {

        ItemElement[] items = new ItemElement[]{
                new Book(500, "Design Pattern"),
                new Electronics(20000, "Laptop")
        };

        ShoppingCartVisitor visitor = new PriceVisitor();
        int total = 0;

        for (ItemElement item : items) {
            total += item.accept(visitor);
        }

        System.out.println("Total price: " + total);
    }

}
