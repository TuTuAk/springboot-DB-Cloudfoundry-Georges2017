Spring Music
============

This is a simple application for demonstrating database services on [Cloud Foundry](http://cloudfoundry.org) with the [Spring Framework](http://spring.io) and [Spring Boot](http://projects.spring.io/spring-boot/).


technologies used are :

Springboot, Gradle, Json, J.Script, Angular, Cloudfoundry.
The Json data (see resources/albums.json) are converted using Jackson to read JSON into objects in order to persist it in Mysql cloud.
For details see the package nl.cloudfoundry.musicdb.georges2017.repositories/AlbumRepositoryPopulator.java 
This app will is ready for using different databse approaches such as Mongo, Mysql, Postgress and rediscloud.
In this case I have configured it to use Mysql (see package nl.cloudfoundry.musicdb.georges2017.config/SpringApplicationContextInitializer.java).
The manifest.yml is used cloudFoundry to locate the jar file located /spring-music-master/build/libs. 


You can test the app by following the following cloudfoundry hyperlink: https://spring-music-georges2017-undeprecative-secretariat.cfapps.io/

Georges A. 
http://achillevanhoutte.blogspot.nl/

<p align="center">
  <img src="Koala.png"/>
 
</p>
