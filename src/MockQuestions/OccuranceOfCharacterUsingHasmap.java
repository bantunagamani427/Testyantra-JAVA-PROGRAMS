package MockQuestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class OccuranceOfCharacterUsingHasmap {

	public static void main(String[] args) {
		String s="Butterfly";
		
		//creating map with char as key and occerance value
		
		HashMap<Character,Integer> hm=new HashMap<>();
		
		char[] ch = s.toCharArray();//store all character in character array
	//check eachchar of ch	
for(char eachchar:ch) {
//if hm contains each character then add that char with occurance if char is present again that is incremented by 1
	if(hm.containsKey(eachchar)) {
		hm.put(eachchar, hm.get(eachchar)+1);
	}
	
//if character not present again still count 1 only	
	else {
		hm.put(eachchar, 1);
	}
}
//this loop for rotating each key and value
for(Map.Entry entry:hm.entrySet()) {
	System.out.println(entry.getKey()+" "+entry.getValue());
}

	}
	}


