package edu.oregonstate.stockticker.Stock.Ticker.API;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class StockTickerController {
    Map<String, String> stockTickers  = new HashMap<String, String>() {{
        put("GOOGLE", "GOOG");
        put("APPLE", "AAPL");
        put("MICROSOFT", "MSFT");
        put("FACEBOOK", "META");
        put("META", "META");
        put("AMAZON", "AMZN");
        put("NETFLIX", "NFLX");
        put("TWITTER", "TWTR");
        put("UBER", "UBER");
        put("NVIDIA", "NVDA");
        put("INTEL", "INTC");
        put("AIRBNB", "ABNB");
        put("DROPBOX", "DBX");
    }};

    @GetMapping("/api/stock")
    @ResponseBody
    String getStockTicker(@RequestParam String stock) {
        if (stockTickers.containsKey(stock.toUpperCase())) {
            return stockTickers.get(stock.toUpperCase());
        }

        return "Stock not found!";
    }

    @GetMapping("/api/stocks")
    @ResponseBody
    List<String> getListOfStockTickers(@RequestParam List<String> stocks) {
        List<String> tickers = new ArrayList();
        for (String stock : stocks) {
            if (stockTickers.containsKey(stock.toUpperCase())) {
                tickers.add(stockTickers.get(stock.toUpperCase()));
            }
        }

        return tickers;
    }
}
