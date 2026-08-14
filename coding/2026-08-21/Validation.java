import java.util.Objects;

/**
 * Validation
 */
public class Validation {
    private int requested;

    public void validateQuantity(int requested, int available){
        if(requested > available){
            throw new IllegalStateException("Request can't be more than available");
        }

        this.requested = Objects.requireNonNull(requested,"");


    }
}