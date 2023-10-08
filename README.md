
[![CI/CD Pipeline](https://github.com/JairLeal157/countries/actions/workflows/build.yml/badge.svg?branch=main)](https://github.com/JairLeal157/countries/actions/workflows/build.yml)
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=JairLeal157_countries&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=JairLeal157_countries)
[![Lines of Code](https://sonarcloud.io/api/project_badges/measure?project=JairLeal157_countries&metric=ncloc)](https://sonarcloud.io/summary/new_code?id=JairLeal157_countries)
[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=JairLeal157_countries&metric=coverage)](https://sonarcloud.io/summary/new_code?id=JairLeal157_countries)
[![Technical Debt](https://sonarcloud.io/api/project_badges/measure?project=JairLeal157_countries&metric=sqale_index)](https://sonarcloud.io/summary/new_code?id=JairLeal157_countries)
[![Duplicated Lines (%)](https://sonarcloud.io/api/project_badges/measure?project=JairLeal157_countries&metric=duplicated_lines_density)](https://sonarcloud.io/summary/new_code?id=JairLeal157_countries)
# countries

"Aplicación desarrollada en Spring Boot enfocada en monedas de países, con un proceso de integración y entrega continua (CI/CD) gestionado mediante GitHub Actions. Incluye análisis estático de código a través de SonarCloud y Jacoco, y se despliega en Amazon Web Services (AWS)."

Implementation of a Simple App with the next operations:

 

* Get random nations

* Get random currencies

* Get application version

* health check

 

Including integration with GitHub Actions, Sonarqube (SonarCloud), Coveralls and Snyk

 

### Folders Structure

 

In the folder `src` is located the main code of the app

 

In the folder `test` is located the unit tests

 

### How to install it

 

Execute:

 

```shell

$ mvnw spring-boot:run

```

to download the node dependencies

 

### How to test it

 

Execute:

 

```shell

$ mvnw clean install

```

 

### How to get coverage test

 

Execute:

 

```shell

$ mvwn -B package -DskipTests --file pom.xml

```
