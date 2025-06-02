package Lesson22;

public class LoginRequest {
    private String username;
    private String password;
    private boolean isAdmin;
    private boolean captchaValid;
    private boolean twoFactorValid;

    public LoginRequest(String username, String password, boolean isAdmin, boolean captchaValid, boolean twoFactorValid) {
        this.username = username;
        this.password = password;
        this.isAdmin = isAdmin;
        this.captchaValid = captchaValid;
        this.twoFactorValid = twoFactorValid;
    }

    public String getUsername() { 
        return username; 
    }
    public String getPassword() { 
        return password; 
    }
    public boolean isAdmin() { 
        return isAdmin; 
    }
    public boolean isCaptchaValid() { 
        return captchaValid; 
    }
    public boolean isTwoFactorValid() { 
        return twoFactorValid; 
    }
}