import javafx.beans.value.WritableValue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class Table {

    private WebElement tableElement;
    private WebDriver driver;

    public Table(WebElement tableElement, WebDriver driver){
        this.tableElement = tableElement;
        this.driver = driver;
    }

    public List<WebElement> getRows(){
        List<WebElement> rows = tableElement.findElements(By.xpath(".//tr"));
        rows.remove(0);
        return rows;
    }

    public List<WebElement> getHeadings(){
        WebElement headingsRows = tableElement.findElement(By.xpath(".//tr[1]"));
        List<WebElement> headingColumns = headingsRows.findElements(By.xpath(".//th"));
        return headingColumns;
    }

    public List<List<WebDriver>> getRowsWithColumns(){
        List<WebElement> rows = getRows();
        List<List<WebElement>> rowsWithColumns = new ArrayList<List<WebElement>>();
        for (WebElement row : rows){
            List<WebElement> rowWithColumns = row.findElement(By.xpath(".//td"));
            rowsWithColumns.add(rowWithColumns);

        }
        return rowsWithColumns;
    }
}
