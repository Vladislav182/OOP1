package UPRAJNENIE;

public class Person {
	 private String name;
	    private String egn;
	 
	    public Person() {
	    	this.name ="";
	    	this.egn="";
	 
	    }
	    public Person(String name,String egn) {
	    	this.name = name;
	    	this.egn = egn;
	    }
	 
	    public String getEGN() {
	    	return this.egn;
	    }
	    public void setEGN(String egn) {
	    	this.name=egn;
	    }
	    public String getName() {
	    	return this.name;
	    }
	    public void setName(String name) {
	    	this.name=name;
	    }
	}
	 