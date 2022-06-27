package lession_09_02;

public class ExternalLoginPage extends LoginPage{
    @Override
    protected String usernameLocator() {
        return "External Login Page | usernameLocator()";
    }

    @Override
    protected String passwordLocator() {
        return "External Login Page | passwordLocator()";
    }

    @Override
    protected String loginButtonLocator() {
        return "External Login Page | loginButtonLocator()";
    }
}
