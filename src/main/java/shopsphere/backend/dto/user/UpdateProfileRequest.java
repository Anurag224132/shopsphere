package shopsphere.backend.dto.user;

import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public record UpdateProfileRequest(

        @Size(min = 1, max = 120, message = "Name must be between 1 and 120 characters")
        String name,

        @Pattern(regexp = "^\\+?[0-9]{10,15}$", message = "Mobile number must be a valid phone number")
        String mobileNumber

) {
}
