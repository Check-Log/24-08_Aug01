package P01;

public class Practical07 {

    //https://www.codewars.com/kata/574c51aa3e4ea6de22001363
    public void run(){

        /*
        employees have an algorithm to make first name recognition faster.
        they can now quickly detect if a string is a first name,
        no matter if it is a one-word name or a hyphenated name.
        See given documentation with the algorithm:
        In France, there are people with hyphenated first names called "prénoms composés".
        There could be two, or even more words linked to form a new name, (like jQuery function)
        They're linked using the - symbol, like Marie-Joelle, Jean-Michel, Jean-Mouloud.
        Thanks to this algorithm, you can now recognize hyphenated names quickly.

        Recreate the algorithm by Using the function showMe, which takes a yourID argument,
        it checks if the given argument is a name or not, by returning true or false.

        Note:
        String will either be a one-word first name, or a hyphenated first name , its words being linked by "-".
        Words can only start with an uppercase letter, and then lowercase letters (from a to z)
         */

        /*
        Take yourId
        if one word (detect no space)
        then true
        else if more than 1 word (detect space)
        then false
        else if prenom compose (detect a hyphen)
        then true


        check if detect hyphen between words n & n+1
        increment n
        check if hyphen between words n & n+1

         */



    }

    public boolean showMe(String yourID) {



        return true;
    }




}
