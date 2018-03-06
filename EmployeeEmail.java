//In an EmployeeEmail class we write addEmployeeEmailId() method that first check
// whether the email IDis in valid  format and then add to it a MAP implementations.
//The isValidEmailId() perform email validation using regular expression.
// I also wrote getEmployeeEmailId() to return Email Id from the Map, given the KEY.

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class EmployeeEmail {
    Map<String , String> hashMap = new HashMap<String , String>();
    
    public void addEmployeeEmailId(String Key , String Value){
    	if(isValidEmailId(Value)){
    		hashMap.put(Key, Value);
    	}
    }
    public String getEmployeeEmailId(Object Key){
    	if(!(Key instanceof String)){
    		throw new IllegalArgumentException("object not type of string");
    	}
    	return hashMap.get(Key);
    }
    
    public boolean isValidEmailId(String email) {
		 String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                 "[a-zA-Z0-9_+&*-]+)*@" +
                 "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                 "A-Z]{2,7}$";
                  
        Pattern pat = Pattern.compile(emailRegex);
        if (email == null)
        return false;
        return pat.matcher(email).matches();

		}
}
