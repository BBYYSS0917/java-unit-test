package junit4;

/**
 * @author Donquixote
 * @date 2023/03/14
 **/
public class PrimeNumberChecker {
    public Boolean validate(final Integer parimeNumber) {
        for (int i = 2; i < (parimeNumber / 2); i++) {
            if (parimeNumber % i == 0) {
                return false;
            }
        }
        return true;
    }
}
