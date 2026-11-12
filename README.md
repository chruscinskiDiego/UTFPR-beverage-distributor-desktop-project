# Beverage distributor — desktop application

Academic UTFPR project that simulates beverage distributor operations through a Java Swing interface.

## Features

- Customer, supplier and product interfaces.
- Screens and entities related to purchases and sales.
- List models for displaying records.
- DAO layer for PostgreSQL access.

## Technologies

Java, Swing/JFrame, JDBC and PostgreSQL.

## Prepare the environment

1. Import the source into a Java IDE, preserving the DAO, entidades, model and view packages.
2. Add the PostgreSQL JDBC driver to the classpath.
3. Review DAO/ConexaoDao.java and provide a database with the tables expected by the DAOs.
4. Check image resources used by the forms and the entry point in view/MenuPrincipal.java.

## Structure

- `DAO/`: connection and persistence.
- `entidades/`: domain models.
- `model/`: presentation list models.
- `view/`: forms, screens and images.

## Limitations

The repository does not provide a Maven/Gradle project or a complete database creation guide. Dependencies and schema need manual configuration. This is an academic record of desktop development and the DAO pattern.
