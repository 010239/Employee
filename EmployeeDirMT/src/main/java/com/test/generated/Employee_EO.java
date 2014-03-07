/*************************** DO NOT MODIFY THIS FILE **************************
 *
 * Generated by Athena Console. All Rights Reserved by Athena Source (c) 2007 - 2011.
 * www.athenaframework.org
 *
 * Generated on Feb 17, 2011 14:58:04 by Jack (Windows 7 6.1 [x86])
 * DB: MySQL 5.0[connection pool - driver class: com.mysql.jdbc.Driver, url: jdbc:mysql://localhost/employeedirMT?useUnicode=yes&characterEncoding=UTF-8, max active: 10, max idle: 0, max wait time: 5000, connection timeout: 300]
 *
 ******************************************************************************/

package com.test.generated;

import org.athenasource.framework.eo.core.EOObject;

/**
 * Generated EO class for Employee
 *
 * @version 1
 */
public class Employee_EO extends EOObject {

	public static final String META_XSD_VERSION = "2.0"; // META VERSION
	public static final int COLUMN_COUNT = 6; // total number of columns, i.e., attributes
	public static final int ENTITY_ID = 101; // the entity type id. 
	public static final String SYSTEM_NAME = "Employee"; // the entity system name. 
	public static final String TABLE_NAME = "Data_Employee"; // the table name. 

	// Property names 
	public static final String ATTR_employee_ID = "employee_ID"; // Primary key
	public static final String ATTR_version = "version"; // Version
	public static final String ATTR_status = "status"; // EO status
	public static final String ATTR_ORG_ID = "ORG_ID"; // Organization
	public static final String ATTR_nameFull = "nameFull";
	public static final String ATTR_bornYear = "bornYear";


	/**
	 * Gets Employee ID (Primary key).
	 * @return Employee ID
	 */
	public int getEmployee_ID() {
		return getObject(0) == null ?  -1 : ((Number)getObject(0)).intValue(); 
	}

	/**
	 * Sets Employee ID (Primary key).
	 * @param employee_ID Employee ID
	 */
	public void setEmployee_ID(int employee_ID) {
		setObject(0, Integer.valueOf(employee_ID)); 
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
	 * Gets Full name (Full name).
	 * @return Full name
	 */
	public String getNameFull() {
		String v = getObject(4, String.class); 
		return v;
	}

	/**
	 * Sets Full name (Full name).
	 * @param nameFull Full name
	 */
	public void setNameFull(String nameFull) {
		setObject(4, nameFull); 
	}

	/**
	 * Gets Born year (Born year).
	 * @return Born year
	 */
	public int getBornYear() {
		return getObject(5) == null ?  -1 : ((Number)getObject(5)).intValue(); 
	}

	/**
	 * Sets Born year (Born year).
	 * @param bornYear Born year
	 */
	public void setBornYear(int bornYear) {
		setObject(5, Integer.valueOf(bornYear)); 
	}

	// -------------------------------------- Relationships --------------------------------------

}

/********************* DO NOT MODIFY - ATHENA CODE GENERATION LOG *******************
 * @file_type EO CLASS for Java - Java 5
 * @entity_id 101
 * @entity_classname com.test.Employee
 * @entity_fingerprint d5467a337de0af59d1bf144c636bbe67
 * @entity_version 1
 * @generated_on 1297925884852
 * @generated_by Jack
 * @generated_platform Windows 7 6.1 [x86]
 ******************************************************************************/