import java.util.Objects;

/**
 * ObjectHash
 */
public class ObjectHash {
    private final String walletId;

    public ObjectHash(String walletId){
        this.walletId = walletId;
    }

    @Override 
    public int hashCode(){
        return Objects.hash(walletId);
    }
}