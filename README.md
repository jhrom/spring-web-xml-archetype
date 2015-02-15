Spring MVC 4 Quickstart Maven Archetype
=========================================

If this project saved your time, then you can buy me a beer:

<a href="https://www.paypal.com/cgi-bin/webscr?cmd=_s-xclick&hosted_button_id=AV869YQQSBF5S"><img src="https://www.paypalobjects.com/en_US/i/btn/btn_donate_LG.gif" alt="[paypal]" /></a>

Summary
-------
The project is a Maven archetype for Spring MVC 4 web application. This archetype doesn't have any js and css (only configuration
for thymeleaf). If you need full blown spring mvc archetype based on Spring JavaConfig, then I strongly encourage you to visit https://github.com/kolorobot/spring-mvc-quickstart-archetype

Main goal
-------
Main goal for me was to create full working server side archetype based on spring, hibernate and thymeleaf. Whole spring configuration is
defined in xml files.

To do
-------
* In next iteration I will add some tests.
* Improve documentation
* maybe version for jetty?

What is inside?
-------------------------
* Spring platform (ioc, web, test, orm, data jpa)
* javax.servlet-api (3.0)
* logback-classic
* junit (4.12)
* mockito-all (1.10.19)
* hikori (2.3.2)
* thymeleaf (2.1.4)
* hibernate-entitymanager (4.3.8.Final)
* hibernate-jpa-2.1-api
* h2 (1.4.185)


Installation
------------

To install the archetype in your local repository execute following commands:

```bash
    git clone https://github.com/jhrom/spring-web-xml-archetype.git
    cd spring-web-xml-archetype
    mvn clean install
```

Create a project
----------------

```bash
    mvn archetype:generate \
        -DarchetypeGroupId=com.github.jhrom.archetypes \
        -DarchetypeArtifactId=spring-web-xml-archetype \
        -DarchetypeVersion=1.0.0 \
        -DgroupId=my.groupid \
        -DartifactId=artifactId \
        -Dversion=version
```

Run the project
----------------

```bash
	mvn tomcat7:run
```

Check in your browser
-------------------

	http://localhost:8080/

(currently ony index page is available)