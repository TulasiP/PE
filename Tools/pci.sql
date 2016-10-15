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
drop table patient;
Create table patient(UUID nvarchar(50) PRIMARY KEY, Name nvarchar(50), Age int , Sex nvarchar(50),  DOB date , Height nvarchar(50) , Wheight nvarchar(50) , BirthDay nvarchar(50), Addres nvarchar(200), AadhaarNo nvarchar(50) , PhoneNo nvarchar(50) , StudyType nvarchar(50));
GO

--insert into patient(UUID, Name, DOB, Age, Sex, Height, Wheight, BirthDay, Addres, AadhaarNo) values('1','fsdfs','1/1/1981 12:00:00 AM',12,'Male','5''5"','34','Thursday',',dmfsksf','2323');
--delete from patient

select * from patient;
select name from patient where UUID=3;
select wheight from patient where UUID=1;
insert into patient(dob) values(1992-09-12);
select name,age,sex,dob,height,wheight,birthday,addres,aadhaarno from patient where UUID=1
alter table patient add PhoneNo nvarchar(20); 
alter table patient alter column PhoneNo nvarchar(20);
ALTER TABLE patient DROP COLUMN PhoneNo;
insert into patient(UUID , Name , Age , Sex ,  DOB , Height , Wheight , BirthDay , Addres  , AadhaarNo, PhoneNo) values('18','','','','1984-05-19','','','Wednesday','','','3477498797')
delete from patient where UUID=9;
insert into patient(UUID , Name , Age , Sex ,  DOB , Height , Wheight , BirthDay , Addres  , AadhaarNo, PhoneNo) values('12','','','','12-09-2011','','','Tuesday','','','1234567890');
delete from patient where name=null;
alter table patient add StudyType nvarchar(50);

select name,age,sex,dob,height,wheight,birthday,addres,aadhaarno,studytype from patient where UUID=5
