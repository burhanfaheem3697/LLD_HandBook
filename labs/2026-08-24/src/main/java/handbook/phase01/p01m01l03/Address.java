package handbook.phase01.p01m01l03;

/**
 * Address
 */
public record Address(String street, String zipCode, String city) {

    public Address{
        if(street == null || street.isBlank()){
            throw new IllegalArgumentException("Street is required");
        }

        if(zipCode == null || zipCode.isBlank()){
            throw new IllegalArgumentException("Zip Code is required");
        }

        if(city == null || city.isBlank()){
            throw new IllegalArgumentException("City is required");
        }
    }
}