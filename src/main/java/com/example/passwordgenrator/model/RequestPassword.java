package com.example.passwordgenrator.model;

public class RequestPassword {
	public int length;
	public boolean upperCase;
	public boolean lowerCase;
	public boolean specialCase;
	public boolean numbers;
	
	public RequestPassword() {}
	public RequestPassword(int length,boolean upperCase,boolean lowerCase,boolean specialCase,boolean numbers){
		this.length=length;
		this.upperCase=upperCase;
		this.lowerCase=lowerCase;
		this.specialCase=specialCase;
		this.numbers=numbers;
	}
	public void setLength(int length) {this.length=length;}
	public void setUpperCase(boolean upperCase) {this.upperCase=upperCase;}
	public void setLowerCase(boolean lowerCase) {this.lowerCase=lowerCase;}
	public void setSpecialCase(boolean specialCase) {this.specialCase=specialCase;}
	public void setNumbers(boolean numbers) {this.numbers=numbers;}

	public int getLength() {return this.length;}
	public boolean getUpperCase() {return this.upperCase;}
	public boolean getLowerCase() {return this.lowerCase;}
	public boolean getSpecialCase() {return this.specialCase;}
	public boolean getNumbers() {return this.numbers;}
	
	
}
