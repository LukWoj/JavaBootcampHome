package controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import logic.Product;
import logic.ProductBasket;

import java.net.URL;
import java.util.Iterator;
import java.util.ResourceBundle;

public class MainPaneController implements Initializable {
    ProductBasket basket = new ProductBasket();

    @FXML
    private TextArea productList;

    @FXML
    private TextField nameField;

    @FXML
    private TextField priceField;

    @FXML
    private Button addButton;

    @FXML
    private Button printButton;

    @FXML
    void addToBasketAction(MouseEvent event) {
        double price = 0;
        if (!nameField.getText().isEmpty() && !priceField.getText().isEmpty()) {
            try {
                price = Double.parseDouble(priceField.getText());
                String name = nameField.getText();
                basket.getProducts().add(new Product(name, price));
            } catch (NumberFormatException e) {
                productList.clear();
                nameField.clear();
                priceField.clear();
                productList.setText("Price should be in numeric format, pleas try again");
            }

            nameField.clear();
            priceField.clear();
        }

    }

    @FXML
    void printBasketAction(MouseEvent event) {
        char newLine = 10;
        StringBuilder sb = new StringBuilder();
        Iterator<Product> productIterator = basket.getProducts().iterator();
        while (productIterator.hasNext()) {
            Product product = productIterator.next();
            sb.append(product);
            sb.append(newLine);
        }
        productList.setText(sb.toString());

    }

    @FXML
    void clearBasketAction(MouseEvent event) {
        productList.clear();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {


    }
}
