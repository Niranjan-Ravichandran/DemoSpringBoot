package com.jan.core.model;



/** Model class for project posted by free lance recruiter
 * @author NIRANJAN
 *
 */
public class Project {

	int id;
	String projectName;
	String projectDescription;
	String[] skills;
	String datePosted;
	String expectedDateOfCompletion;
	String paymentType;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the projectName
	 */
	public String getProjectName() {
		return projectName;
	}
	/**
	 * @param projectName the projectName to set
	 */
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	/**
	 * @return the projectDescription
	 */
	public String getProjectDescription() {
		return projectDescription;
	}
	/**
	 * @param projectDescription the projectDescription to set
	 */
	public void setProjectDescription(String projectDescription) {
		this.projectDescription = projectDescription;
	}
	/**
	 * @return the skills
	 */
	public String[] getSkills() {
		return skills;
	}
	/**
	 * @param skills the skills to set
	 */
	public void setSkills(String[] skills) {
		this.skills = skills;
	}
	/**
	 * @return the datePosted
	 */
	public String getDatePosted() {
		return datePosted;
	}
	/**
	 * @param datePosted the datePosted to set
	 */
	public void setDatePosted(String datePosted) {
		this.datePosted = datePosted;
	}
	/**
	 * @return the expectedDateOfCompletion
	 */
	public String getExpectedDateOfCompletion() {
		return expectedDateOfCompletion;
	}
	/**
	 * @param expectedDateOfCompletion the expectedDateOfCompletion to set
	 */
	public void setExpectedDateOfCompletion(String expectedDateOfCompletion) {
		this.expectedDateOfCompletion = expectedDateOfCompletion;
	}
	/**
	 * @return the paymentType
	 */
	public String getPaymentType() {
		return paymentType;
	}
	/**
	 * @param paymentType the paymentType to set
	 */
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	/**
	 * @return the paymentPrice
	 */
	public String getPaymentPrice() {
		return paymentPrice;
	}
	/**
	 * @param paymentPrice the paymentPrice to set
	 */
	public void setPaymentPrice(String paymentPrice) {
		this.paymentPrice = paymentPrice;
	}
	String paymentPrice;
	@Override
		public String toString() {
			// TODO Auto-generated method stub
			return this.id+" "+this.projectName+" "+this.projectDescription;
		}
}
