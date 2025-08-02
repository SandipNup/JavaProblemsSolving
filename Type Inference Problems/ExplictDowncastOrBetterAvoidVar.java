public class ExplictDowncastOrBetterAvoidVar {

    public static void main(String[] args) {
        byte byteNumber = 25;
        short shortNumber = 1463;

        // since in java no literals are available fir byte and short

        var byteNumber1 = (byte) 10;
        var shortNumber1 = (short) 1234;


    }
}
