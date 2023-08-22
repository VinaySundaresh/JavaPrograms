package com.xworkz.app;

public class StringRunner {

	public static void main(String[] args) {
		
		System.out.println("Invoking main in StringRunner");
		
		String s=new String();
		s="I am Learning at xworkz";
		
		
		// charAt(int index)
        char firstChar = s.charAt(0);
        System.out.println("First character: " + firstChar);
        
        // split(String regex)
        String[] splitArray = s.split(",");
        System.out.println("Split array: ");
        for (String sum : splitArray) {
            System.out.println(sum.trim());
        }
        
     // concat(String str)
        String concatenatedString = s.concat(" Welcome!");
        System.out.println("Concatenated string: " + concatenatedString);
        
        
        // isEmpty()
        boolean isEmpty = s.isEmpty();
        System.out.println("Is empty: " + isEmpty);
        
        // length()
        int length = s.length();
        System.out.println("Length: " + length);
        
        // substring(int beginIndex)
        String substringFromIndex5 = s.substring(5);
        System.out.println("Substring from index 5: " + substringFromIndex5);
        
        // substring(int beginIndex, int endIndex)
        String substringRange = s.substring(7, 12);
        System.out.println("Substring from index 7 to 12: " + substringRange);
        
        int a=s.compareTo("Vinay");
        System.out.println("Compared result is "+a);
        
        // toLowerCase()
        String lowercaseString = s.toLowerCase();
        System.out.println("Lowercase: " + lowercaseString);
        
        // toUpperCase()
        String uppercaseString = s.toUpperCase();
        System.out.println("Uppercase: " + uppercaseString);
        
        // trim()
        String trimmedString = s.trim();
        System.out.println("Trimmed: " + trimmedString);
        
        // equals(Object obj)
        boolean isEqual = s.equals("Hello, World!");
        System.out.println("Equals: " + isEqual);
        
        // equalsIgnoreCase(String anotherString)
        boolean isEqualIgnoreCase = s.equalsIgnoreCase("hello, world!");
        System.out.println("Equals Ignore Case: " + isEqualIgnoreCase);
        
        // startsWith(String prefix)
        boolean startsWithHello = s.startsWith("Hello");
        System.out.println("Starts with 'Hello': " + startsWithHello);
        
        // endsWith(String suffix)
        boolean endsWithExclamation = s.endsWith("!");
        System.out.println("Ends with '!': " + endsWithExclamation);
        
        // contains(CharSequence sequence)
        boolean containsWorld = s.contains("World");
        System.out.println("Contains 'World': " + containsWorld);
        
        // replace(char oldChar, char newChar)
        String replacedComma = s.replace(',', '-');
        System.out.println("Replaced comma: " + replacedComma);
        
        // replaceAll(String regex, String replacement)
        String replacedWhitespace = s.replaceAll("\\s", "_");
        System.out.println("Replaced whitespace: " + replacedWhitespace);
        
        // indexOf(int ch)
        int indexOfComma = s.indexOf(',');
        System.out.println("Index of comma: " + indexOfComma);
        
        // lastIndexOf(int ch)
        int lastIndexOfSpace = s.lastIndexOf(' ');
        System.out.println("Last index of space: " + lastIndexOfSpace);
        
        // indexOf(String str)
        int indexOfWorld = s.indexOf("World");
        System.out.println("Index of 'World': " + indexOfWorld);
        
        // lastIndexOf(String str)
        int lastIndexOfSpaceSubstring = s.lastIndexOf(" ");
        System.out.println("Last index of space (substring): " + lastIndexOfSpaceSubstring);
    }
	

}
