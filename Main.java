import java.io.File;
import java.util.Scanner;
import java.io.*;

public class Main

{
	public static void main(String[] args) throws FileNotFoundException {
	    File file = new File("movies.txt");
        Scanner scanFile = new Scanner(file);
        int p=0;
	    while(scanFile.hasNextLine()){
	        scanFile.nextLine();
	        p++;
	    }
	    int idx = (int)(Math.random()*p);
	    Scanner scanFileNew = new Scanner (file);
	    p=0;
	    String movie="";
	    while(scanFileNew.hasNextLine()){
	        if (p==idx){
	            movie = scanFileNew.nextLine();
	            break;
	        }
	        p++;
	    }
	    char [] movies = movie.toCharArray();
	    String ans="";
	    for (int i=0;i<movies.length;i++){
	        if (Character.isAlphabetic(movies[i])){
	            ans+="_";
	        }
	        else{
	            ans+=" ";
	        }
	    }
	    int wrong=0;
	    char guess[]=new char [45];
	    char wrongArray[]=new char [40];
	    String newAns="";
	    int index=0;
	    int wrongIndex=0;
	    Scanner scanText = new Scanner (System.in);
	    Game game = new Game();
	    while(!(ans.equals(movie))){
	  
	       System.out.println("You are guessing : "+ans);
	       System.out.println("You have guessed ("+wrong+") wrong letters :"+String.valueOf(wrongArray));
	       System.out.println("Guess a letter");
	       guess[index] = scanText.next().charAt(0);
	       newAns=game.showAnswer(guess[index],movies,ans);
	       if((ans.equals(newAns))){
	           wrong++;
	           if(wrong>1){
	               wrongArray[wrongIndex]=',';
	               wrongIndex++;
	           }
	           wrongArray[wrongIndex]=guess[index];
	           wrongIndex++;
	       }
	       index++;
	       ans=newAns;
	    }
	    System.out.println("Congrats! you guessed it right!!!");
	}
}

