# Etec.Pw2.Biblioteca

## Requirements

- Microsoft SQL Server
- Oracle JDK 17
- Maven

## Development use

- Clone this repo
- Install maven dependencies
- Initialize SQL Server (docker) with 
```bash
docker pull mcr.microsoft.com/mssql/server:2017-latest &&
docker run -e "ACCEPT_EULA=Y" -e "MSSQL_SA_PASSWORD=*123456HAS*" -p 1433:1433 --name sqlhas --hostname sqlhas -d mcr.microsoft.com/mssql/server:2017-latest
```
- Run the query `CREATE DATABASE biblioteca_db;`
- Initialize SpringBoot application

## Routes

- [POST] - /api/livro/
- [GET] - /api/emprestimo/{nome}
- [POST] - /api/emprestimo