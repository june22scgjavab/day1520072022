package arraytolist;

import java.util.Arrays;
import java.util.List;

public class Application {

	public static void main(String[] args) {
	
		String array[]= {"Ravi","Ashok"};
		List<String> names=Arrays.asList(array);
        System.out.println(names);
        
        Mobile mobiles[]= {new Mobile(1,"Samsung"),new Mobile(2,"Apple")};
        List<Mobile> mobileList=Arrays.asList(mobiles);
	    System.out.println(mobileList);
	}

}
