package miniprojectQA1;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileWriter;
import java.io.IOException;
import java.time.Duration;

public class PerplexityTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.addArguments("--start-maximized");
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});

        WebDriver driver = new ChromeDriver(options);

        try {
            driver.get("https://www.perplexity.ai");

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));

            // Tunggu sampai kotak input chat tersedia
            WebElement chatBox;
            try {
                chatBox = wait.until(ExpectedConditions.elementToBeClickable(By.tagName("textarea")));
            } catch (TimeoutException e) {
                chatBox = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div[contenteditable='true']")));
            }


            String question = "What is artificial intelligence?";
            chatBox.sendKeys(question);
            chatBox.sendKeys(Keys.ENTER);
            System.out.println("Pertanyaan dikirim: " + question);

            // 🔁 Tunggu elemen jawaban muncul (class `.prose` atau `.whitespace-pre-line`)
            WebElement answer = null;
            try {
                answer = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".prose")));
            } catch (TimeoutException e1) {
                try {
                    answer = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".whitespace-pre-line")));
                } catch (TimeoutException e2) {
                    System.out.println("Tidak menemukan elemen jawaban di halaman.");
                }
            }

            if (answer != null) {
                // Tunggu beberapa detik agar jawaban selesai dimuat
                Thread.sleep(6000);

                String responseText = answer.getText();
                System.out.println("Jawaban berhasil diambil!\n");
                System.out.println(responseText);

                // Simpan jawaban ke file
                saveToFile(question, responseText);

            } else {
                System.out.println("Tidak ada jawaban yang bisa diambil.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
            System.out.println("Test selesai.");
        }
    }

    // ✨ Method untuk menyimpan hasil ke file
    private static void saveToFile(String question, String answerText) {
        try (FileWriter writer = new FileWriter("answer.txt", false)) { // false = overwrite file lama
            writer.write("Question:\n" + question + "\n\n");
            writer.write("Answer:\n" + answerText + "\n");
            System.out.println("Jawaban disimpan ke file: answer.txt");
        } catch (IOException e) {
            System.out.println("Gagal menyimpan file: " + e.getMessage());
        }
    }
}
