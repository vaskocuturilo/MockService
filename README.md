## Test scenario:
- 
- 
-  
    
## Requirements:
- Use any *object-oriented language* (Java or Kotlin).
- Use any Http client for API requests.
- Use automation patterns like *PageObject*, *data-driven* tests, etc.
- Use any testing frameworks (JUnit or TestNG). 
- Use mock frameworks (Jetty, WireMock, H2). 
- provide code and clear instructions how to run it.

**Note**: please put your code in public repository.

**Note**: Please send link to this repo when you are done.

### Ho w to run

```mvn clean test```

- [x] ability to run tests for different browsers/os by configuring;
- [x] ability to run tests for different environments(urls) by configuring/by command-line.

```mvn clean test -Denv=prod -Dbrowser=firefox``` 

### Generate Allure report 

```mvn allure:report```

### Open Allure report in browser

```mvn allure:serve```

**List of technologies**: Java 8, Gradle, Selenide, Junit, Rest-assured, Jetty, WireMock, H2, PageObject.
**Note**: You should have installed Chrome browser, Gradle.

![]()

![]()

![]()
