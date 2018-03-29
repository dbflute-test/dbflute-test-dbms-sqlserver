
# ========================================================================================
#                                                                              JDBC Driver
#                                                                              ===========
Download sqljdbc4.jar from official site,
and put it to '/lib' and 'dbflute_maihamadb/extlib'.


# ========================================================================================
#                                                                       SQLServer on MacOS
#                                                                       ==================
_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/
[official site]
https://docs.microsoft.com/ja-jp/sql/linux/quickstart-install-connect-docker

[first time]
docker pull microsoft/mssql-server-linux:2017-latest

[run]
docker run -e 'ACCEPT_EULA=Y' -e 'MSSQL_SA_PASSWORD=MSSQL@ps' \
   -p 1433:1433 --name mssqlflute \
   -d microsoft/mssql-server-linux:2017-latest

docker exec -it mssqlflute "bash"
/opt/mssql-tools/bin/sqlcmd -S localhost -U SA -P 'MSSQL@ps'
create database maihamadb
go
use maihamadb
go
exec sp_configure 'contained database authentication', 1
go
reconfigure
go
alter database maihamadb set containment = partial
go
create login maihamadb with password = 'maihamadb', check_policy = off
go
create user maihamadb for login maihamadb
go
exec sp_addrolemember 'db_ddladmin','maihamadb'
go
exec sp_addrolemember 'db_datareader','maihamadb'
go
exec sp_addrolemember 'db_datawriter','maihamadb'
go
grant execute on SCHEMA::dbo to maihamadb
go

[remove]
docker stop mssqlflute
docker rm mssqlflute
_/_/_/_/_/_/_/_/_/_/

An you can execute ReplaceSchema.


# ========================================================================================
#                                                                     SQLServer on Windows
#                                                                     ====================
[SQLServer 2005 Express]
1. Create login user as SQLServer authentication

usr = maihamadb
pwd = maihamadb


2. Create database

name = maihamadb


3. Channge user's database to maihamadb


4. Enable TCP/IP connection

status = valid
port = 1433


5. Enable SQLServer authentication

at database property


6. Re-boot


7. Execute Replace-Schema
