package Proxy.CurrencyRateService;

import java.util.Currency;

public interface CurrencyRateService {
    double getDailyCurrencyRate(Currency currency);
}
