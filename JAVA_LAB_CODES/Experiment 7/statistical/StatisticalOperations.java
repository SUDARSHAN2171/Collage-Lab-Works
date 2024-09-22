package statistical;

import java.util.Arrays;

public class StatisticalOperations {

    public double mean(double[] nums) {
        double sum = 0;
        for (double num : nums) {
            sum += num;
        }
        return sum / nums.length;
    }

    public double median(double[] nums) {
        Arrays.sort(nums);
        if (nums.length % 2 == 0) {
            return (nums[nums.length / 2 - 1] + nums[nums.length / 2]) / 2.0;
        } else {
            return nums[nums.length / 2];
        }
    }

    public double variance(double[] nums) {
        double mean = mean(nums);
        double sumSquaredDiffs = 0;
        for (double num : nums) {
            sumSquaredDiffs += Math.pow(num - mean, 2);
        }
        return sumSquaredDiffs / nums.length;
    }

    public double standardDeviation(double[] nums) {
        return Math.sqrt(variance(nums));
    }
}
