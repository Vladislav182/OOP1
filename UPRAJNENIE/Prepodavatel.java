package UPRAJNENIE;

public class Prepodavatel {
	Subject pr1 = new Subject();
	   private String Subject = pr1.getPname();
	 
	   public  Prepodavatel(String name,String egn,String p) {
	       setName(name);
	       setEGN(egn);
	  	   this.Subject = pr1.setPname(p);
	   }
	   public void setTeacher(String name,String egn,String p) {
		       setName(name);
		       setEGN(egn);
		  	   this.Subject = pr1.setPname(p);
	   }
	   public String getTeacher() {
		   return getName() + getEGN() + this.Subject;
	   }
	 
	   }
}
