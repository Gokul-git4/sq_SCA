public class HardcodedSecretsExample {
    // Hardcoded password (Bad Practice)
    private static final String DB_USERNAME = "admin";
    private static final String DB_PASSWORD = "P@ssw0rd123"; // Vulnerability: Hardcoded password

    // Hardcoded API Key (Bad Practice)
    private static final String API_KEY = "sk_test_4eC39HqLyjWDarjtT1zdp7dc"; // Vulnerability: Hardcoded API key

    public static void main(String[] args) {
        // Hardcoded credentials usage
        connectToDatabase(DB_USERNAME, DB_PASSWORD);
        makeApiRequest(API_KEY);
    }

    public static void connectToDatabase(String username, String password) {
        System.out.println("Connecting to DB with user: " + username);
        // Insecure use of credentials
    }

    public static void makeApiRequest(String apiKey) {
        System.out.println("Making API request using key: " + apiKey);
        // Insecure use of API key
    }
}
