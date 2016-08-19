package shikhok.com;

public class StringArray {

	public static void main(String[] args) {
	
		String Myname= "Azharul Islam Nipu";
		String name;
		name = new String("Neha sahrma");
		
		prln("this is privious Method");
		System.out.println(Myname+" "+name);
		
		prln("this is new Method  :)");
		pr(Myname+" ");
		prln(name);
		prln("the length of name "+name.length()+" uppercase "+name.toUpperCase());
		
		
		
		String [] nameofString = new String [4];
		
		nameofString[0]= "Azharul";
		nameofString[1]= "islam";
		nameofString[2]= "nipu";
		nameofString[3]= "Neha";
		
		prln(nameofString[0]+" "+nameofString[1]+" "+nameofString[2]+" "+nameofString[3]);
	
	
		
		int [][] twoDArray = new int[2][4];
		
		twoDArray[0][0]=10;
		twoDArray[0][1]=15;
		twoDArray[0][2]=20;
		twoDArray[0][3]=25;
		
		twoDArray[1][0]=30;
		twoDArray[1][1]=35;
		twoDArray[1][2]=40;
		twoDArray[1][3]=45;
		
		prln(twoDArray[0][0]+" "+twoDArray[0][1]+" "+twoDArray[0][2]+" "+twoDArray[0][3]);
		
		twoDArray[1][2] += twoDArray[0][2]+twoDArray[0][3];
		prln(twoDArray[1][0]+" "+twoDArray[1][1]+" "+twoDArray[1][2]+" "+twoDArray[1][3]);
		
	} 
	
	static void prln(Object anyObject){
		System.out.println(anyObject);
	}
	static void pr(Object anyObject){
		System.out.print(anyObject);
	}
}
