package com.oyenavneet.designpatterns.visitorpattern.visitor;


import com.oyenavneet.designpatterns.visitorpattern.element.Book;
import com.oyenavneet.designpatterns.visitorpattern.element.Electronics;

public interface ShoppingCartVisitor {

    int visit(Book book);

    int visit(Electronics electronics);
}
