package interfaces;

import static java.lang.System.*;

public interface IReseteable {
    public static void reset(){
        out.println();
    }

    default void reset() {

    }
}
