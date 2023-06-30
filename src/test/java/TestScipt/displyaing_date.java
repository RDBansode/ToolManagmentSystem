package TestScipt;

import java.util.Date;

public class displyaing_date {

	public static void main(String[] args) {
     Date currentdate= new Date();
     System.out.println(currentdate);
     String date = currentdate.toString().replace(" ", "_").replace(":","_");
     System.out.println(date);

     
	}

}
