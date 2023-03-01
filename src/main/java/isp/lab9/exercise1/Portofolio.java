package isp.lab9.exercise1;

import java.io.IOException;
import java.util.List;
import java.math.BigDecimal;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import lombok.Getter;
import lombok.Setter;

public class Portofolio extends AbstractTableModel {

    @Getter
    @Setter
    private BigDecimal funds;
    @Getter
    @Setter
    private List<UserStock> myStocks = new ArrayList<>();

    private String[] columns = new String[]{"Quantity", "Name", "Symbol", "Price", "Currency"};
    @Getter
    private ArrayList symbols = new ArrayList();
    
    private int nrOfSymbols=0;

    public Portofolio(BigDecimal funds) {
        this.funds = funds;

    }

    public String buyStock(UserStock userStock) throws NullPointerException {

        BigDecimal newPrice = currencyChange(userStock.getStock().getCurrency(), userStock.getStock().getPrice());
        userStock.getStock().setPrice(newPrice);
        userStock.getStock().setCurrency("USD");
        boolean ok = false;
        if (userStock.getQuantity() > 0) {
            if (funds.compareTo(userStock.getStock().getPrice().multiply(BigDecimal.valueOf(userStock.getQuantity()))) > 0) {
                for (UserStock stock : myStocks) {
                    if (stock.getStock().equals(userStock.getStock())) {
                        ok = true;
                        stock.setQuantity(stock.getQuantity() + userStock.getQuantity());
                    }
                }
                if (ok == false) {
                    myStocks.add(userStock);
                   symbols.add(userStock.getStock().getSymbol());

                }
                for (int i = 1; i <= userStock.getQuantity(); i++) {
                    this.funds = funds.subtract(userStock.getStock().getPrice());
                }
                return "Stock bought successfully.";
            } else {
                return "Insufficient funds.";
            }
        } else {
            return "Quantity can't be <1.";
        }
    }

    public String sellStock(UserStock userStock) throws NullPointerException {
        boolean ok = false; // obj is in portofolio
        boolean remove = false;
        int k = 0;
        if (!myStocks.isEmpty()) {
            if ((userStock.getQuantity() > 0)) {
                for (UserStock stock : myStocks) {
                    if (stock.getStock().equals(userStock.getStock())) {
                        ok = true;
                        if (userStock.getQuantity() <= stock.getQuantity()) {
                            for (int i = 1; i <= userStock.getQuantity(); i++) {
                                this.funds = funds.add(userStock.getStock().getPrice());
                            }

                            if (userStock.getQuantity() == stock.getQuantity()) {
                                remove = true;
                            } else {
                                stock.setQuantity(stock.getQuantity() - userStock.getQuantity());
                            }

                        } else {
                            return "You don't have enough stocks.";
                        }
                        k = myStocks.indexOf(stock);
                        break;
                    }
                }
                if (ok == false) {
                    return "The stock isn't in your portofolio.";
                }
                if (remove == true) {
                    myStocks.remove(k);
                    symbols.remove(userStock.getStock().getSymbol());
                            
                }
                return "Stock sold successfully.";
            } else {
                return "Please select the quantity.";
            }
        } else {
            return "Portofolio empty.";
        }

    }

    public BigDecimal currencyChange(String currency, BigDecimal price) {
        if (!currency.equals("USD")) {
            if (currency.equals("EUR")) {
                return price.multiply(BigDecimal.valueOf(1.08));
            }
            if (currency.equals("BTC")) {
                return price.multiply(BigDecimal.valueOf(40346.70));
            }
            if (currency.equals("JPY")) {
                return price.multiply(BigDecimal.valueOf(0.0079));
            }
            if (currency.equals("GBP")) {
                return price.multiply(BigDecimal.valueOf(1.31));
            }
            if (currency.equals("AUD")) {
                return price.multiply(BigDecimal.valueOf(0.74));
            }
            if (currency.equals("CAD")) {
                return price.multiply(BigDecimal.valueOf(0.79));
            }
        }
        return price;
    }

    @Override
    public int getRowCount() {
        return myStocks.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        UserStock i = myStocks.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return i.getQuantity();
            case 1:
                return i.getStock().getName();
            case 2:
                return i.getStock().getSymbol();
            case 3:
                if (i.getStock().getPrice() != null) {
                    return i.getStock().getPrice().toPlainString();
                } else {
                    return "N/A";
                }
            case 4:
                return i.getStock().getCurrency();

        }
        return "N/A";
    }

    @Override
    public String getColumnName(int index) {
        return columns[index];
    }

    public void requestData() throws IOException {

        this.fireTableDataChanged();
    }
    
}
