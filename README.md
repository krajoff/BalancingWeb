## One way to create a web application.

##### Go to start.spring.io and generate a project with dependencies ([link to project](https://start.spring.io/#!type=maven-project&language=java&platformVersion=3.1.1&packaging=jar&jvmVersion=17&groupId=com.example&artifactId=demo&name=demo&description=Demo%20project%20for%20Spring%20Boot&packageName=com.example.demo&dependencies=mysql,web,freemarker,security))
- Spring Web;
- Spring Data JPA;
- Apache Framemarket;
- MySQL Driver
- Spring Security
- Java Mail Sender.

##### Create database records via shell

```sh
DROP DATABASE IF EXISTS balancing;
CREATE DATABASE balancing;
USE balancing;

DROP TABLE IF EXISTS records;
CREATE TABLE records (
	id BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    mode VARCHAR(50),
    mvibration DOUBLE,
    pvibration DOUBLE,
	mweight DOUBLE,
    pweight DOUBLE, 
	reference BIGINT,
	stage BOOLEAN) COMMENT 'Вибрационное состояние';

```