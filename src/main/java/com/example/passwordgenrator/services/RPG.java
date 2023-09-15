package com.example.passwordgenrator.services;
import java.util.Random;
public class RPG{
    private  int length=8;
    private boolean capitalsRequired;
    private boolean specialCharacterRequired;
    private boolean numbersRequired;
    private boolean smallLettersRequired;
    private StringBuilder password = new StringBuilder("");
    
    Random rand= new Random();
    private final String specialCharacters = "!\"#$%&\'()*+,-./:;<=>?@[\\]^_`{|}~";
    
    private void addSmallLetter() {
    	int x= rand.nextInt(97,111);
    	String temp=""+(char) x;
      	this.password=this.password.append(temp);
    }
    private void addCapitalLetter() {
    	int x= rand.nextInt(65,91);
    	String temp=""+(char) x;
      	this.password=this.password.append(temp);
    }
    private void addSpecialcharacters() {
    	int x= rand.nextInt(32);
    	String temp=Character.toString(this.specialCharacters.charAt(x));
      	this.password=this.password.append(temp);
    }
    
    private void addNumbers() 
    {
    	int x= rand.nextInt(10);
    	String temp=Integer.toString(x);
      	this.password=this.password.append(temp);
    }
    
    
    
    
    public String generate() {
    	if(!this.smallLettersRequired && !this.specialCharacterRequired) {
    		if(!this.numbersRequired && !this.capitalsRequired) {
    			return "";
    		}
    	}
    	this.password.delete(0, this.password.length());
    	while(this.password.length()<this.length) {
    		int x =rand.nextInt(1,5);
        	switch (x){
        	case 1:
        		if(this.smallLettersRequired) {
        			addSmallLetter();}
        		break;
        	case 2:
        		if(this.capitalsRequired) {
        		addCapitalLetter();}
    			break;
        	case 3:
        		if(this.specialCharacterRequired) {
        		addSpecialcharacters();}
    			break;
        	case 4:if(this.numbersRequired) {addNumbers();}
        	}
    		
    	}
    return this.password.toString();
    }
    
   
    
    public RPG(){}
    public RPG(int length,boolean capitalsRequired,boolean specialCharacterRequired,boolean numbersRequired){
    this.length=length;
    this.capitalsRequired=capitalsRequired;
    this.specialCharacterRequired=specialCharacterRequired;
    this.numbersRequired=numbersRequired;   
    }

    void setLength(int length) {this.length=length;}
    void setCapitalsRequired(boolean capitalsRequired) {this.capitalsRequired=capitalsRequired;}
    void setSpecialCharacterRequired(boolean specialCharacterRequired) {this.specialCharacterRequired=specialCharacterRequired;}
    void setNumbersRequired(boolean numbersRequired) {this.numbersRequired=numbersRequired;}
    void setSmallLettersRequired(boolean smallLettersRequired) {this.smallLettersRequired=smallLettersRequired;}
    
    int getLength() {return this.length;}
    boolean getCapitalsRequired() {return this.capitalsRequired;}
    boolean getSpecialCharacterRequired() {return this.specialCharacterRequired;}
    boolean getNumbersRequired() {return this.numbersRequired;}
    boolean getSmallLettersRequired() {return this.smallLettersRequired;}
    

}