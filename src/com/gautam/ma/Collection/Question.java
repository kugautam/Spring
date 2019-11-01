package com.gautam.ma.Collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Question
{
	private int questionId;
	private String question;
	private List<String> answer;
	private Set<String>  answer1;
	private Map<Integer, String> answer2;
	
	public int getQuestionId()
	{
		return questionId;
	}
	public void setQuestionId(int questionId) 
	{
		this.questionId = questionId;
	}
	public String getQuestion()
	{
		return question;
	}
	public void setQuestion(String question) 
	{
		this.question = question;
	}
	public List<String> getAnswer()
	{
		return answer;
	}
	public void setAnswer(List<String> answer)
	{
		this.answer = answer;
	}
	
	
	/*
	public Question(int questionId, String question, List<String> answer)
	{
		
		super();
		this.questionId = questionId;
		this.question = question;
		this.answer = answer;
	}
	
	
	
	@Override
	public String toString()
	{
		return "Question [questionId=" + questionId + ", question=" + question + ", answer=" + answer + "]";
	}
	public Set<String> getAnswer1() {
		return answer1;
	}
	public void setAnswer1(Set<String> answer1) {
		this.answer1 = answer1;
	}
	public Map<Integer, String> getAnswer2() {
		return answer2;
	}
	public void setAnswer2(Map<Integer, String> answer2) {
		this.answer2 = answer2;
	}
	
	/*
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("Gautam");list.add("Kumar");
		Question question=new Question(1,"jafhs",list);
		System.err.println(question);
	}
	*/

}
