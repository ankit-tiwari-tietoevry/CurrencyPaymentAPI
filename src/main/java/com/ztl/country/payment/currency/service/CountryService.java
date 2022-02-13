package com.ztl.country.payment.currency.service;

import com.ztl.country.payment.currency.model.CountriesLists;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

@Service
public class CountryService implements CountryInterface {

	private ArrayList<CountriesLists> travels;

	@Override
	public ArrayList<CountriesLists> getCountries() {
		String uri = "https://api.coindirect.com/api/country";
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		headers.set("enabled", "true");
		headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<String> entity = new HttpEntity<String>(headers);

		ResponseEntity<ArrayList<CountriesLists>> response = restTemplate.exchange(uri, HttpMethod.GET, entity,
				new ParameterizedTypeReference<ArrayList<CountriesLists>>() {
				});
		travels = response.getBody();

		return travels;
	}

	public void clearObjects() {
		travels = null;
	}

}
