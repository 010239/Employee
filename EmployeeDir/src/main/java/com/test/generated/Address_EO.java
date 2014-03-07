/*************************** DO NOT MODIFY THIS FILE **************************
 *
 * Generated by Athena Console. All Rights Reserved by Athena Source (c) 2007 - 2010.
 * www.athenaframework.org
 *
 * Generated on Nov 08, 2010 10:47:19 by Jack (Windows 7 6.1 [x86])
 * DB: MySQL 5.0[connection pool - driver class: com.mysql.jdbc.Driver, url: jdbc:mysql://localhost/employeedir?useUnicode=yes&characterEncoding=UTF-8, max active: 10, max idle: 5, max wait time: 5000, connection timeout: 300]
 *
 ******************************************************************************/

package com.test.generated;

import org.athenasource.framework.eo.core.EOObject;

import com.test.Employee;

/**
 * Generated EO class for Address
 *
 * @version 1
 */
public class Address_EO extends EOObject {

	public static final String META_XSD_VERSION = "2.0"; // META VERSION
	public static final int COLUMN_COUNT = 6; // total number of columns, i.e., attributes
	public static final int ENTITY_ID = 102; // the entity type id. 
	public static final String SYSTEM_NAME = "Address"; // the entity system name. 
	public static final String TABLE_NAME = "Address"; // the table name. 

	// Property names 
	public static final String ATTR_address_ID = "address_ID"; // Primary key
	public static final String ATTR_version = "version"; // Version
	public static final String ATTR_status = "status"; // EO status
	public static final String ATTR_ORG_ID = "ORG_ID"; // Organization
	public static final String ATTR_address = "address";
	public static final String ATTR_employee_ID = "employee_ID";

	public static final String REL_employee = "employee";

	/**
	 * Gets Address ID (Primary key).
	 * @return Address ID
	 */
	public int getAddress_ID() {
		return getObject(0) == null ?  -1 : ((Number)getObject(0)).intValue(); 
	}

	/**
	 * Sets Address ID (Primary key).
	 * @param address_ID Address ID
	 */
	public void setAddress_ID(int address_ID) {
		setObject(0, Integer.valueOf(address_ID)); 
	}

	/**
	 * Gets Version (Version).
	 * @return Version
	 */
	public int getVersion() {
		return getObject(1) == null ?  -1 : ((Number)getObject(1)).intValue(); 
	}

	/**
	 * Sets Version (Version).
	 * @param version Version
	 */
	public void setVersion(int version) {
		setObject(1, Integer.valueOf(version)); 
	}

	/**
	 * Gets Status (EO status).
	 * @return Status
	 */
	public int getStatus() {
		return getObject(2) == null ? (byte)-1 : ((Number)getObject(2)).intValue(); 
	}

	/**
	 * Sets Status (EO status).
	 * @param status Status
	 */
	public void setStatus(int status) {
		setObject(2, Integer.valueOf(status)); 
	}

	/**
	 * Gets Org ID (Organization).
	 * @return Org ID
	 */
	public int getORG_ID() {
		return getObject(3) == null ?  -1 : ((Number)getObject(3)).intValue(); 
	}

	/**
	 * Sets Org ID (Organization).
	 * @param ORG_ID Org ID
	 */
	public void setORG_ID(int ORG_ID) {
		setObject(3, Integer.valueOf(ORG_ID)); 
	}

	/**
	 * Gets Address (Address).
	 * @return Address
	 */
	public String getAddress() {
		String v = getObject(4, String.class); 
		return v;
	}

	/**
	 * Sets Address (Address).
	 * @param address Address
	 */
	public void setAddress(String address) {
		setObject(4, address); 
	}

	/**
	 * Gets Employee (Employee).
	 * @return Employee
	 */
	public int getEmployee_ID() {
		return getObject(5) == null ?  -1 : ((Number)getObject(5)).intValue(); 
	}

	/**
	 * Sets Employee (Employee).
	 * @param employee_ID Employee
	 */
	public void setEmployee_ID(int employee_ID) {
		setObject(5, Integer.valueOf(employee_ID)); 
	}

	// -------------------------------------- Relationships --------------------------------------

	/**
	 * [OWNING] (Complement rel: Employee.addresses - inverse) Gets the specified Employee.
	 * null - null
	 * 
	 * @param employee The Employee.
	 */
	public Employee getEmployee() {
		return (Employee)getRelationshipTargetObject("employee"); 
	}


	/**
	 * [OWNING] (Complement rel: Employee.addresses - inverse) Sets the specified Employee.
	 * null - null
	 * 
	 * @return The Employee.
	 */
	public boolean setEmployee(Employee employee) { 
		return setRelationshipTargetObject("employee", employee);
	}

}

/********************* DO NOT MODIFY - ATHENA CODE GENERATION LOG *******************
 * @file_type EO CLASS for Java - Java 5
 * @entity_id 102
 * @entity_classname com.test.Address
 * @entity_fingerprint 3d288f3f0b6689f16548c91e7815e00a
 * @entity_version 1
 * @generated_on 1289184439445
 * @generated_by Jack
 * @generated_platform Windows 7 6.1 [x86]
 ******************************************************************************/