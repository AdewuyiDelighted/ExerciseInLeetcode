package leetcodeSpecial;

public class BoatToSavePeople {
    public static void main(String[] args) {
        int [] array = {9,2,5,7,8,4};
        sortArray(array,6);
    }

    public static int getTheNumberOfBoat(int[] people, int limit) {
        int noOfBoatUsed = 0;
        int count = 0;
        for (int index = 0; index < people.length; index++) {


        }
        return 0;
    }
    private static void sortArray(int[] people, int n){
        if(n == 1)return;
        for(int index = 0; index < n-1;index++){
            if(people[index] > people[index+1]){
                people[index] = people[index] + people[index+1];
                people[index + 1] = people[index] - people[index+1];
                people[index] = people[index] - people[index+1];
            }
        }
        sortArray(people,n-1);
    }
}
