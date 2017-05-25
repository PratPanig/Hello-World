import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.remote.MobileCapabilityType;

public class Login {
	static Logger log = LogManager.getLogger(Login.class.getName());
    public String uname[];
    public String pwd[];
    public String[] Userdetails;
    public int numberOfRows;
    public int numberOfUsers;
    
        @BeforeClass 
        public static void setup()
        {
        	ConsoleAppender consoleAppender = new ConsoleAppender(new SimpleLayout());
        	log.addAppender(consoleAppender);
        	consoleAppender.activateOptions();
            log.info("inside before");
        }

        @SuppressWarnings("deprecation")
        @Test
         public void test() throws InterruptedException, IOException,MalformedURLException
        {
            log.info("inside test");
        
            log.info("Call for getTestData");
            Login login = new Login();
            login.getTestData();
            log.info(" getTestData Called");
            for(int i=1;i<=login.numberOfUsers;i++)
            {
             //For Firefox
             //  System.setProperty("webdriver.gecko.driver", "D://geckodriver.exe");
             //  WebDriver driver = new FirefoxDriver();
             
            //For Chrome
                //System.setProperty("webdriver.chrome.driver", "D:/Projects/chromedriver.exe");
                //WebDriver driver = new ChromeDriver();
                
            //For Android
                DesiredCapabilities capabilities = DesiredCapabilities.android();
                		capabilities.setCapability("platformName","Android");
                		capabilities.setCapability(MobileCapabilityType.VERSION, "6.0.1");
                		capabilities.setCapability("androidDeviceSerial", "NJ0AA10033");
                		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "NJ0AA10033");
                		capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
                		ChromeOptions options = new ChromeOptions();
                				options.addArguments("--disable-translate");
                				capabilities.setCapability(ChromeOptions.CAPABILITY, options);
                				WebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.130:4723/wd/hub"), capabilities);
                
                
                			
                //driver.manage().window().maximize();

                driver.get("https://www.flipkart.com");
                driver.findElement(By.xpath(".//*[@id='container']/div/header/div[1]/div[1]/div/ul/li[9]/a")).click();
                log.info("Login Link clicked ");
                 Thread.sleep(2000);
                 log.info("Send data to website - " + login.uname[i] + " " + login.pwd[i] );
                 driver.findElement(By.xpath("html/body/div[3]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys(login.uname[i]);
                 driver.findElement(By.xpath("html/body/div[3]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys(login.pwd[i]);
                 Thread.sleep(5000);
                 driver.findElement(By.xpath("html/body/div[3]/div/div/div/div/div[2]/div/form/div[3]/button")).click();
                 Thread.sleep(10000);
                
                 try{
                 Assert.assertEquals("My Account", driver.findElement(By.xpath(".//*[@id='container']/div/header/div[1]/div[1]/div/ul/li[8]/a")).getText());
             
                 //Assert.assertEquals("My Account", driver.findElement(By.xpath(".//*[@id='container']/div/header/div[1]/div[1]/div/ul/li[8]/a")).getText())
                 //assertTrue("Verification Failed: User Not logged in", driver.findElement(By.xpath("html/body/div[3]/div/div/div/div/div[2]/div/form/div[1]/span[2]/span/span")).isDisplayed()); 
                 log.info(driver.findElement(By.xpath(".//*[@id='container']/div/header/div[1]/div[1]/div/ul/li[8]/a")).getText() + "  User is logged in");
                 driver.findElement(By.xpath(".//*[@id='container']/div/header/div[1]/div[1]/div/ul/li[8]/a")).click();
                 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
                 driver.findElement(By.xpath(".//*[@id='fk-mainbody-id']/div/div[2]/div[1]/div[2]/div[2]/a")).click();
                 Thread.sleep(5000);
                 }
                 catch(AssertionError e){
                	 WebElement errorMessage = driver.findElement(By.xpath("//span[contains(text(),'Enter Email')]/ancestor::label/following-sibling::span"));
                	 log.error("Login failed due to "+errorMessage.getText());
                	 Assert.fail("Login failed due to "+errorMessage.getText());}
                 finally{
                 driver.close();
                 log.info("Thread closed");}
         }
        }

        public void getTestData() throws IOException, InterruptedException
        {

            numberOfRows = 4;
            numberOfUsers= numberOfRows-1;
            log.info("Number of users"+ numberOfUsers);
            String File_Path="D:/Projects/login.csv";
            String line = "";
            BufferedReader br = null;
            
            uname= new String[numberOfRows];
            pwd= new String[numberOfRows];
            
            try {
                   br = new BufferedReader(new FileReader(File_Path));
                   int i=0;
                   while ((line = br.readLine()) != null) {

                       String[] Userdetails = line.replace("\"","").split(","); //
                       log.info(Userdetails[0] + " " + Userdetails[1]);
                       uname[i]=Userdetails[0].trim();
                       pwd[i]=Userdetails[1].trim();
                       i++;

                   }
               } catch (FileNotFoundException e) {
                   e.printStackTrace();
               } catch (IOException e) {
                   e.printStackTrace();
               } finally {
                   if (br != null) {
                       try {
                           br.close();
                       } catch (IOException e) {
                           e.printStackTrace();
                       }
                   }
               }

        }

         @AfterClass
         public static void logout()
         {
         log.info("Logout Successful");
         }

    }