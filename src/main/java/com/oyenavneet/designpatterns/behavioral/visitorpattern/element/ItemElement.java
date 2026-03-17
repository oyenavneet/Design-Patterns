package com.oyenavneet.designpatterns.visitorpattern.element;

import com.oyenavneet.designpatterns.iteratorpattern.model.Song;
import com.oyenavneet.designpatterns.visitorpattern.visitor.ShoppingCartVisitor;

public interface ItemElement {
    int accept(ShoppingCartVisitor visitor);
}
