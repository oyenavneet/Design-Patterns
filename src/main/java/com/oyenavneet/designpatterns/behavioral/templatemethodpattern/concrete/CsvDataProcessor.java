package com.oyenavneet.designpatterns.templatemethodpattern.concrete;

import com.oyenavneet.designpatterns.templatemethodpattern.template.DataProcessor;

public class CsvDataProcessor extends DataProcessor {


    @Override
    protected void loadData() {
        System.out.println("Loading CSV data...");
    }

    @Override
    protected void process() {
        System.out.println("Processing CSV data...");
    }

    @Override
    protected void saveData() {
        System.out.println("Saving CSV data...");
    }
}
