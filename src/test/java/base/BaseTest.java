package base;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import java.io.*;

public class BaseTest {
    protected WebDriver driver;

    @BeforeClass
    @Step("Start WebSite session")
    public void setup() {
        driver = new ChromeDriver();
        // Navigate to a website
        driver.get("https://subscribe.stctv.com");
        //Mazimize current window
        driver.manage().window().maximize();
    }

    @Step("Terminate the session")
    @AfterClass
    public void terminate() {
        driver.quit();

    }

    public static void main(String[] args) {
        try {
            ProcessBuilder builder = new ProcessBuilder("mvn allure:serve");
            Process process = builder.start();

            // Read output
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            // Wait for the command to finish.
            int exitCode = process.waitFor();
            System.out.println("Exited with code : " + exitCode);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}

