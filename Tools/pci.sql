USE [master]
GO

if exists (select * from sys.databases where name='pcidb')
	alter database pcidb set offline with rollback immediate
GO

if exists (select * from sys.databases where name='pcidb')
begin
	drop database pcidb
end

GO
--exec xp_cmdshell 'del /f /q C:\dir *.*'
exec xp_cmdshell 'del /f /q C:\Users\Rameshbabu-P\Documents\GitHub\bin\database\hisdb.mdf'
exec xp_cmdshell 'del /f /q C:\Users\Rameshbabu-P\Documents\GitHub\bin\database\hisdb_log.ldf'

GO

CREATE DATABASE [pcidb]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'hisdb', FILENAME = N'C:\Users\Rameshbabu-P\Documents\GitHub\bin\database\hisdb.mdf')
 LOG ON 
( NAME = N'hisdb_log', FILENAME = N'C:\Users\Rameshbabu-P\Documents\GitHub\bin\database\hisdb_log.ldf')
GO

use [pcidb]
GO

Create table patient(UUID nvarchar(50) PRIMARY KEY, Name nvarchar(50), Age int , Sex nvarchar(50),  DOB datetime, Height nvarchar(50) , Wheight nvarchar(50) , BirthDay nvarchar(50), Addres nvarchar(200), AadhaarNo nvarchar(50)) ;
GO


--insert into patient(UUID, Name, DOB, Age, Sex, Height, Wheight, BirthDay, Addres, AadhaarNo) values('1','fsdfs','1/1/1981 12:00:00 AM',12,'Male','5''5"','34','Thursday',',dmfsksf','2323');
--delete from patient

select * from patient;
select name from patient where UUID=1;
select wheight from patient where UUID=1;