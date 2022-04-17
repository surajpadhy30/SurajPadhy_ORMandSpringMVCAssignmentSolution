# SurajPadhy_ORMandSpringMVCAssignmentSolution

Make sure following things are set before running project

Java compiler version is JavaSE-1.7 or 1.8(properties-> Java Compiler-> Select 1.7 or 1.8) JRE System library is JavaSE 1.7 or 1.8(Properties-> Java build path-> double click JRE system library and select right version) Project facet java version is 1.7 or 1.8, Dynamic web module is 3.1 Web Deployment Assembly contains Maven dependencies in source column if not add the dependencies.(Properties-> Deployment assembly-> Add-> Java build path entries-> Maven Dependencies)

Create following schema and add some pre existing data in database using below commands in MYsql database

Create schema-

create schema crm;

Create Table-

create table customer( ID int NOT NULL auto_increment, fname varchar(50) , lname varchar(50), email varchar(50), PRIMARY KEY (ID) );

Add some data into table-

insert into customer(id,fname,lname,email) values(1,"Neha",'Dupia','neha.Dupia12@gcustomermail.com');

insert into customer(id,fname,lname,email) values(2,"Rahul",'Dravid','Rahul.Dravid@yahoom.com');

insert into customer(id,fname,lname,email) values(3,"Neena",'Mehta','neena.mehta@rediff.com');
