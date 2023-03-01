package isp.lab9.exercise1;

import lombok.Getter;
import lombok.Setter;

public class UserStock {

    @Getter
    @Setter
    private int quantity;
    @Getter
    @Setter
    private StockItem stock;

    public UserStock(StockItem stock) {
        this.quantity = 0;
        this.stock = stock;
    }

}
