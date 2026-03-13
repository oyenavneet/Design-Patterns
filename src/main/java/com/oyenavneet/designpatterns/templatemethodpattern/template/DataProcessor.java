package com.oyenavneet.designpatterns.templatemethodpattern.template;

public abstract class DataProcessor {

    //Template Method
    public final void processDate() {
        loadData();
        process();
        saveData();
    }

    protected abstract void loadData();

    protected abstract void process();

    protected abstract void saveData();
}
