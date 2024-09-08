import java.util.LinkedHashMap;
import java.util.Map;

public class SubstringsofSizeThreewithDistinctCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "aababcabc";
		
		
		System.out.println(countGoodSubstrings(s));
		
	}

	
	
	
public static int countGoodSubstrings(String s) {
	
/*
Take a count variable to store ans
Create a HashMap and add all characters and their frequencies in that
when the size of map is equal to k ie 3 , increase count++
decrease one frequency of character at i or remove the key if value is 0
*/
int i=0;
int j=0;
int k =3;
int count=0;

Map<Character,Integer> map = new LinkedHashMap<Character,Integer>();
		
while(j<s.length()) {
	
	map.put(s.charAt(j), map.getOrDefault(s.charAt(j),0)+1);
	
//getOrDefault(Object key, V defaultValue) method 
//map.getOrDefault(s.charAt(j),0) gives 0 if char not present in map, +1 to current value if char is present in map

	if(j-i+1<k) {
		
		j++;
	}
	
	else if(j-i+1==k) {
		
		if(map.size()==k) {
		
		count ++;
		}
		map.put(s.charAt(i), map.get(s.charAt(i))-1);
		
		if(map.get(s.charAt(i))==0)
		{
		map.remove(s.charAt(i));	
		}
		i++;
		j++;
	}
	
}
	return count;
        
    }
}
