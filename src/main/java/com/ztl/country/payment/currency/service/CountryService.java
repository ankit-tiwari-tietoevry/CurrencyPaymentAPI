package com.ztl.country.payment.currency.service;

import com.ztl.country.payment.currency.model.CountriesLists;
import com.ztl.country.payment.currency.model.CountryListCurrencyContainer;
import com.ztl.country.payment.currency.model.CurrencyListContainer;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CountryService implements CountryInterface {

	RestTemplate restTemplate = new RestTemplate();
	String uri = "https://api.coindirect.com/api/country";
	private ArrayList<CountriesLists> countries;

	@Override
	public ArrayList<CountriesLists> getCountries() {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		headers.set("enabled", "true");
		headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<String> entity = new HttpEntity<String>(headers);

		ResponseEntity<ArrayList<CountriesLists>> response = restTemplate.exchange(uri, HttpMethod.GET, entity,
				new ParameterizedTypeReference<ArrayList<CountriesLists>>() {
				});
		countries = response.getBody();

		return countries;
	}

	@Override
	public List<CurrencyListContainer> getCountriesSpecificInformation() {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		headers.set("enabled", "true");
		headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
		headers.setContentType(MediaType.APPLICATION_JSON);

		CurrencyListContainer[] response = restTemplate.getForObject(uri, CurrencyListContainer[].class);

		List<CurrencyListContainer> currencyResults = Arrays.stream(response).collect(Collectors.toList());
		return currencyResults;

	}

	@Override
	public List<CountryListCurrencyContainer> getCountriesBasedOnCurrencyDetails() {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		headers.set("enabled", "true");
		headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
		headers.setContentType(MediaType.APPLICATION_JSON);

		CountryListCurrencyContainer[] response = restTemplate.getForObject(uri, CountryListCurrencyContainer[].class);

		List<CountryListCurrencyContainer> currencyResults = Arrays.stream(response).collect(Collectors.toList());
		return currencyResults;

	}

	public void clearObjects() {
		countries = null;
	}

}
