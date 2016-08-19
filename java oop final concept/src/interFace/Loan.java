package interFace;

public class Loan implements BasicInformation{
	private String loanNo;
	private double principleAmount;
	private int NoOfInstallments;
	private double interestRate;

	public String getLoanNo() {
		return loanNo;
	}

	public void setLoanNo(String loanNo) {
		this.loanNo = loanNo;
	}

	public double getPrincipleAmount() {
		return principleAmount;
	}

	public void setPrincipleAmount(double principleAmount) {
		this.principleAmount = principleAmount;
	}

	public int getNoOfInstallments() {
		return NoOfInstallments;
	}

	public void setNoOfInstallments(int noOfInstallments) {
		NoOfInstallments = noOfInstallments;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

//	public String getDefaultInformation() {
//		return "Loan No:" + loanNo + "principleAmount:" + principleAmount
//				+ "NoOfInstallment" + NoOfInstallments + "InterestRate:"
//				+ interestRate;
//	}

	@Override
	public String GetBasicInfo() {
		return "Loan No:" + loanNo + "principleAmount:" + principleAmount
				+ "NoOfInstallment" + NoOfInstallments + "InterestRate:"
				+ interestRate;
	}

}
