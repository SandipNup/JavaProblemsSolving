import java.util.Random;

interface Weighter2 {
    float getMarginOfError();
}

public class LVTICanBeFinalAndEffectivelyFinal {
    public static float fetchRatio(){
        final float limit = new Random().nextInt();
        final float bmi = 0.00023f;

//        limit = 0.002f; // this reassignment will cause error
//        bmi = 0.25f; // this reassignment will casue eeor

        return limit * bmi / 100.12f;
    }

    public static void main(String[] args) {
        var ratio = fetchRatio();

        var weighter = new Weighter2(){
            public float getMarginOfError() {
                return ratio * 5;

            }

            // if anonymous class or lambda function is using the variable that is defined outside of the scope
            // they require those variable to be final or effectively final.
            // effectively final means variable that are not decleared as final but has never been reassigned
            // compiler treat those variable as final variable
        };

//        ratio = fetchRatio();   // If you comment this part the code will work fine

    }
}
