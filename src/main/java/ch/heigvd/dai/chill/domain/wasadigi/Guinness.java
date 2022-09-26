package ch.heigvd.dai.chill.domain.wasadigi;

import ch.heigvd.dai.chill.domain.IProduct;

import java.math.BigDecimal;

public class Guinness implements IProduct {
    public final static String NAME = "Guinness";
    public final static BigDecimal PRICE = new BigDecimal(5.6);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
