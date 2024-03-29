package exchange.spring.test;

import java.io.IOException;
import java.math.BigDecimal;
import yahoofinance.Stock;
import yahoofinance.YahooFinance;
/*
TWDUSD=x
JPYTWD=x
CNYTWD=x;
EURTWD=x
*/
public class Test {
    public static void main(String[] args) throws IOException {
        int money = 1000;
        //Stock stock = YahooFinance.get("TWDUSD=x");
        Stock stock = YahooFinance.get("TWDJPY=x");
        double price = stock.getQuote().getPrice().doubleValue();
        System.out.println(price);
        System.out.println(price * money);
        
        Stock stock2 = YahooFinance.get("2317.TW");
        System.out.println(stock2.getQuote()); 
    }
}
