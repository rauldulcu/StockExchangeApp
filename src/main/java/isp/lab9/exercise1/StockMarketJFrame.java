package isp.lab9.exercise1;

import java.awt.Color;
import java.awt.Component;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Popup;
import javax.swing.PopupFactory;
import javax.swing.border.Border;
import yahoofinance.Stock;

public class StockMarketJFrame extends javax.swing.JFrame {

    private StockMarketQueryService marketService;
    private Portofolio portofolio;
    private UserStock userStock;
    private Popup popup;

    public StockMarketJFrame() {
        try {

            marketService = new StockMarketQueryService();
            marketService.requestData();
            portofolio = new Portofolio(new BigDecimal(1000));

        } catch (IOException ex) {
            Logger.getLogger(StockMarketJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

        initComponents();

        this.FundsBar.setText(portofolio.getFunds().toPlainString() + " $");
    }

    public JButton getSellButton() {
        return SellButton;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Portofolio = new javax.swing.JTabbedPane();
        MarketTab = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMarket = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        MarketRefreshButton = new javax.swing.JButton();
        PortofolioTab = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTablePortofolio = new javax.swing.JTable();
        PortofolioRefreshButton = new javax.swing.JButton();
        BuyTab = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        FundsBar = new javax.swing.JTextField();
        SymbolBarForBuy = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        QuantityBarForBuy = new javax.swing.JTextField();
        BuyButton = new javax.swing.JButton();
        SellTab = new javax.swing.JPanel();
        SymbolBarForSell = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        SellButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        ExchangeAmountForSell = new javax.swing.JTextField();
        QuantityBarForSell = new javax.swing.JComboBox<>();
        myAccountPane = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        AddFundsButton = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jTableMarket.setModel(marketService);
        jScrollPane1.setViewportView(jTableMarket);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 537, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        MarketRefreshButton.setText("Refresh");
        MarketRefreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MarketRefreshButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MarketTabLayout = new javax.swing.GroupLayout(MarketTab);
        MarketTab.setLayout(MarketTabLayout);
        MarketTabLayout.setHorizontalGroup(
            MarketTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 537, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(MarketTabLayout.createSequentialGroup()
                .addComponent(MarketRefreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        MarketTabLayout.setVerticalGroup(
            MarketTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MarketTabLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MarketRefreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Portofolio.addTab("Market", MarketTab);

        jTablePortofolio.setModel(portofolio);
        jScrollPane3.setViewportView(jTablePortofolio);

        PortofolioRefreshButton.setText("Refresh");
        PortofolioRefreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PortofolioRefreshButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PortofolioTabLayout = new javax.swing.GroupLayout(PortofolioTab);
        PortofolioTab.setLayout(PortofolioTabLayout);
        PortofolioTabLayout.setHorizontalGroup(
            PortofolioTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PortofolioTabLayout.createSequentialGroup()
                .addComponent(PortofolioRefreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(444, Short.MAX_VALUE))
            .addComponent(jScrollPane3)
        );
        PortofolioTabLayout.setVerticalGroup(
            PortofolioTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PortofolioTabLayout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PortofolioRefreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );

        Portofolio.addTab("Portofolio", PortofolioTab);

        BuyTab.setForeground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Available funds:");

        FundsBar.setEditable(false);
        FundsBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FundsBarActionPerformed(evt);
            }
        });

        SymbolBarForBuy.setModel(new DefaultComboBoxModel(marketService.getSymbols()));
        SymbolBarForBuy.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        SymbolBarForBuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SymbolBarForBuyActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Symbol:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Quantity:");

        QuantityBarForBuy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                QuantityBarForBuyMouseClicked(evt);
            }
        });
        QuantityBarForBuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuantityBarForBuyActionPerformed(evt);
            }
        });
        QuantityBarForBuy.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                QuantityBarForBuyKeyPressed(evt);
            }
        });

        BuyButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BuyButton.setText("Buy");
        BuyButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BuyButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BuyButtonMouseEntered(evt);
            }
        });
        BuyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuyButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BuyTabLayout = new javax.swing.GroupLayout(BuyTab);
        BuyTab.setLayout(BuyTabLayout);
        BuyTabLayout.setHorizontalGroup(
            BuyTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BuyTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BuyTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(SymbolBarForBuy, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(BuyTabLayout.createSequentialGroup()
                        .addGroup(BuyTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(BuyTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BuyTabLayout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(FundsBar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BuyTabLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(BuyTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BuyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(QuantityBarForBuy, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(0, 257, Short.MAX_VALUE))
        );
        BuyTabLayout.setVerticalGroup(
            BuyTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BuyTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BuyTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FundsBar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BuyTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SymbolBarForBuy, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(BuyTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(QuantityBarForBuy, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(BuyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(254, 254, 254))
        );

        Portofolio.addTab("Buy", BuyTab);

        SymbolBarForSell.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        SymbolBarForSell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SymbolBarForSellActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Quantity:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Symbol:");

        SellButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SellButton.setText("Sell");
        SellButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SellButtonActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Exchange amount:");

        ExchangeAmountForSell.setEditable(false);

        QuantityBarForSell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuantityBarForSellActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SellTabLayout = new javax.swing.GroupLayout(SellTab);
        SellTab.setLayout(SellTabLayout);
        SellTabLayout.setHorizontalGroup(
            SellTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SellTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SellTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(SellTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SellTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(ExchangeAmountForSell, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                        .addComponent(SymbolBarForSell, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(SellButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(QuantityBarForSell, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(250, Short.MAX_VALUE))
        );
        SellTabLayout.setVerticalGroup(
            SellTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SellTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SellTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SellTabLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(41, 41, 41)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))
                    .addGroup(SellTabLayout.createSequentialGroup()
                        .addComponent(SymbolBarForSell)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(QuantityBarForSell, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)))
                .addGroup(SellTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(ExchangeAmountForSell, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(SellButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(164, Short.MAX_VALUE))
        );

        Portofolio.addTab("Sell", SellTab);

        jLabel7.setText("First Name:");

        jLabel8.setText("Last Name:");

        jLabel9.setText("E-mail adress:");

        jLabel10.setText("Avaliable funds:");

        AddFundsButton.setText("Add funds");
        AddFundsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddFundsButtonActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Personal informations:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Account informations:");

        javax.swing.GroupLayout myAccountPaneLayout = new javax.swing.GroupLayout(myAccountPane);
        myAccountPane.setLayout(myAccountPaneLayout);
        myAccountPaneLayout.setHorizontalGroup(
            myAccountPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myAccountPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(myAccountPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(AddFundsButton)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addContainerGap(389, Short.MAX_VALUE))
        );
        myAccountPaneLayout.setVerticalGroup(
            myAccountPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myAccountPaneLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addGap(24, 24, 24)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addGap(37, 37, 37)
                .addComponent(AddFundsButton)
                .addContainerGap(137, Short.MAX_VALUE))
        );

        Portofolio.addTab("myAccount", myAccountPane);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Portofolio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Portofolio, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        setLocation((Toolkit.getDefaultToolkit().getScreenSize().width - getSize().width) / 2, (Toolkit.getDefaultToolkit().getScreenSize().height - getSize().height) / 2);
    }//GEN-LAST:event_formWindowOpened

    private void QuantityBarForSellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuantityBarForSellActionPerformed

        try {
            userStock.setQuantity(Integer.parseInt((String) QuantityBarForSell.getSelectedItem()));
            //System.out.println( userStock.getQuantity());

            BigDecimal quantity = BigDecimal.valueOf(userStock.getQuantity());
            BigDecimal amount = userStock.getStock().getPrice().multiply(quantity);
            ExchangeAmountForSell.setText(amount + " $");
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "Please select the symbol and the quantity first", "Try again", JOptionPane.ERROR_MESSAGE);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "The quantity has to be a number.", "Try again", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_QuantityBarForSellActionPerformed

    private void SellButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SellButtonActionPerformed

        try {
            String message = portofolio.sellStock(userStock);
            FundsBar.setText(portofolio.getFunds() + " $");
            if (message.equals("Stock sold successfully.")) {
                JOptionPane.showMessageDialog(this, message, "", JOptionPane.NO_OPTION);
                userStock = null;
                System.gc();
            } else {
                JOptionPane.showMessageDialog(this, message, "Try again", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "Please select the symbol and the quantity first", "Try again", JOptionPane.ERROR_MESSAGE);
        }
        String[] array = (String[]) portofolio.getSymbols().toArray(new String[portofolio.getSymbols().size()]);
        SymbolBarForSell.setModel(new DefaultComboBoxModel<>(array));

        try {
            //SymbolBarForSell.setModel(new DefaultComboBoxModel<String>(portofolio.getSymbols().toArray(new String[0])));
            portofolio.requestData();
        } catch (IOException ex) {
            Logger.getLogger(StockMarketJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_SellButtonActionPerformed

    private void SymbolBarForSellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SymbolBarForSellActionPerformed

        String symbol = (String) SymbolBarForSell.getSelectedItem();
        for (UserStock userStockIndex : portofolio.getMyStocks()) {
            if (userStockIndex.getStock().getSymbol().equals(symbol)) {
                userStock = new UserStock(userStockIndex.getStock());

                String[] quantity = new String[userStockIndex.getQuantity()];
                quantity[0] = 1 + "";
                for (int i = 1; i < userStockIndex.getQuantity(); i++) {
                    quantity[i] = Integer.toString(Integer.parseInt(quantity[i - 1]) + 1);
                    System.out.println(quantity[i]);
                }
                QuantityBarForSell.setModel(new DefaultComboBoxModel<>(quantity));
            }

        }
    }//GEN-LAST:event_SymbolBarForSellActionPerformed

    private void BuyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuyButtonActionPerformed

        try {

            String message = portofolio.buyStock(userStock);
            FundsBar.setText(portofolio.getFunds() + " $");
            switch (message) {
                case "Stock bought successfully.":
                JOptionPane.showMessageDialog(this, message, "", JOptionPane.NO_OPTION);
                userStock = null;
                System.gc();
                break;
                case "Insufficient funds.":
                JOptionPane.showMessageDialog(this, message, "Try again", JOptionPane.ERROR_MESSAGE);
                /*BuyJFrame payment = new BuyJFrame();
                payment.setVisible(true);
                payment.getPaymentAmountText().setText(userStock.getStock().getPrice().multiply(BigDecimal.valueOf(userStock.getQuantity())) + "$");*/
                break;
                default:
                JOptionPane.showMessageDialog(this, message, "Try again", JOptionPane.ERROR_MESSAGE);
                break;
            }
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "Please select the symbol and the quantity first.", "Try again", JOptionPane.ERROR_MESSAGE);
        }
        String[] array = (String[]) portofolio.getSymbols().toArray(new String[portofolio.getSymbols().size()]);
        SymbolBarForSell.setModel(new DefaultComboBoxModel<>(array));
        popup.hide();
        try {
            portofolio.requestData();
            //      SymbolBarForSell.setModel(new DefaultComboBoxModel<String>(portofolio.getSymbols().toArray(new String[0])));
        } catch (IOException ex) {
            Logger.getLogger(StockMarketJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BuyButtonActionPerformed

    private void BuyButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuyButtonMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_BuyButtonMouseEntered

    private void BuyButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuyButtonMouseClicked

    }//GEN-LAST:event_BuyButtonMouseClicked

    private void QuantityBarForBuyKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_QuantityBarForBuyKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            popup.hide();
        }
    }//GEN-LAST:event_QuantityBarForBuyKeyPressed

    private void QuantityBarForBuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuantityBarForBuyActionPerformed
        if (evt.getSource() == QuantityBarForBuy) {
            try {
                userStock.setQuantity(Integer.parseInt(QuantityBarForBuy.getText()));
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(this, "Please select the symbol first.", "Try again", JOptionPane.ERROR_MESSAGE);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "The quantity has to be a number.", "Try again", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_QuantityBarForBuyActionPerformed

    private void QuantityBarForBuyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QuantityBarForBuyMouseClicked

        if (popup != null) {
            popup.hide();
        }
        JLabel text = new JLabel("Don't forget to press ENTER after you choose the quantity.");
        int x = 0;
        int y = 0;

        Component currentComponent = QuantityBarForBuy;

        while (currentComponent != null) {

            x += currentComponent.getX();
            y += currentComponent.getY();

            currentComponent = currentComponent.getParent();

        }
        Color color = new Color(237, 121, 119);
        Border border = BorderFactory.createLineBorder(color, 2);
        text.setBorder(border);
        text.setForeground(Color.RED);
        popup = PopupFactory.getSharedInstance().getPopup(this, text, x, y + 40);
        // BuyButton.setBounds(BuyButton.getX(), BuyButton.getY()-40, BuyButton.getWidth(), BuyButton.getHeight());
        popup.show();
    }//GEN-LAST:event_QuantityBarForBuyMouseClicked

    private void SymbolBarForBuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SymbolBarForBuyActionPerformed
        if (evt.getSource() == SymbolBarForBuy) {
            String symbol = (String) SymbolBarForBuy.getSelectedItem();
            for (Map.Entry<String, Stock> mapIndex : marketService.getStocks().entrySet()) {
                if (mapIndex.getKey().equals(symbol)) {
                    StockItem stock = new StockItem(mapIndex.getValue());
                    userStock = new UserStock(stock);
                    return;
                }

            }
        }
    }//GEN-LAST:event_SymbolBarForBuyActionPerformed

    private void FundsBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FundsBarActionPerformed
        portofolio.getFunds();
    }//GEN-LAST:event_FundsBarActionPerformed

    private void PortofolioRefreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PortofolioRefreshButtonActionPerformed
        try {
            portofolio.requestData();
        } catch (IOException ex) {
            Logger.getLogger(StockMarketJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_PortofolioRefreshButtonActionPerformed

    private void MarketRefreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MarketRefreshButtonActionPerformed
        try {
            marketService.requestData();
        } catch (IOException ex) {
            Logger.getLogger(StockMarketJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_MarketRefreshButtonActionPerformed

    private void AddFundsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddFundsButtonActionPerformed
       BuyJFrame payment = new BuyJFrame();
                payment.setVisible(true);
                payment.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
               // payment.getPaymentAmountText().setText(userStock.getStock().getPrice().multiply(BigDecimal.valueOf(userStock.getQuantity())) + "$");
    }//GEN-LAST:event_AddFundsButtonActionPerformed

    public static void main(String args[]) {
        /* 
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StockMarketJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StockMarketJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StockMarketJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StockMarketJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StockMarketJFrame().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddFundsButton;
    private javax.swing.JButton BuyButton;
    private javax.swing.JPanel BuyTab;
    private javax.swing.JTextField ExchangeAmountForSell;
    private javax.swing.JTextField FundsBar;
    private javax.swing.JButton MarketRefreshButton;
    private javax.swing.JPanel MarketTab;
    private javax.swing.JTabbedPane Portofolio;
    private javax.swing.JButton PortofolioRefreshButton;
    private javax.swing.JPanel PortofolioTab;
    private javax.swing.JTextField QuantityBarForBuy;
    private javax.swing.JComboBox<String> QuantityBarForSell;
    private javax.swing.JButton SellButton;
    private javax.swing.JPanel SellTab;
    private javax.swing.JComboBox<String> SymbolBarForBuy;
    private javax.swing.JComboBox<String> SymbolBarForSell;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableMarket;
    private javax.swing.JTable jTablePortofolio;
    private javax.swing.JPanel myAccountPane;
    // End of variables declaration//GEN-END:variables
}
