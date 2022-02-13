package com.ztl.country.payment.currency.controller;

import com.ztl.country.payment.currency.model.CountriesLists;
import com.ztl.country.payment.currency.model.CountryListCurrencyContainer;
import com.ztl.country.payment.currency.model.CurrencyListContainer;
import com.ztl.country.payment.currency.service.CountryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CurrencyPaymentController {
	@Autowired
	private CountryInterface countryService;

	@GetMapping(value = "/countries")
	private List<CountriesLists> getCountries() {
		return countryService.getCountries();
	}

	@GetMapping(value = "/countries/details")
	private List<CurrencyListContainer> getCountriesSpecificDetails() {
		return countryService.getCountriesSpecificInformation();
	}

	@GetMapping(value = "/countries/countriesBasedOnCurrency")
	private List<CountryListCurrencyContainer> getCountriesBasedOnCurrency() {
		return countryService.getCountriesBasedOnCurrencyDetails();
	}
}
