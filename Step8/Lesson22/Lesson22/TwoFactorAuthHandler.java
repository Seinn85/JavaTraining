package Lesson22;

public class TwoFactorAuthHandler extends AuthenticationHandler {
    @Override
    public void handle(LoginRequest request) {
        if (request.isAdmin()) {
            if (!request.isTwoFactorValid()) {
                System.out.println("Two-Factor Authentication check failed.");
                System.out.println("Access denied: 2FA verification required.");
                return;
            }
            System.out.println("Two-Factor Authentication check passed.");
        } else {
            System.out.println("Two-Factor Authentication check skipped.");
        }
        super.handle(request);
    }
}