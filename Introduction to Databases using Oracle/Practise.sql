--exec script
--copy to C:\DevSuiteHome_1\Bin
@ '%FILENAME%'

--Create the prjpart table
CREATE TABLE prjpart ( 
ProjNo Number(1), PartNo Number(2), Qty Number(2) NOT NULL,
CONSTRAINT prjpart_pk PRIMARY KEY (ProjNo,PartNo)
);

ALTER TABLE prjpart ADD Price NUMBER(4,2);


/*
declare
   c int;
begin
   select count(*) into c from user_tables where table_name = upper('prjpart');
   if c = 1 then
      execute immediate 'drop table prjpart';
   end if;
end;
*/