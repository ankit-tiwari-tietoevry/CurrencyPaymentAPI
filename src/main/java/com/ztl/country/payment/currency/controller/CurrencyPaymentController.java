package com.ztl.country.payment.currency.controller;

import com.ztl.country.payment.currency.model.CountriesLists;
import com.ztl.country.payment.currency.service.CountryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CurrencyPaymentController {
	@Autowired
	private CountryInterface countryService;

	@RequestMapping("/hello")
	public String hello() {
		return "Hello World !!";
	}

	@GetMapping(value = "/countries")
	private List<CountriesLists> getCountries() {
		return countryService.getCountries();
	}
}
