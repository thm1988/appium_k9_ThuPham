package lession_09_02;

public class InternalLoginPage extends LoginPage{
    @Override
    protected String usernameLocator() {
        return "Internal Login Page | usernameLocator()";
    }

    @Override
    protected String passwordLocator() {
        return "Internal Login Page | passwordLocator()";
    }

    @Override
    protected String loginButtonLocator() {
        return "Internal Login Page | loginButtonLocator()";
    }
}
