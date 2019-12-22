package com.example.log4j2demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.ThreadContext;
import org.slf4j.MDC;

public class CompareValue {
    private static final Logger logger = LogManager.getLogger(CompareValue.class);
    private final int valueA;
    private final int valueB;

    public CompareValue(int valueA, int valueB) {
        this.valueA = valueA;
        this.valueB = valueB;
    }

    public void execute()
    {
        ThreadContext.put("valorA", String.valueOf(valueA));
        MDC.put("valorA","MDC " + String.valueOf(valueA));

        MDC.put("valorB", "MDC " + String.valueOf(valueB));
        logger.info("[CompareValue] - Começando a comparar os valores {}, {}", valueA, valueB);
        try{
            if (valueA == valueB)
            {
                logger.info("[CompareValue] - Os valores são iguais");
            }else
            {
                logger.warn("[CompareValue] - Valores são diferentes");
            }

        }catch (Exception e)
        {
            logger.error("[CompareValeu] - Ocorreu esse problema: {}", e);
        }
    }
}
