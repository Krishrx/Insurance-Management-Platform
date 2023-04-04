package com.krishrx.imp.dto;

import java.time.LocalDate;

public class InsurancePolicyDto {

	 	private String policyNumber;

	    private String type;

	    private double coverageAmount;

	    private double premium;

	    private LocalDate startDate;

	    private LocalDate endDate;

		public InsurancePolicyDto() {
			
		}

		public InsurancePolicyDto(String policyNumber, String type, double coverageAmount, double premium,
				LocalDate startDate, LocalDate endDate) {
			super();
			this.policyNumber = policyNumber;
			this.type = type;
			this.coverageAmount = coverageAmount;
			this.premium = premium;
			this.startDate = startDate;
			this.endDate = endDate;
		}

		public String getPolicyNumber() {
			return policyNumber;
		}

		public void setPolicyNumber(String policyNumber) {
			this.policyNumber = policyNumber;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public double getCoverageAmount() {
			return coverageAmount;
		}

		public void setCoverageAmount(double coverageAmount) {
			this.coverageAmount = coverageAmount;
		}

		public double getPremium() {
			return premium;
		}

		public void setPremium(double premium) {
			this.premium = premium;
		}

		public LocalDate getStartDate() {
			return startDate;
		}

		public void setStartDate(LocalDate startDate) {
			this.startDate = startDate;
		}

		public LocalDate getEndDate() {
			return endDate;
		}

		public void setEndDate(LocalDate endDate) {
			this.endDate = endDate;
		}
		
		
	    
	    
}
