package Strings;

public class MaximumNumberofWordsFoundinSentences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sentence [] = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
		
		System.out.println(mostWordsFound(sentence));
	}
public static int mostWordsFound(String[] sentences) {
        
	    int maxlength = Integer.MIN_VALUE;

        for(int i=0; i<sentences.length; i++){

           String sentence = sentences[i];
           String words[] = sentence.split(" ");
           maxlength = Math.max(maxlength,words.length);
        }
        return maxlength;
    }
}
