package leet_code;

public class EliminateNumberOfMonster {

    public static int eliminateMaximum(int[] distance, int[] speed) {
        int value = 1;
        int[] time = new int[distance.length];
        for (int count = 0; count < distance.length; count++){
            time[count] = distance[count] / speed[count];
        }
            for (int dists = 0; dists < time.length; dists++) {
                 if (time[dists] != 0){
                    time[dists] = 0;
                    minusDistance(time, dists);
                }else {
                     return value;
                 }if (dists > 0) value++;
            }
        return value;
    }

    private static void minusDistance(int[] time, int dists) {
        for (int count = dists + 1; count < time.length; count++){
            time[count] -= 1;
        }
    }
}
