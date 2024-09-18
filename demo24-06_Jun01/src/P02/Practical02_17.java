package P02;

public class Practical02_17 {
    public void run() {
        //https://www.codewars.com/kata/598106cb34e205e074000031
        //String town = "~0~0~0~0";
        //String town = "P 0~ 0~ ~0 0~";//1
        //String town = "~O~O~O~OP~O~OO~"; //2 deaf rats (14 spaces)
        String town = "~O~O0~~O~OP~O~OO~"; //3 deaf rats (14 spaces)


        System.out.println("Given town: " + town + ". Output is: " + countDeafRats(town));


    }

    public static int countDeafRats(String town)
    {


        //iterate through string
        //detect piper position, create variable piper-pos
        //iterate through string again
        //detect next mouse
        //if mouse in one direction
        //detect mouse direction relative to piper
        //if mouse in other direction,
        //detect mouse direction relative to piper
        //in either case increment count
        //so why isn't the below working???

        //iteration technique was correct
        //incorrect brackets placenent
        //unconnected logic statements
        //minimum logic path (didn't jump to next loop after y++) use continue method to run next iteration
        //using indexof instead of charat (read javadoc for uncertain methods)
        //more sub function use; use separate left and right methods for string reading
        //syntax miss (0 and O)

        //charAt
        //suse substring


        String town2 = town;
        int piperPos = 0;
        int normalRat = 0;
        int deafRat = 0;
        for (int x = 0; x < town.length(); x++) {
            if (town.charAt(x) == 'P') {
                piperPos = x;
            }
        }

        for (int y = 0; y < town.length(); y++) { //
            if (y == 8) {
                System.out.println("y equals");
            }
            if (town2.charAt(y) == '~')
            { //if first symbol
                if (town2.charAt(y + 1) == '0' || town2.charAt(y + 1) ==  'O') { //if second symbol
                    if (y > piperPos) {
                        deafRat++;
                        if (y + 1 == town2.length()) {
                            break;
                        } else y++;
                    } else {
                        normalRat++;
                        if (y + 1 == town2.length()) {
                            break;
                        } else {
                            y++;
                            continue; //goes to next for-loop iteration (don't allow any other logic to run)
                        }
                    }
                }
            }
            else if (town2.charAt(y) == '0' || town2.charAt(y) ==  'O')
            { //if first symbol
                if (town2.charAt(y + 1) == '~')
                { //if second symbol (direction checked)
                    if (y < piperPos)
                    {
                        deafRat++;
                        if (y + 1 == town2.length()) {
                            break;
                        } else {
                            y++;
                            continue; //goes to next for-loop iteration (don't allow any other logic to run)
                        }
                    } else {
                        normalRat++;
                        if (y + 1 == town2.length()) {
                            break;
                        } else y++;
                    }
                }
            }
        }
        return deafRat;
    }
}