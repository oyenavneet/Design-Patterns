package com.oyenavneet.designpatterns.prototypepattern.registry;

import com.oyenavneet.designpatterns.prototypepattern.model.Document;

import java.util.HashMap;
import java.util.Map;

public class DocumentRegistry {

    private static Map<String, Document> templates = new HashMap<>();

    static {
        templates.put("resume",
                new Document("Resume Template",
                        "Name | Skills | Experience"));

        templates.put("invoice",
                new Document("Invoice Template",
                        "Product | Price | Quantity"));
    }

    public static Document getTemplate(String templateName) {
        Document prototype = templates.get(templateName);
        if (prototype == null) {
            throw new RuntimeException("template not found");
        }
        return prototype.clone();
    }
}
