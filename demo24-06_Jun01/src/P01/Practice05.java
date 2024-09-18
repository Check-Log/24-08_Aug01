package P01;

public class Practice05 {

    public void run(){
        //https://www.codewars.com/kata/57fb09ef2b5314a8a90001ed
        //for entire length of s
        // for each sequential value of s
        //for value of codex aeouiAEIOU string,
        //if current x = value
        //if yes, make s[5] = exclamation-mark

        //String s = "It was the best of times, it was the blurst of times.";
        //String s2 = "It was the best of times, it was the blurst of times.";
        String s = "aeiou";


        String s2= s;
        String codex = "aeiouAEIOU";
        for(int x=0; x<s.length(); x++){
            for(int y=0; y < codex.length(); y++){
                if(s.charAt(x) == codex.charAt(y)){
                    s2 = s2.replaceAll(String.valueOf(codex.charAt(y)), "!");
                }
            }
        }

        System.out.println("Sentence was: " + s);
        System.out.println("Sentence is now: " + s2);
    }

}