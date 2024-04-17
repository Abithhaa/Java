import java.util.Scanner;


class AuthenticationException extends Exception {
    public AuthenticationException(String message) {
        super(message);
    }
}


class UserAuthentication {
    
    public void authenticate(String username, String password) throws AuthenticationException {
        String validUsername = "admin";
        String validPassword = "password123";
        
        if (!username.equals(validUsername) || !password.equals(validPassword)) {
            throw new AuthenticationException("Invalid username or password");
        }
        System.out.println("Authentication successful!");
    }
}


class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserAuthentication auth = new UserAuthentication();

        try {
            
            System.out.print("Enter username: ");
            String username = scanner.nextLine();

            
            System.out.print("Enter password: ");
            String password = scanner.nextLine();

            
            auth.authenticate(username, password);
        } catch (AuthenticationException e) {
            System.out.println("Authentication failed: " + e.getMessage());
        } finally {
            
            scanner.close();
        }
    }
}
