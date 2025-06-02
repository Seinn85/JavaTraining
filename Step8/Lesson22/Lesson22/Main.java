package Lesson22;

public class Main {
    public static void main(String[] args) {
        // チェーンの作成と接続
        AuthenticationHandler captcha = new CaptchaCheckHandler();
        AuthenticationHandler logging = new LoggingHandler();
        AuthenticationHandler username = new UsernameCheckHandler();
        AuthenticationHandler password = new PasswordLengthCheckHandler();
        AuthenticationHandler twoFA = new TwoFactorAuthHandler();
        AuthenticationHandler admin = new AdminCheckHandler();

        captcha.setNextHandler(logging);
        logging.setNextHandler(username);
        username.setNextHandler(password);
        password.setNextHandler(twoFA);
        twoFA.setNextHandler(admin);

        // テストケース 1: 管理者で全て成功
        System.out.println("=== Test Case 1: Admin (All valid) ===");
        LoginRequest req1 = new LoginRequest("Alice", "strongPass123", true, true, true);
        captcha.handle(req1);

        // テストケース 2: パスワードが短い
        System.out.println("\n=== Test Case 2: Short Password ===");
        LoginRequest req2 = new LoginRequest("Bob", "123", false, true, false);
        captcha.handle(req2);

        // テストケース 3: CAPTCHA 失敗
        System.out.println("\n=== Test Case 3: CAPTCHA invalid ===");
        LoginRequest req3 = new LoginRequest("Charlie", "validPass123", false, false, false);
        captcha.handle(req3);

        // テストケース 4: 管理者だが2FA失敗
        System.out.println("\n=== Test Case 4: Admin but 2FA invalid ===");
        LoginRequest req4 = new LoginRequest("Dave", "securePass456", true, true, false);
        captcha.handle(req4);
    }
}