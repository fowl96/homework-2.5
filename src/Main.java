public class Main {

    private static final String REGEX = "^[a-zA-Z0-9_]*$";

    public static void main(String[] args) {

        try {
            chekAuth("artem", "0110", "0110");
            System.out.println("Регистрация пройдена");
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println("Регистрация не пройдена");;
        }

    }
    private static void chekAuth (String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException{
        if (!login.matches(REGEX) || login.length() > 20) {
            throw new WrongLoginException();

        }
        if (!password.matches(REGEX) || password.length() > 20 || !password.equals(confirmPassword)) {
            throw new WrongPasswordException();

        }
    }
}