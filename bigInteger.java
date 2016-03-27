import java.util.*;
import static java.lang.System.out;

public class bigInteger{
	public static void main (String[] args){
	ArrayList<Integer> value;
	String a;
	String b;
	Scanner scanner = new Scanner(System.in);
	System.out.println("please input 2 number:");
	a = scanner.next();
    b = scanner.next();
	value = new ArrayList<>();
	
	ArrayList<Integer> arraylist1 = new ArrayList<>();
	ArrayList<Integer> arraylist2 = new ArrayList<>();
	
	String[] ArrayList1 = a.split("");
	String[] ArrayList2 = b.split("");
	ArrayList<Integer> arraylist3 = new ArrayList<>();
	
	for(int i = 0;i< a.length();i++){
		arraylist1.add(Integer.valueOf(ArrayList1[i]));
	}
	for(int i = 0;i< b.length();i++){
		arraylist2.add(Integer.valueOf(ArrayList2[i]));
	}
	
	
	if(a.length() == b.length()){
		for(int i =0;i < a.length();i++){
			arraylist3.add(arraylist1.get(i)+(arraylist2.get(i)));
		}
		for(int i =a.length()-1;i> 0;i--){
			if(arraylist3.get(i)>=10){
				arraylist3.set(i,(arraylist3.get(i)%10));
				arraylist3.set(i-1,arraylist3.get(i-1)+1);
			}
			
		
			
			

		}
		if(arraylist3.get(0)>= 10){
				arraylist3.set(0,arraylist3.get(0)%10);
				Collections.reverse(arraylist3);
				arraylist3.add(1);
				Collections.reverse(arraylist3);
		}
		
	}
	else{
		if(a.length()>b.length()){
			Collections.reverse(arraylist1);
			Collections.reverse(arraylist2);
			for(int g = 1;g <=a.length() - b.length();g++){
				arraylist2.add(0);
			}
			for(int t = 0;t <a.length();t++){
				arraylist3.add(arraylist1.get(t)+arraylist2.get(t));
			}
			for(int i =0;i< a.length()-1;i++){
			if(arraylist3.get(i)>=10){
				arraylist3.set(i+1,arraylist3.get(i+1)+1);
				arraylist3.set(i,(arraylist3.get(i)%10));
			}
		}
		if(arraylist3.get(a.length()-1)>= 10){
				arraylist3.set(a.length()-1,arraylist3.get(a.length()-1)%10);
				arraylist3.add(1);
		}
		Collections.reverse(arraylist3);
		}
		else{
			Collections.reverse(arraylist1);
			Collections.reverse(arraylist2);
			for(int g = 1;g <=b.length() - a.length();g++){
				arraylist1.add(0);
			}
			for(int t = 0;t <b.length();t++){
				arraylist3.add(arraylist1.get(t)+(arraylist2.get(t)));
			}
			for(int i =0;i< b.length()-1;i++){
			if(arraylist3.get(i)>=10){
				arraylist3.set(i+1,arraylist3.get(i+1)+1);
				arraylist3.set(i,(arraylist3.get(i)%10));
			}
		}
		if(arraylist3.get(b.length()-1)>= 10){
				arraylist3.set(b.length()-1,arraylist3.get(b.length()-1)%10);
				arraylist3.add(1);
		}
		Collections.reverse(arraylist3);
			
		}
		
		
		
		
		
	}
	//arraylist3.add(ArrayList1.get()+ArrayList2.get());
	System.out.println("The total is:"+arraylist3);


	}


}