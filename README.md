# CurrencyPaymentAPI
List of countries with currency information

We are using REST COUNTRIES Api to get information about countries via a RESTful API. We only interested in the country those are enabled or diabled and the list countries name and currency in sorting order. The list of countries is then used as a filter to get list of countries using different currency.

Building and Running local environment

The task completed using Java with Spring Boot. The IDE used for the task is intellij, and it is maven build. Below are steps to be taken in order to deploy in the local environment.

Unzip the file and please the folder in the build directory.

If using intellij, please do file -> open -> project from build directory. This allows to open the project in the intellij.

Select the maven task in the right hand side of the project.

Click on clean and thereafter click on compile.

At the top bar click on Edit Configuration and select CurrencyPaymentApplication.

Click on the green arrow button to run the CurrencyPaymentApplication.

After running, project will be deployed inside tomcat localhost on default port 8080.

Open postman or local web browser and input uri http://localhost:8080/countries selecting GET request.

REST API URI's
http://localhost:8080/countries
http://localhost:8080/countries/details
http://localhost:8080/countries/countriesBasedOnCurrency

In order to run Junit tests, click on test package in project explorer and run 'Run tests'
