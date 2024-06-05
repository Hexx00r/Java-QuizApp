
public class Questions {
	
	private String question;
	private String optionA;
	private String optionB;
	private String optionC;
	
	
	
	public Questions(String question, String optionA, String optionB, String optionC) {
		super();
		this.question = question;
		this.optionA = optionA;
		this.optionB = optionB;
		this.optionC = optionC;
	}
	
	
	
	
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getOptionA() {
		return optionA;
	}
	public void setOptionA(String optionA) {
		this.optionA = optionA;
	}
	public String getOptionB() {
		return optionB;
	}
	public void setOptionB(String optionB) {
		this.optionB = optionB;
	}
	public String getOptionC() {
		return optionC;
	}
	public void setOptionC(String optionC) {
		this.optionC = optionC;
	}




	@Override
	public String toString() {
		return "Questions [question=" + question + ", optionA=" + optionA + ", optionB=" + optionB + ", optionC="
				+ optionC + "]";
	}
	
	
	
	
 
	
	 

}
