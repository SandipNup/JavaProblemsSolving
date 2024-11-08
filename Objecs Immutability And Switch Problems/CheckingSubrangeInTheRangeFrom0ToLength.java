import java.util.Objects;

public class CheckingSubrangeInTheRangeFrom0ToLength {

    // n must be between 0 (inclusive) and 101 (exclusive), so n belongs to [0, 101].
    // In the yMinusX() method, the range bounded by x and y, [x, y] must be a
    // subrange of [0, n]

    private static final int N_UPPER_BOUND = 101;
    private final int n;

    public CheckingSubrangeInTheRangeFrom0ToLength(int n){
//        if(n < 0 || n >= N_UPPER_BOUND){
//            throw new IndexOutOfBoundsException("N cannot be greater than 100");
//        }

        Objects.checkIndex(n,N_UPPER_BOUND);
        this.n = n;
    }

    public int yMinusX(int x, int y){
        if(x < 0 || x > y || y >= n){
            throw new IndexOutOfBoundsException("");
        }
        return y-x;
    }



    public int yMinusX1(int x, int y){
        Objects.checkFromToIndex(x, y,n);
        return y-x;
    }
}
