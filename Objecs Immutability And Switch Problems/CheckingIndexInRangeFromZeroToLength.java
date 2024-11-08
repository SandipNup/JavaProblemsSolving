import java.util.Objects;

public class CheckingIndexInRangeFromZeroToLength {
    private static final int X_UPPER_BOUND = 11;
    private static final int Y_UPPER_BOUND = 16;
    private int x;

    public CheckingIndexInRangeFromZeroToLength(int x){
        if(x < 0 || x > X_UPPER_BOUND){
            throw new  IndexOutOfBoundsException("X exceeds limit");
        }
        this.x = x;
    }

    public void CheckingIndexInRangeFromZeroToLength1(int x){
        this.x = Objects.checkIndex(x, X_UPPER_BOUND);
    }

    public int xMinusY(int y){
        if(y<0 || y >= x){
            throw new IndexOutOfBoundsException("Y exceeds limit");
        }
        return x-y;
    }

    public int xMinusY1(int y){
        Objects.checkIndex(y,x);
        return x-y;
    }

    public int oneMinusY(int y){
        if(y<0 || y >= Y_UPPER_BOUND){
            throw new IndexOutOfBoundsException("Y exceeds limit");
        }
        return 1-y;
    }

    public int oneMinusY1(int y){
        Objects.checkIndex(y, Y_UPPER_BOUND);
        return 1-y;
    }

}
