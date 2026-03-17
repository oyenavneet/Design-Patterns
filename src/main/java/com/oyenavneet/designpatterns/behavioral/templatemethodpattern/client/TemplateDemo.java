package com.oyenavneet.designpatterns.templatemethodpattern.client;

import com.oyenavneet.designpatterns.templatemethodpattern.concrete.CsvDataProcessor;
import com.oyenavneet.designpatterns.templatemethodpattern.concrete.JsonDataProcessor;
import com.oyenavneet.designpatterns.templatemethodpattern.template.DataProcessor;

/*
    The algorithm structure is fixed, but subclasses customize steps.

 */

public class TemplateDemo {
    public static void main(String[] args) {


        DataProcessor csvDataProcessor = new CsvDataProcessor();
        csvDataProcessor.processDate();

        System.out.println("---------------");

        DataProcessor jsonDataProcessor = new JsonDataProcessor();


        /*
            Output
            Loading CSV data
            Processing CSV data
            Saving CSV data to database
            ----------------
            Loading JSON data
            Processing JSON data
            Saving JSON data to database

         */
    }
}
