package com.lti;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.List;
import java.util.ListIterator;
public class WebTable {
    public static void main(String[] args) {
        String url = "https://letzautomate.github.io/samples/eCommerce.html";
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get(url);
        List<WebElement> tblRow= driver.findElements(By.xpath("//*[@id=\"productTable\"]/tbody/tr"));
        System.out.println("Total Rows"+tblRow.size());

        //String val1= "xyz789hijk";
        int reqRow= 0;
        List<WebElement> trReqVal= null;
        for (int i =0; i<tblRow.size(); i++){

            List<WebElement> tdVal= driver.findElements(By.xpath("//*[@id=\"productTable\"]/tbody/tr["+i+"]/td"));
            ListIterator<WebElement> lit = tdVal.listIterator();
            while(lit.hasNext()){
                String text = lit.next().getText().trim();
                if(text.startsWith("xy")){
                 reqRow=i;
                 System.out.println("Row Count is :" +reqRow);
                 trReqVal= driver.findElements(By.xpath("//*[@id=\"productTable\"]/tbody/tr["+reqRow+"]/td"));
                 System.out.println(trReqVal.size());
                 for( WebElement elm  :trReqVal){
                        System.out.print(elm.getText()+" ");
                    }
                }

            }

        }

    }


}
