package com.ztl.country.payment.currency.CurrencyPaymentAPI;

import com.ztl.country.payment.currency.service.CountryService;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class CurrencyPaymentApiApplicationTests {

	@Autowired
	private CountryService countryService;

	@BeforeAll
	public void setUp() {
		countryService.getCountries();
	}

	@Test
	@Order(1)
	void shouldReturnNotNullCountryService() {
		Assertions.assertNotNull(countryService);
	}


	@AfterAll
	public void tearDown() {
		countryService.clearObjects();
	}
}
