package com.example.controller;

import com.example.model.Converter;
import com.example.view.ConverterView;

public class ConverterController {
    Converter converterModel;
    ConverterView converterView;

    public ConverterController(Converter converterModel, ConverterView converterView) {
        this.converterModel = converterModel;
        this.converterView = converterView;

    }

    public String[] getAllCurrencies() {
        return converterModel.getCurrencyCodes();
    }

    public double getConvertedValue(double amount, String fromCurrency, String toCurrency) {
        return converterModel.convert(amount, fromCurrency, toCurrency);
    }

}
