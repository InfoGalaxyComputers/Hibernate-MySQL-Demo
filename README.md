# Welcome to Hibernate and MySQL Demo developed by InfoGalaxy Computers, Shahada

Steps to Develope Hibernate App-
1. Create Database and Tables (Relation) in MySQL with proper naming convensions.
2. Create Maven Project in Eclipse (with Java EE Support)
3. Add Dependencies for MySQL-Connector-Java and Hibernate-Core-Relation in pom.xml of Project.
4. Create Entity Class (with Same Name and Datatype as per the Table) having Setter/Getter and toString() method implemented and use @Entity and @Id Annotations to define it as Entity Class.
5. Create Source Folder (src/main/resources) for containgin and defining Hibernate Configuration File (hibernate.cfg.xml)
  To create Hibernate Config file, first install Hibernate Plugin from Eclipse MarketPlace.
6. Define All MYSQL Database related config information like Driver Class Name, URL, Username and Password.
7. Create Bussiness Login for Hibernate Code -
  A) Define Configuration Class and call configure() along with Hibernate Config Filename.
  B) Build SessionFactory Objewct using configuration object.
  C) Open Session using openSession() from SessionFactory object.
  D) Perform Transaction using Session Object.
8. Run Code.
