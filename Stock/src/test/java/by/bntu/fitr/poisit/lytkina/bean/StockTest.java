package by.bntu.fitr.poisit.lytkina.bean;

import junit.framework.TestCase;

public class StockTest extends TestCase {

    public void testUpdatePriceCheckCurrentPrice() {
        Stock stock = new Stock("Google", 1000);
        stock.updatePrice(10);

        double expectd = 10;
        double actual = stock.getCurrentPrice();

        assertEquals(expectd, actual);
    }
    public void testUpdatePriceCheckNegativePrice() {
        Stock stock = new Stock("Google", 1000);
        stock.updatePrice(-50);

        double expectd = 1000;
        double actual = stock.getCurrentPrice();

        assertEquals(expectd, actual);
    }
    public void testUpdatePriceCheckBiggerPrice() {
        Stock stock = new Stock("Google", 1000);
        stock.updatePrice(2000);

        double expectd = 2000;
        double actual = stock.getMaxPrice();

        assertEquals(expectd, actual);
    }
    public void testUpdatePriceCheckLessPrice() {
        Stock stock = new Stock("Google", 1000);
        stock.updatePrice(300);

        double expectd = 300;
        double actual = stock.getCurrentPrice();

        assertEquals(expectd, actual);
    }
    public void testUpdatePriceCheckMinPrice() {
        Stock stock = new Stock("Google", 1000);
        stock.updatePrice(10);

        double expectd = 10;
        double actual = stock.getMinPrice();

        assertEquals(expectd, actual);
    }
    public void testUpdatePriceCheckMaxPrice() {
        Stock stock = new Stock("Google", 1000);
        stock.updatePrice(10);

        double expectd = 1000;
        double actual = stock.getMaxPrice();

        assertEquals(expectd, actual);
    }

    public void testGetCompanyName() {
        Stock stock = new Stock("Google", 1000);

        String expected = "Google";
        String actual = stock.getCompanyName();
        assertEquals(expected, actual);
    }

    public void testGetCurrentPrice() {
        Stock stock = new Stock("Google", 1000);

        double expected = 1000;
        double actual = stock.getCurrentPrice();
        assertEquals(expected, actual);
    }

    public void testGetMinPrice() {
        Stock stock = new Stock("Google", 1000);

        double expected = 1000;
        double actual = stock.getMinPrice();
        assertEquals(expected, actual);
    }

    public void testGetMaxPrice() {
        Stock stock = new Stock("Google", 1000);

        double expected = 1000;
        double actual = stock.getMaxPrice();
        assertEquals(expected, actual);
    }

    public void testTestEquals() {
        Stock firstStock = new Stock("Google", 1000);
        Stock secondStock = new Stock("Google", 1000);

        boolean expected = true;
        boolean actual = firstStock.equals(secondStock);
        assertEquals(expected, actual);
    }

    public void testTestHashCode() {
        Stock stock = new Stock("Google", 1000);

        int expected = 990462600;
        int actual = stock.hashCode();
        assertEquals(expected, actual);
    }

    public void testTestToString() {
        Stock stock = new Stock("Google", 1000);

        String expected = "Stock{companyName='Google', currentPrice=1000.0, minPrice=1000.0, maxPrice=1000.0}";
        String actual = stock.toString();
        assertEquals(expected, actual);
    }

    public void testPrintInformation() {
        Stock stock = new Stock("Google", 1000);

        String expected = "Company name  = Google\n" +
                "Current price = 1000.0\n" +
                "Min price = 1000.0\n" +
                "Max price = 1000.0";
        String actual = stock.printInformation();
        assertEquals(expected, actual);
    }
}