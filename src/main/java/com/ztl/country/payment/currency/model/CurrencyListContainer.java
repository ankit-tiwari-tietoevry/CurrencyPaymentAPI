package com.ztl.country.payment.currency.model;

import java.util.ArrayList;

public class CurrencyListContainer {

    public String name;
    public String defaultCurrency;
    public ArrayList<Document> documents;
    public OptionsMaxWithdrawl options;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDefaultCurrency() {
        return defaultCurrency;
    }

    public void setDefaultCurrency(String defaultCurrency) {
        this.defaultCurrency = defaultCurrency;
    }

    public ArrayList<Document> getDocuments() {
        return documents;
    }

    public void setDocuments(ArrayList<Document> documents) {
        this.documents = documents;
    }

    public OptionsMaxWithdrawl getOptions() {
        return options;
    }

    public void setOptions(OptionsMaxWithdrawl options) {
        this.options = options;
    }

}
