import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class PuzzleJava {
    //Create an array with the following values: 3,5,1,2,7,9,8,13,25,32. Print the sum of all numbers in the array. Also have the function return an array that only includes numbers that are greater than 10 (e.g. when you pass the array above, it should return an array with the values of 13,25,32)
    public void sumAndGreaterThan10(int[] arr){         //create a method with a return of void because nothing is being returned
        ArrayList<Integer> newArray = new ArrayList<Integer>();     //create Arraylist of integers named new Array
        int sum = 0;            //create a variable of type int called sum and set it to start at 0
        for(int i = 0; i < arr.length; i++){        //loop through the length of the array
            sum += arr[i];              //add the current value to sum
            if(arr[i] > 10){            //if statement to check to see if the current value is greater than 10
                newArray.add(arr[i]);   //if so then add that value to newArray
            }
        }
        System.out.println(sum);
        System.out.println(newArray);
    }


    //Create an array with the following values: Nancy, Jinichi, Fujibayashi, Momochi, Ishikawa. Shuffle the array and print the name of each person. Have the method also return an array with names that are longer than 5 characters.
    public void shuffleStrings(String[] arr){
        ArrayList<String> newList = new ArrayList<String>();        //create a arraylist of strings this will hold our list of names provided for us, so that we can shuffle them later
        ArrayList<String> newList5 = new ArrayList<String>();       //create a arraylist of strings this will contain our returned array of names that are no longer than 5 characers
        for(int i = 0; i < arr.length; i++){        //loop through our array
            if(arr[i].length() > 5){                //if statement to check if the string is longer than 5 characters
                newList5.add(arr[i]);               //if so then add it to our newList5
            }
            newList.add(arr[i]);                    //add every name into our newList for shuffling later
        }
        Collections.shuffle(newList);               //shuffle our newList of names
        System.out.println(newList);                //print shuffled names
        System.out.println(newList5);               //print list of names with no more than 5 chars
    }


    //Create an array that contains all 26 letters of the alphabet (this array must have 26 values). Shuffle the array and, after shuffling, display the last letter from the array. Have it also display the first letter of the array. If the first letter in the array is a vowel, have it display a message.
    //To shuffle a collection, you can use the shuffle method of the Collections class. Collections Class documentation
    public void shuffleAlphabet(){
        ArrayList<String> alphaArr = new ArrayList<String>();       //create a new arraylist of strings named alphaArr
        for(char alpha = 'A'; alpha <= 'Z'; alpha++){               //loop through the alphabet from A-Z
            alphaArr.add(Character.toString(alpha));                //add each letter of alphabet to our arraylist alphaArr
        }
        System.out.println(alphaArr);                               //print out alphaArr, should be alphabet in order, 26 values
        Collections.shuffle(alphaArr);                              //shuffle alphaArr
        System.out.println(alphaArr);                               //print out our newly shuffled alhpabet

        System.out.println("First letter of shuffled array: " + alphaArr.get(0));   //get the first value of the array and print it
        System.out.println("Last letter of shuffled array: " + alphaArr.get(25));   //get the last value of the array and print
        String sample = alphaArr.get(0);                            //gets the first value of the array and places it into a newly created variable called sample, in order to test if it is a vowel or not

        if("AEIOU".indexOf(sample) > 0){        //if statement to see if sample/first letter is a vowel
            System.out.println("Whoa! The first letter happens to be a vowel!");    //if so print this message
        }   
    }


    //Generate and return an array with 10 random numbers between 55-100.
    //To get a random integer, you can use the nextInt method of the Random class. Random Class documentation
    public void randNumber() {          //create a method called randNumber
        ArrayList<Integer> randNums = new ArrayList<Integer>();     //create a arraylist of integers named randNums
        for(int i = 0; i < 10; i++){            //create a loop, that will only loop 10 times in order to generate 10 random numbers
            int num = ThreadLocalRandom.current().nextInt(55, 101); //set variable num to the randomly generated number. nextInt chooses a random number between the specified origin which is 55-101, ThreadLocalRandom is from the random class and is a random number generator
            randNums.add(num);          //adds randomly generated number to randNums
        }
        System.out.println(randNums);   //print out our arraylist of random integers
    }


    //Generate and return an array with 10 random numbers between 55-100 and have it be sorted (showing the smallest number in the beginning). Display all the numbers in the array. Next, display the minimum value in the array as well as the maximum value.
    //To sort a collection, you can use the sort method of the Collections class.
    public void sortedRandNumber(){
        ArrayList<Integer> randNums2 = new ArrayList<Integer>();
        int min = 101;
        int max = 55;
        for(int i = 0; i < 10; i++){
            int num2 = ThreadLocalRandom.current().nextInt(55, 101);
            randNums2.add(num2);
            if(num2 < min){
                min = num2;
            }
            if(num2 > max){
                max= num2;
            }
        }
        Collections.sort(randNums2);
        System.out.println(randNums2);
        System.out.println("Smallest randomized number is: " + min);
        System.out.println("Largest randomized number is: " + max);
    }


    //Create a random string that is 5 characters long.
    public void randomString(){
        Random rand = new Random();
        StringBuilder randString = new StringBuilder();
        String alphaNumeric = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        for(int i = 0; i < 5; i++){
            randString.append(alphaNumeric.charAt(rand.nextInt(alphaNumeric.length())));
        }
        String finalString = randString.toString();
        System.out.println(finalString);
    }


    //Generate an array with 10 random strings that are each 5 characters long
    public void randomStringOfStrings(){
        Random rand = new Random();
        StringBuilder randString = new StringBuilder();
        ArrayList<String> randList = new ArrayList<String>();
        String alphaNumeric = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        for(int i = 0; i <10; i++){
            for(int j = 0; j < 5; j++){
                randString.append(alphaNumeric.charAt(rand.nextInt(alphaNumeric.length())));
            }
            String finalString = randString.toString();
            randList.add(finalString);
            randString.setLength(0);
        }
        System.out.println(randList);
    }
}
