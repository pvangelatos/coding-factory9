package gr.aueb.cf.cf9.review.challenges;

/**
 * Από ένα σημείο χ, να πάει σε ένα σημείο y
 * όπου κάθε απόσταση είναι jump.
 * Έστω ότι χ = 10
 * y = 55
 * jump = 25
 */
public class FrogJumps {

    public static void main(String[] args) {

    }

    public static int frogJumps(int start, int end, int jumps){
        return (int) Math.ceil((end - start) / (double) jumps);
    }
}
