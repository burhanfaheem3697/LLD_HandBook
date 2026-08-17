package handbook.phase01.project01.internal;

/**
 * Address
 */
public record Address(String street, String city, String zipCode) {

    public Address{
        if(street == null || street.isBlank()){
            throw new IllegalArgumentException("Street is required");
        }

        if(city == null || city.isBlank()){
            throw new IllegalArgumentException("City is required");
        }

        if(zipCode == null || zipCode.isBlank()){
            throw new IllegalArgumentException("Zip Code is required");
        }
    }
}