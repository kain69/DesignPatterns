package Proxy;

import Proxy.CurrencyRateService.CurrencyRateService;
import Proxy.CurrencyRateService.CurrencyRateServiceImpl.CurrencyRateServiceProxy;

import java.util.Currency;

public class Demo {

    private static final String EUR = "EUR";

    public static void main(String[] args) {
        CurrencyRateService currencyRateService = new CurrencyRateServiceProxy();
        Currency eur = Currency.getInstance(EUR);

        System.out.println(currencyRateService.getDailyCurrencyRate(eur));
        System.out.println(currencyRateService.getDailyCurrencyRate(eur));
        System.out.println(currencyRateService.getDailyCurrencyRate(eur));
    }
}