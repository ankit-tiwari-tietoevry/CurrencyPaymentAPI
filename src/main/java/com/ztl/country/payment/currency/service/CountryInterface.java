package com.ztl.country.payment.currency.service;

import com.ztl.country.payment.currency.model.CountriesLists;
import com.ztl.country.payment.currency.model.CountryListCurrencyContainer;
import com.ztl.country.payment.currency.model.CurrencyListContainer;

import java.util.ArrayList;
import java.util.List;

public interface CountryInterface {
    ArrayList<CountriesLists> getCountries();

    List<CurrencyListContainer> getCountriesSpecificInformation();

    List<CountryListCurrencyContainer> getCountriesBasedOnCurrencyDetails();
}
