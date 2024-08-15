package DailyExerciseNew;

import java.util.ArrayList;

public class CountNumberOfTeams {
    public static void main(String[] args) {
        int [] rating = {2,5,3,4,1};
        System.out.println("rating "+countNumberOfTeam(rating));
    }
    public static int countNumberOfTeam(int[] rating) {
        int teamCount = 0;
        int greaterCount = 1;
        int lessCount = 0;
        for(int index = 0;index < rating.length;index++){
            for(int count = index +1;count < rating.length;count++){
                if(countGreaterElement(index,count,rating))greaterCount++;
                if(greaterCount == 3){teamCount ++;greaterCount=0;}
//                if(countLesserElement(index,count,rating))lessCount++;
//                if(greaterCount == 3)teamCount ++;continue;
            }
        }
        return teamCount;
    }

    private static boolean countGreaterElement(int currentValue,int comparison, int[] rating) {
        System.out.print(rating[comparison] +" ");
        System.out.print(rating[currentValue]+" ");
        System.out.print(rating[comparison+1]+ " ");
//        for(int index = currentValue+1;index < rating.length;index++){
        if(comparison+1 == rating.length){
            return rating[currentValue] < rating[comparison];
        }
        if(rating[comparison]  > rating[currentValue] && rating[comparison] < rating[comparison+1]){
//                5 2 3 3 5 4 4 3 1 1 4

                return true;
//            }
        }
        return false;
    }
    private static boolean countLesserElement(int currentValue,int comparison, int[] rating) {
        for(int index = currentValue+1;index < rating.length;index++){
            if(rating[currentValue]  > rating[comparison] && rating[comparison] > rating[index]){
                return true;
            }
        }
        return false;
    }


}
