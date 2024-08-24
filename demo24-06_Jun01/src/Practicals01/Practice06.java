package Practicals01;

public class Practice06
{
    public void run() {
        //https://www.codewars.com/kata/65e2df8302b29a005831eace/train/javascript
        int playerHit;
        int l = 77;
        while (l > 0) {
            playerHit = hit(l);
            l -= playerHit;
            if (l <= 0) {
                System.out.println("l: " + l);
                break;
            }

        }
        System.out.println("l is now: " + l);
    }

    public int hit(int l){
        int x=0;
        //check if input is less than 6
        if(l>7)
        {
            x=1;
        }
        else if(l==7){
            //l=l-2;
            x= 2;
        }
        else if(l==6) {
            //l = l - 2;
            x= 2;
        }
        else if(l==5) {
            //l = l - 1;
            x= 1;
        }
        //else if (l == 4){ //ruled out?
        //    l =l-1;
        //}
        else if(l==3){
            //l=l-3;
            x= 3;
        }
        else{
            //l--;
            x= 1;
        }
        return x;
    }


    //the lowest value i need to account for is his greatest plus mine
    //which is 4 + 3 =7

    //then hit it with the minimal amount to avoid max opponent


}

/*
    if l <=6
    if(l-2==0 || l-3==0 \\)


 */

//always make is the biggest l possible for input
//The nail is length 20.
//We both subtract from it
//length is 3 after enemy's last turn
// so hammer() returns 3 for the last strike.




/*
starts at 20
I strike 3
17
he strikes 4
13
Is it less than 7 yet? No
I strike 3
10
he strikes 4
6
Is it less than 7 yet? Yes
I strike 1
5
He strikes 4
1
Is it less than his max? Yes
Is it less than my max 3? yes
My x is equal to length
I strike 1.
0
I win.
----------


6
Is it less than our combined max yet? Yes
I strike 1
5
He strikes 3
2
Is it less than my max3 ? yes
Hit l, l-times?







*/