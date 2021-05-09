package com.kaiconkcodes.springbootstarter.vaccine;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

// @Entity // This tells Hibernate to make a table out of this class
public class VaccineAdministered {
	
	private String extractType;		/* Locally Defined Value Set - D (Deidentified), P (PPRL), I  (Identified) */
	private String privacyID;		/* Privacy Preserving Record Linkage ID */
//	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer recipientID; 	/* Required Unique ID for this recipient */
	private String recipienFirstName;
	private String recipientMiddleName;	
	private String recipientLastName;
	private String recipientDob;
	private String recipientSex;	
	private String recipientAddressStreet; 			
	private String recipientAddressStreet2; 			
	private String recipientAddressCity;			
	private String recipientAddressCounty;		
	private String recipientAddressState;				
	private String recipientAddressZip;				
	private String recipientRace1;			
	private String recipientRace2;					
	private String recipientRace3;				
	private String recipientRace4;					
	private String recipientRace5;				
	private String recipientRace6;					
	private String recipientEthnicity;			
	private String vaxEventId;			
	private String adminDate;			
	private String cvx;				
	private String ndc;				
	private String mvx;				
	private String lotNumber;		
	private String vaxExpiration;			
	private String vaxAdminSite;			
	private String vaxRoute;		
	private String doseNumber;			
	private String vaxSeriesComplete;	
	private String responsibleOrganization;		
	private String adminName;			
	private String vtrcksProviderPin;		
	private String adminType;			
	private String adminAddressStreet;		
	private String adminAddressStreet2;
	private String adminAddressCity;	
	private String adminAddressCounty;		
	private String adminAddressState;		
	private String adminAddressZip;		
	private String vaxProviderSuffix;		
	private String vaxRefusal;		
	private String comorbidityStatus;			
	private String recipientMissedAppt;		
	private String serology;			
	private String rowCreatedDatetime;			
	private String lastModifiedDatetime;			
	private String lastModifiedBy;
	
	public VaccineAdministered(String extractType, String privacyID, Integer recipientID, String firstName, 
			String middleName, String lastName, String dob, String sex, String streetAddress,
			String streetAddress2, String city, String county, String state, String zip,
			String race1, String race2, String race3, String race4, String race5, String race6,
			String ethnicity, String vaccineEventId, String vaccineAdministrationDate, String cvx,
			String ndc, String manufacturer, String lotNumber, String vaccineExpiration, 
			String vaccineAdminSite, String vaccineRoute, String vaccineDoseNumber, 
			String vaccineSeriesComplete, String responsibleOrganization, String administratorName,
			String vtrcksProviderPin, String adminType, String adminStreetAddress, 
			String adminStreetAddress2, String adminCity, String adminCounty, String adminState,
			String adminZip, String vaccineProviderSuffix, String vaccineRefusal, String comorbidityStatus,
			String recipientMissedAppt, String serology, String rowCreatedDatetime, 
			String lastModifiedDatetime, String lastModifiedBy ) {
		super();
		this.extractType = extractType;
		this.privacyID = privacyID;
		this.recipientID = recipientID;
		this.recipienFirstName = firstName;
		this.recipientMiddleName = middleName;
		this.recipientLastName = lastName;
		this.recipientDob = dob;
		this.recipientSex = sex;
		this.recipientAddressStreet = streetAddress;
		this.recipientAddressStreet2 = streetAddress2;
		this.recipientAddressCity = city;
		this.recipientAddressCounty = county;
		this.recipientAddressZip = zip;
		this.recipientRace1 = race1;
		this.recipientRace2 = race2;
		this.recipientRace3 = race3;
		this.recipientRace4 = race4;
		this.recipientRace5 = race5;
		this.recipientRace6 = race6;
		this.recipientEthnicity = ethnicity;
		this.vaxEventId = vaccineEventId;
		this.adminDate = vaccineAdministrationDate;
		this.cvx = cvx;
		this.ndc = ndc;
		this.mvx = manufacturer;
		this.lotNumber = lotNumber;
		this.vaxExpiration = vaccineExpiration;
		this.vaxAdminSite = vaccineAdminSite;
		this.vaxRoute = vaccineRoute;
		this.doseNumber = vaccineDoseNumber;
		this.vaxSeriesComplete = vaccineSeriesComplete;
		this.responsibleOrganization = responsibleOrganization;
		this.adminName = administratorName;
		this.vtrcksProviderPin = vtrcksProviderPin;
		this.adminType = adminType;
		this.adminAddressStreet = adminStreetAddress;
		this.adminAddressStreet2 = adminStreetAddress2;
		this.adminAddressCity = adminCity;
		this.adminAddressCounty = adminCounty;
		this.adminAddressState = adminState;
		this.adminAddressZip = adminZip;
		this.vaxProviderSuffix = vaccineProviderSuffix;
		this.vaxRefusal = vaccineRefusal;
		this.comorbidityStatus = comorbidityStatus;
		this.recipientMissedAppt = recipientMissedAppt;
		this.serology = serology;
		this.rowCreatedDatetime = rowCreatedDatetime;
		this.lastModifiedDatetime = lastModifiedDatetime;
		this.lastModifiedBy = lastModifiedBy;
	}
	
	public VaccineAdministered() {

	}
	
	public String getExtractType() {
		return extractType;
	}
	public void setExtractType(String extractType) {
		this.extractType = extractType;
	}
	public String getPrivacyID() {
		return privacyID;
	}
	public void setPrivacyID(String privacyID) {
		this.privacyID = privacyID;
	}
	public Integer getRecipientID() {
		return recipientID;
	}
	public void setRecipientID(Integer recipientID) {
		this.recipientID = recipientID;
	}
	public String getRecipienFirstName() {
		return recipienFirstName;
	}
	public void setRecipienFirstName(String recipienFirstName) {
		this.recipienFirstName = recipienFirstName;
	}
	public String getRecipientMiddleName() {
		return recipientMiddleName;
	}
	public void setRecipientMiddleName(String recipientMiddleName) {
		this.recipientMiddleName = recipientMiddleName;
	}
	public String getRecipientLastName() {
		return recipientLastName;
	}
	public void setRecipientLastName(String recipientLastName) {
		this.recipientLastName = recipientLastName;
	}
	public String getRecipientDob() {
		return recipientDob;
	}
	public void setRecipientDob(String recipientDob) {
		this.recipientDob = recipientDob;
	}
	public String getRecipientSex() {
		return recipientSex;
	}
	public void setRecipientSex(String recipientSex) {
		this.recipientSex = recipientSex;
	}
	public String getRecipientAddressStreet() {
		return recipientAddressStreet;
	}
	public void setRecipientAddressStreet(String recipientAddressStreet) {
		this.recipientAddressStreet = recipientAddressStreet;
	}
	public String getRecipientAddressStreet2() {
		return recipientAddressStreet2;
	}
	public void setRecipientAddressStreet2(String recipientAddressStreet2) {
		this.recipientAddressStreet2 = recipientAddressStreet2;
	}
	public String getRecipientAddressCity() {
		return recipientAddressCity;
	}
	public void setRecipientAddressCity(String recipientAddressCity) {
		this.recipientAddressCity = recipientAddressCity;
	}
	public String getRecipientAddressCounty() {
		return recipientAddressCounty;
	}
	public void setRecipientAddressCounty(String recipientAddressCounty) {
		this.recipientAddressCounty = recipientAddressCounty;
	}
	public String getRecipientAddressState() {
		return recipientAddressState;
	}
	public void setRecipientAddressState(String recipientAddressState) {
		this.recipientAddressState = recipientAddressState;
	}
	public String getRecipientAddressZip() {
		return recipientAddressZip;
	}
	public void setRecipientAddressZip(String recipientAddressZip) {
		this.recipientAddressZip = recipientAddressZip;
	}
	public String getRecipientRace1() {
		return recipientRace1;
	}
	public void setRecipientRace1(String recipientRace1) {
		this.recipientRace1 = recipientRace1;
	}
	public String getRecipientRace2() {
		return recipientRace2;
	}
	public void setRecipientRace2(String recipientRace2) {
		this.recipientRace2 = recipientRace2;
	}
	public String getRecipientRace3() {
		return recipientRace3;
	}
	public void setRecipientRace3(String recipientRace3) {
		this.recipientRace3 = recipientRace3;
	}
	public String getRecipientRace4() {
		return recipientRace4;
	}
	public void setRecipientRace4(String recipientRace4) {
		this.recipientRace4 = recipientRace4;
	}
	public String getRecipientRace5() {
		return recipientRace5;
	}
	public void setRecipientRace5(String recipientRace5) {
		this.recipientRace5 = recipientRace5;
	}
	public String getRecipientRace6() {
		return recipientRace6;
	}
	public void setRecipientRace6(String recipientRace6) {
		this.recipientRace6 = recipientRace6;
	}
	public String getRecipientEthnicity() {
		return recipientEthnicity;
	}
	public void setRecipientEthnicity(String recipientEthnicity) {
		this.recipientEthnicity = recipientEthnicity;
	}
	public String getVaxEventId() {
		return vaxEventId;
	}
	public void setVaxEventId(String vaxEventId) {
		this.vaxEventId = vaxEventId;
	}
	public String getAdminDate() {
		return adminDate;
	}
	public void setAdminDate(String adminDate) {
		this.adminDate = adminDate;
	}
	public String getCvx() {
		return cvx;
	}
	public void setCvx(String cvx) {
		this.cvx = cvx;
	}
	public String getNdc() {
		return ndc;
	}
	public void setNdc(String ndc) {
		this.ndc = ndc;
	}
	public String getMvx() {
		return mvx;
	}
	public void setMvx(String mvx) {
		this.mvx = mvx;
	}
	public String getLotNumber() {
		return lotNumber;
	}
	public void setLotNumber(String lotNumber) {
		this.lotNumber = lotNumber;
	}
	public String getVaxExpiration() {
		return vaxExpiration;
	}
	public void setVaxExpiration(String vaxExpiration) {
		this.vaxExpiration = vaxExpiration;
	}
	public String getVaxAdminSite() {
		return vaxAdminSite;
	}
	public void setVaxAdminSite(String vaxAdminSite) {
		this.vaxAdminSite = vaxAdminSite;
	}
	public String getVaxRoute() {
		return vaxRoute;
	}
	public void setVaxRoute(String vaxRoute) {
		this.vaxRoute = vaxRoute;
	}
	public String getDoseNumber() {
		return doseNumber;
	}
	public void setDoseNumber(String doseNumber) {
		this.doseNumber = doseNumber;
	}
	public String getVaxSeriesComplete() {
		return vaxSeriesComplete;
	}
	public void setVaxSeriesComplete(String vaxSeriesComplete) {
		this.vaxSeriesComplete = vaxSeriesComplete;
	}
	public String getResponsibleOrganization() {
		return responsibleOrganization;
	}
	public void setResponsibleOrganization(String responsibleOrganization) {
		this.responsibleOrganization = responsibleOrganization;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getVtrcksProviderPin() {
		return vtrcksProviderPin;
	}
	public void setVtrcksProviderPin(String vtrcksProviderPin) {
		this.vtrcksProviderPin = vtrcksProviderPin;
	}
	public String getAdminType() {
		return adminType;
	}
	public void setAdminType(String adminType) {
		this.adminType = adminType;
	}
	public String getAdminAddressStreet() {
		return adminAddressStreet;
	}
	public void setAdminAddressStreet(String adminAddressStreet) {
		this.adminAddressStreet = adminAddressStreet;
	}
	public String getAdminAddressStreet2() {
		return adminAddressStreet2;
	}
	public void setAdminAddressStreet2(String adminAddressStreet2) {
		this.adminAddressStreet2 = adminAddressStreet2;
	}
	public String getAdminAddressCity() {
		return adminAddressCity;
	}
	public void setAdminAddressCity(String adminAddressCity) {
		this.adminAddressCity = adminAddressCity;
	}
	public String getAdminAddressCounty() {
		return adminAddressCounty;
	}
	public void setAdminAddressCounty(String adminAddressCounty) {
		this.adminAddressCounty = adminAddressCounty;
	}
	public String getAdminAddressState() {
		return adminAddressState;
	}
	public void setAdminAddressState(String adminAddressState) {
		this.adminAddressState = adminAddressState;
	}
	public String getAdminAddressZip() {
		return adminAddressZip;
	}
	public void setAdminAddressZip(String adminAddressZip) {
		this.adminAddressZip = adminAddressZip;
	}
	public String getVaxProviderSuffix() {
		return vaxProviderSuffix;
	}
	public void setVaxProviderSuffix(String vaxProviderSuffix) {
		this.vaxProviderSuffix = vaxProviderSuffix;
	}
	public String getVaxRefusal() {
		return vaxRefusal;
	}
	public void setVaxRefusal(String vaxRefusal) {
		this.vaxRefusal = vaxRefusal;
	}
	public String getComorbidityStatus() {
		return comorbidityStatus;
	}
	public void setComorbidityStatus(String comorbidityStatus) {
		this.comorbidityStatus = comorbidityStatus;
	}
	public String getRecipientMissedAppt() {
		return recipientMissedAppt;
	}
	public void setRecipientMissedAppt(String recipientMissedAppt) {
		this.recipientMissedAppt = recipientMissedAppt;
	}
	public String getSerology() {
		return serology;
	}
	public void setSerology(String serology) {
		this.serology = serology;
	}
	public String getRowCreatedDatetime() {
		return rowCreatedDatetime;
	}
	public void setRowCreatedDatetime(String rowCreatedDatetime) {
		this.rowCreatedDatetime = rowCreatedDatetime;
	}
	public String getLastModifiedDatetime() {
		return lastModifiedDatetime;
	}
	public void setLastModifiedDatetime(String lastModifiedDatetime) {
		this.lastModifiedDatetime = lastModifiedDatetime;
	}
	public String getLastModifiedBy() {
		return lastModifiedBy;
	}
	public void setLastModifiedBy(String lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy;
	}		


}
