package behavioral_patterns.chain_of_responsibility.middleware;

import behavioral_patterns.chain_of_responsibility.server.Server;

/**
 * ConcreteHandler. Checks whether a user with the given credentials exists.
 * 检查用户登录信息
 */
public class UserExistsMiddleware extends Middleware {
    private Server server;

    public UserExistsMiddleware(Server server) {
        this.server = server;
    }

    public boolean check(String email, String password) {
        if (!server.hasEmail(email)) {
            System.out.println("This email is not registered!");
            return false;
        }
        if (!server.isValidPassword(email, password)) {
            System.out.println("Wrong password!");
            return false;
        }
        return checkNext(email, password);
    }
}