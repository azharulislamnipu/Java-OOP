package allStringMethod;

public class CompareTo {

	public static void main(String[] args) {
		String str1 = "I am azharul Islam Nipu";
		String str2 = "I am a student Of Engeenneing University";
		String str3 = "I am azharul Islam Nipu";
		String str4 = "I AM AZHARUL ISLAM NIPU";
		
		int var1 = str1.compareTo(str2);
		int var2 = str1.compareTo(str3);
		int var3 = str1.compareToIgnoreCase(str4);
		System.out.println("str1 compare to str2 = "+ var1);
		
		System.out.println("str1 compare to str3 = "+ var2);
		System.out.println("str1 compare to str4 = "+ var3);
	}

}
