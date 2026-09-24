package shopsphere.backend.dto.user;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public record RegisterRequest(

        @NotBlank(message = "Name is required")
        @Size(min = 1, max = 120, message = "Name must be between 1 and 120 characters")
        String name,

        @NotBlank(message = "Email is required")
        @Email(message = "Email must be a valid email address")
        @Size(max = 255, message = "Email must not exceed 255 characters")
        String email,

        @NotBlank(message = "Password is required")
        // >= 8 chars per design.md §11. Upper bound of 72 BYTES is a BCrypt
        // limitation, not a business rule — BCrypt silently truncates longer
        // input, so we reject it explicitly instead of accepting and truncating.
        @Size(min = 8, max = 72, message = "Password must be between 8 and 72 characters")
        String password,

        @NotBlank(message = "Mobile number is required")
        // E.164-ish: optional leading +, 10-15 digits. Matches design.md §11.
        @Pattern(regexp = "^\\+?[0-9]{10,15}$", message = "Mobile number must be a valid phone number")
        String mobileNumber

) {
}

