## Test scenario:
- Add automation scripts ror API
- Add automation scripts for Database
- Add automation scripts for Email
- Add automation scripts for Web
    
## Requirements:
- Use any *object-oriented language* (Java or Kotlin).
- Use any Http client for API requests.
- Use automation patterns like *PageObject*, *data-driven* tests, etc.
- Use any testing frameworks (JUnit or TestNG). 
- Use mock frameworks (Jetty, WireMock, H2). 
- provide code and clear instructions how to run it.

**Note**: please put your code in public repository.

**Note**: Please send link to this repo when you are done.

### How to run

```mvn clean test -Denv=prod```


- [x] ability to run tests for different browsers/os by configuring;
- [x] ability to run tests for different environments(urls) by configuring/by command-line.

```mvn clean test -Denv=prod -Dbrowser=firefox``` 

### Generate Allure report 

```mvn allure:report```

### Open Allure report in browser

```mvn allure:serve```

**List of technologies**: Java 8, Maven, Selenide, TestNG, Rest-assured, Jetty, WireMock, H2, PageObject.
**Note**: You should have installed Chrome browser, Gradle.

![](https://d.radikal.ru/d01/1909/39/adb6d7514223.png)

![](https://a.radikal.ru/a41/1909/17/b59769e8b755.png)

![](https://a.radikal.ru/a04/1909/2c/11976e3a38b0.png)
