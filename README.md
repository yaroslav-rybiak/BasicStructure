# What was implemented:
1. Basic framework with maven, restassured, selenium, testng and allure
2. API: GET and POST requests using restassured lib
3. UI: successful and failed login attempts using Selenium Webdriver
4. HTML report using Allure

# What would you continue testing if you had more time?
1. API tests need to be parametrized, creating users with different names and jobs
2. Data providers for parameterizing tests
3. Clean up: delete test entities that were created during test run
4. We have UI and API tests, but no DB tests. If we have database, it should be also tested
5. Improved rerun for flaky tests
6. Improved parametrization: different users, different environments