package lesson4;

public class Statistics {
    public float average(int... nums) {
        int sum = 0;
        for (int x : nums) {
            // iterate int array nums
            sum += x;
        }
        return ((float) sum / nums.length);
    }
}
