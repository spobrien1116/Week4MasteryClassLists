import java.util.ArrayList;
import java.util.List;

public class Week4MasteryClassLists {

    public static void main(String[] args) {
        // Create a List of Integers from one to the value stored in endNum. After the list has been
        // created, then print it to the console.
        List<Integer> numbers = new ArrayList<Integer>();
        int endNum = 10;
        for (int i = 1; i <= endNum; i++) {
            numbers.add(i);
        }
        System.out.println(numbers);
        // Break

        // Given a list stored in productList, write a program that will access elements in the list
        // based on the index value stored in indexVal. Because this number is provided by the user,
        // check to make sure the number is at least zero (0), but not larger than the index value of 
        // the last item in the list.
        // If indexVal is valid, print the product associated with the value stored at indexVal. If
        // indexVal is not valid, then print to the console, "No product can be found with that 
        // product number."
        //DO NOT CHANGE CODE BELOW
		int indexVal = 5;
		List<String> productList = new ArrayList<>(); 
		
		productList.add("Macbook");
		productList.add("HP Notebook");
		productList.add("iPhone 12");
		productList.add("Acer Aspire");
		productList.add("Windows Surface");
		productList.add("Galaxy S20");
		//DO NOT CHANGE CODE ABOVE
		
		// Write your code below this line
        if (indexVal >=0 && indexVal < productList.size()) {
            System.out.println(productList.get(indexVal));
        } else {
            System.out.println("No product can be found with that product number.");
        }
        // Break

        // Given a List called tenWords that contains ten (10) different words, write a program
        // that takes integer values stored in num1, num2, and num3 and use that to find the
        // value stored in the particular positions in the List. Take these three (3) words and
        // create a new List called threeWords. Print out the List stored in threeWords to the
        // console. Don't forget to make sure the numbers entered for num1, num2, and num3 is 
        // between 0 and 9. ---Pair with method 1---
        int num1 = 5;
		int num2 = 1;
		int num3 = 7;
		
		List<String> tenWords = new ArrayList<>();
		tenWords.add("Bumfuzzle");
		tenWords.add("Cattywampus");
		tenWords.add("Widdershins");
		tenWords.add("Gubbins");
		tenWords.add("Lollygag");
		tenWords.add("Malarkey");
		tenWords.add("Wabbit");
		tenWords.add("Impignorate");
		tenWords.add("Yarborough");
		tenWords.add("Bloviate");
		
		wordReplace(tenWords, num1, num2, num3);
        // Break

        // Given a List of characters called alphabet, search the list for the character stored
        // in userLetter and print to the console the index value of that character.
        // ---Pair with method 2---
        char userLetter = 'f';
		
		List<Character> alphabet = new ArrayList<>();
		for (int i = 97; i < (97+26); i++) {
		    alphabet.add((char) i);
		}
		
		findLetter(alphabet, userLetter);
    }
    // ---Pair with body 1---
    public static void wordReplace(List<String> tenWords, int num1, int num2, int num3) {
        List<String> shorterList = new ArrayList<String>();
        if (num1 >= 0 && num1 < 10 && num2 >= 0 && num2 < 10 && num3 >=0 && num3 < 10) {
            shorterList.add(tenWords.get(num1));
            shorterList.add(tenWords.get(num2));
            shorterList.add(tenWords.get(num3));
            System.out.println(shorterList);
        } else {
            System.out.println("Sorry, there was an error getting a number you requested.");
        }
    }
    // Break

    // ---Pair with body 2---
    static void findLetter(List alphabet, char userLetter) {
        System.out.println(alphabet.indexOf(userLetter));
    }
}