USE [master]
GO

alter database pcidb set offline with rollback immediate
GO

drop database pcidb
GO

CREATE DATABASE [pcidb]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'hisdb', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL13.MSSQLSERVER\MSSQL\DATA\hisdb.mdf')
 LOG ON 
( NAME = N'hisdb_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL13.MSSQLSERVER\MSSQL\DATA\hisdb_log.ldf')
GO

Create table patient(UUID nvarchar(50), Name nvarchar(50), DOB datetime, Age , Sex, Height, Weight, BirthDay, Address, AadhaarNo)