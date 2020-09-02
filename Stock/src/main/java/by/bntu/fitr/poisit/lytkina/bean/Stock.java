package by.bntu.fitr.poisit.lytkina.bean;

import java.util.Objects;

public class Stock {
    private String companyName;
    private double currentPrice;
    private double minPrice;
    private double maxPrice;

    public Stock(String name, double currentPrice){
        this.companyName = name;
        this.currentPrice = currentPrice;
        minPrice = currentPrice;
        maxPrice = currentPrice;
    }

    public String getCompanyName() {
        return companyName;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public double getMinPrice() {
        return minPrice;
    }

    public double getMaxPrice() {
        return maxPrice;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stock stock = (Stock) o;
        return Double.compare(stock.currentPrice, currentPrice) == 0 &&
                Double.compare(stock.minPrice, minPrice) == 0 &&
                Double.compare(stock.maxPrice, maxPrice) == 0 &&
                Objects.equals(companyName, stock.companyName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(companyName, currentPrice, minPrice, maxPrice);
    }

    @Override
    public String toString() {
        return "Stock{" +
                "companyName='" + companyName + '\'' +
                ", currentPrice=" + currentPrice +
                ", minPrice=" + minPrice +
                ", maxPrice=" + maxPrice +
                '}';
    }

    public double updatePrice(double newPrice){
        if (newPrice <= 0){
            return currentPrice;
        }
        if (newPrice > maxPrice){
            maxPrice = newPrice;
        }
        if (newPrice < minPrice){
            minPrice = newPrice;
        }
        currentPrice = newPrice;
        return currentPrice;
    }
    public String printInformation(){
        return "Company name  = " + companyName + "\nCurrent price = " + currentPrice +
                "\nMin price = " + minPrice + "\nMax price = " + maxPrice;
    }
}
