package com.clearfaun.playing.around;

public class Main {

    public static void main(String[] args) {
	// write your code here


        //Recursion: A child is running up a staircase with n steps and can
        // hopeither 1 step , 2 steps, or three steps at a time. implement
        // a method to count how many posible ways the child can run up the stairs.

        System.out.println(howManySteps(4));
    }

    static int count = 0;

    public static int howManySteps(int stepsLength){



        if(stepsLength == 0){
            return count;
        }else{

            if(stepsLength >= 3){
                stepsLength -=1;
                count += 4;
                return howManySteps(stepsLength);

            }else if(stepsLength >= 2){
                stepsLength -=1;
                count+= 2;
                return howManySteps(stepsLength);
            }else{
                stepsLength -=1;
                count++;
                return howManySteps(stepsLength);
            }


        }


    }
}
