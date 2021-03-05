package behavioral_patterns.chain_of_responsibility.middleware;

/**
 * ConcreteHandler. Checks a user's role.
 * 检查用户角色
 */
public class RoleCheckMiddleware extends Middleware {
    public boolean check(String email, String password) {
        if (email.equals("admin@example.com")) {
            System.out.println("Hello, admin!");
            return true;
        }
        System.out.println("Hello, user!");
        return checkNext(email, password);
    }
}