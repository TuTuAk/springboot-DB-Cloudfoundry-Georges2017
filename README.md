Spring Music
============

This is a simple application for demonstrating database services on [Cloud Foundry](http://cloudfoundry.org) with the [Spring Framework](http://spring.io) and [Spring Boot](http://projects.spring.io/spring-boot/).


The application use Spring Java configuration and bean profiles to configure the application and the connection objects needed to use the persistence . It also uses the Spring Cloud Connectors library to inspect the environment when running on Cloud Foundry. See the Cloud Foundry documentation for details on configuring a Spring application for Cloud Foundry


For this app, I used Springboot, Gradle, Json, J.Script, Angular, Bootstrap, Cloudfoundry.
Here is how the app is implemented:

On startup, Spring Boot's ApplicationContextInitializer will automatically add static web resources located within <b>resources/albums.json</b>. 
The java class <b>AlbumRepositoryPopulator.java</b> (package nl.cloudfoundry.musicdb.georges2017.repositories;)
will make sure that Json is read into Object thanks to <b>Jackson2ResourceReader</b> in order to persist it in a database.

Talking about persistence, nowadays many different varieties of peristence technologies are being used to store data. 
By default, this SpringBoot app is implemented to persist data in-memory with the H2 DB but is also works with with mysql, postgres, mongodb, redis... . In my case I have overriden the default H2 DB by explicitly configuring MySQL db. The implementation can be seen here : package nl.cloudfoundry.musicdb.georges2017.config.<b>SpringApplicationContextInitializer.java</b> 
As you can see it: This app  is ready for using different databse approaches such as Mongo, Mysql, Postgress and rediscloud.

The CRUD operations are done thanks to package <b>org.springframework.data.repository.CrudRepository;</b> so no need for boilerplate codes here.  

Running the application on Cloud Foundry.
This app can be run localy but I opted to deploy it on the cloud(foundry). First i had to prepare it to do so. 
The first thing to do is to run the gradle command <b>$./gradlew assemble</b> in order to generate the <b> .jar or war</b> file that will be read by the Cloud Foundry engine. After installing the 'cf' command-line interface for Cloud Foundry, I ran the <b>cf push</b> command. The application will be pushed using settings in the provided <b>manifest.yml</b>. 
The manifest.yml is used cloudFoundry to locate the jar file located /spring-music-master/build/libs. 




You can test the app by following the following cloudfoundry hyperlink: https://spring-music-georges2017-undeprecative-secretariat.cfapps.io/

Georges A. 
http://achillevanhoutte.blogspot.nl/

<p align="center">
  <img src="Koala.png"/>
 
</p>
