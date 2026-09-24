package shopsphere.backend.dto.user;

public record AuthResponse(
        String accessToken,
        String tokenType,   // always "Bearer"
        long expiresIn
) {
    public static AuthResponse bearer(String accessToken, long expiresInSeconds) {
        return new AuthResponse(accessToken, "Bearer", expiresInSeconds);
    }
}
