import java.util.Objects;

public final class EmailAddress {

    private final String email;

    public EmailAddress(String email) {
        if (email == null || email.trim().isEmpty() || !email.contains("@")) {
            throw new IllegalArgumentException("Invalid email address: " + email);
        }
        // Normalize (trim/lowercase) depending on domain needs
        this.email = email.trim();
    }

    public String getEmail() {
        return email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EmailAddress that)) return false;
        return Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email);
    }

    @Override
    public String toString() {
        return email;
    }
}