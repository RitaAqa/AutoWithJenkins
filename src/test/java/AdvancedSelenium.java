import base.BaseTest;

public class AdvancedSelenium extends BaseTest {

 /*   @Test
    public void testDropdown() {
        driver.get("https://the-internet.herokuapp.com/dropdown");
        Select select = new Select(driver.findElement(By.id("dropdown")));
        select.selectByIndex(1);
        System.out.println("");
    }

    @Test
    public void testWebTables() {
        driver.get("https://the-internet.herokuapp.com/tables");
        String webTableLocator = "//table[@id='table1']/tbody[1]/tr/td[%s]";
        By locator = By.xpath(String.format(webTableLocator, 4));
        System.out.println("");
    }


    @Test
    public void testIFrames() {
        driver.get("https://the-internet.herokuapp.com/iframe");

        driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='mce_0_ifr']")));
        driver.findElement(By.xpath("//*[@id='tinymce']")).sendKeys("dsss");
        driver.switchTo().defaultContent();
        System.out.println("");
    }

    @Test
    public void testFileUpload() {
        driver.get("https://the-internet.herokuapp.com/upload");
        WebElement uploadElement = driver.findElement((By.xpath("//*[@id='file-upload']")));

        uploadElement.sendKeys("/home/lymos/Pictures/1.png");
        System.out.println("");
    }

    @Test
    public void testBasicAuth() {
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

        System.out.println("");
    }

    @Test
    public void testActionsDragAndDrop() {
        //Action class
        driver.get("https://the-internet.herokuapp.com/drag_and_drop");
        Actions actions = new Actions(driver);
        WebElement elem1 = driver.findElement(By.id("column-a"));
        WebElement elem2 = driver.findElement(By.id("column-b"));
        actions.dragAndDrop(elem1, elem2).release().build().perform();
        System.out.println("");

    }

    @Test
    public void testActionsHovers() {
        //Action class
        driver.get("https://the-internet.herokuapp.com/hovers");
        Actions actions = new Actions(driver);
        WebElement elem1 = driver.findElement(By.xpath("(//div[@class='figure']/img)[1]"));
        actions.moveToElement(elem1);
        System.out.println("");
    }*/
}
