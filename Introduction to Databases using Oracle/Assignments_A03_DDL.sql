/*
DROP TABLE Dept CASCADE CONSTRAINTS;
DROP TABLE Employee CASCADE CONSTRAINTS;
*/

CREATE TABLE Dept  (
	DeptId NUMBER(2),
	DeptName VARCHAR2(10),
	Location VARCHAR2(10),
	EmployeeID NUMBER(3) NULL,
	CONSTRAINT pk_dept PRIMARY KEY (DeptId)
	);

CREATE TABLE Employee (
	EmployeeID NUMBER(3),
	LName VARCHAR2(10),
	FName VARCHAR2(10),
	HireDate DATE,
	Salary NUMBER(6),
	Commission NUMBER(6) NULL,
	Supervisor NUMBER(3) NULL,
	DeptId NUMBER(2),
	PositionId NUMBER(1),
	QualId NUMBER(1) NULL,
	CONSTRAINT pk_emp_id PRIMARY KEY (EmployeeID),
	CONSTRAINT fk_emp_sup FOREIGN KEY (Supervisor) REFERENCES Employee(EmployeeID), 
	CONSTRAINT fk_emp_dep FOREIGN KEY (DeptId) REFERENCES Dept(DeptId), 
	CONSTRAINT chk_emp_sal CHECK (Salary>=1 AND Salary <=500000 )
	);

--ADD CONSTRAINT for Dept TABLE
ALTER TABLE Dept ADD CONSTRAINT fk_dep_emp FOREIGN KEY (EmployeeID) REFERENCES Employee(EmployeeID);

/* test 
INSERT INTO Dept VALUES (1,'Dept-1','Location-1',NULL);
INSERT INTO Dept VALUES (2,'Dept-2','Location-2',NULL);

INSERT INTO EMPLOYEE VALUES (111,'LNAME-1','FN-1',NULL,1,1,NULL,1,0,0);
INSERT INTO EMPLOYEE VALUES (222,'LNAME-2','FN-2',NULL,1,1,111,2,0,0);
INSERT INTO EMPLOYEE VALUES (333,'LNAME-3','FN-3',NULL,1,1,111,2,0,0);

SELECT * FROM Dept;
SELECT * FROM EMPLOYEE;
*/