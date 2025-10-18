public class AppTest {
    public static void main(String[] args) {
        String output = "Hello, CI/CD from Java in Google Colab!";
        if (output.contains("Hello")) {
            System.out.println("✅ Test Passed!");
        } else {
            System.out.println("❌ Test Failed!");
        }
    }
}
