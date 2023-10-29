package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class Rupee implements ConvertableCurrency {
    CurrencyType currencyType = CurrencyType.RUPEE;

    public CurrencyType getCurrencyType() {
        return currencyType;
    }
}
