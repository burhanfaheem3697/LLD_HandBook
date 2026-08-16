/**
 * Address
 */
public record Address(String city, String zipCode, String street) {
    public Address{
        if(city == null || city.isBlank()){
            throw new IllegalArgumentException("City is required");
        }

        if(zipCode == null || zipCode.trim().isEmpty()){
            throw new IllegalArgumentException("Zip Code is required");
        }

        if(street == null || street.trim().isEmpty()){
            throw new IllegalArgumentException("Street is required");
        }
    }
}