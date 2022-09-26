package ch.heigvd.dai.chill.domain.wasadigi;

import ch.heigvd.dai.chill.domain.Bartender;
import ch.heigvd.dai.chill.protocol.OrderRequest;
import ch.heigvd.dai.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GuinnessTest {

  @Test
  void thePriceAndNameForGuinessShouldBeCorrect() {
    Guinness beer = new Guinness();
    assertEquals(beer.getName(), Guinness.NAME);
    assertEquals(beer.getPrice(), Guinness.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForGuiness() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.dai.chill.domain.wasadigi.Guinness";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Guinness.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}
