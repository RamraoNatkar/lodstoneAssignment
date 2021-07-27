package pageRepos;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AjioPage {
	WebDriver driver;
	@FindBy(xpath="//input[contains(@class,'react')]")
			WebElement searchBox;
	@FindBy(xpath="//span[@class='ic-search']")
	WebElement searchBtn;
	@FindBy(xpath="//div[@class='contentHolder']")
	List<WebElement> elements1;
	@FindBy(xpath="//div[@class='contentHolder']//span[@class='orginal-price']")
	List<WebElement> oriPrice;
	
	public AjioPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void searchItem(String item) {
		searchBox.sendKeys(item);
	}
	public void clickOnSearch() {
		searchBtn.click();
	}
	public void getProductDetails() {
		List<WebElement> firstSix=elements1.subList(0, 6);
		Iterator<WebElement> itr=firstSix.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next().getText());
			
		}
	}
	public String getHighestprice() {

		
	   List<WebElement> originalPricefirstSix=oriPrice.subList(0, 6);
	   Iterator<WebElement> itr1=originalPricefirstSix.iterator();
	   String arr[]=new String[6];
	   int i=0;
		while(itr1.hasNext()) {
			arr[i]=itr1.next().getText();
			i++;	
	
		}
		
		Arrays.sort(arr);
		System.out.println("");
		
		return arr[5];
	}
	
	
	

}
