import java.math.BigDecimal;
import java.math.BigInteger;

class Grains {

    private static final int NUMBER_OF_SQUARES_CHESSBOARD = 64;

    BigInteger grainsOnSquare(final int square) {
        if (square <= 0 || square > 64) {
            throw new IllegalArgumentException("square must be between 1 and 64");
        }
        BigInteger bigInt = BigInteger.TWO;
        return bigInt.pow(square - 1);
    }

    BigInteger grainsOnBoard() {
        BigInteger bigInt = BigInteger.TWO;
        bigInt = bigInt.pow(NUMBER_OF_SQUARES_CHESSBOARD);
        return bigInt.subtract(BigInteger.ONE);
    }

}
