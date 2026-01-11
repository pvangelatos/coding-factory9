package gr.aueb.cf.cf9.review_challenges;

public class PlayerRecords {

    public static int[] records(int[] points) {
        int minPoints = points[0];
        int maxPoints = points[0];
        int minCount = 0;
        int maxCount = 0;


        for (int i = 1; i < points.length ; i++) {

            int p = points[i];
            if (p > maxPoints) {
                maxPoints = points[i];
                maxCount++;
            }
            if (p < minPoints) {
                minPoints = points[i];
                minCount++;
            }
        }
        int[] results = {maxCount, minCount};
        return results;
    }
}
