package shopsphere.backend.dto.user;

import shopsphere.backend.entity.User;
import shopsphere.backend.enums.UserRole;
import shopsphere.backend.enums.UserStatus;

import java.util.UUID;

public record UserResponse(
        UUID userId,
        String name,
        String email,
        String mobileNumber,
        UserRole role,
        UserStatus status
) {
    public static UserResponse from(User user) {
        return new UserResponse(
                user.getUserId(),
                user.getName(),
                user.getEmail(),
                user.getMobileNumber(),
                user.getRole(),
                user.getStatus()
        );
    }
}
