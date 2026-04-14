
package com.mycompany.marketplacesimulation;

import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import java.util.Random;

public class HomeView extends VBox {
    public HomeView() {
        Label title = new Label("Marketplace Application");
        title.setStyle("-fx-font-size: 18px; -fx-font-weight: bold;");
        TextField name = new TextField(); name.setPromptText("Enter Name"); name.setMaxWidth(200);
        TextArea out = new TextArea(); out.setEditable(false); out.setPrefHeight(250);
        Button btn = new Button("Place Order");

        btn.setOnAction(e -> {
            Random r = new Random();
            String usr = name.getText().isEmpty() ? "Guest" : name.getText();
            Product p = new DigitalProduct(2, "Win 11 Pro", 120.0, 99, 4500, "link");
            Customer c = new Customer(1, usr, "test@email.com", "BD");
            Order ord = c.generateOrder(1000 + r.nextInt(9000));
            ord.addOrderItem(new OrderItem(p, 1 + r.nextInt(5)));
            c.placeOrder(ord);

            OrderItem i = ord.getOrderItems().get(0);
            out.setText("Order #" + ord.getOrderID() + " placed by " + usr + "\n---\n" +
                        "- " + i.getQuantity() + "x " + p.getName() + " (Subtotal: $" + i.getSubtotal() + ")\n" +
                        "---\nTotal Value: $" + i.getSubtotal() + "\nStatus: " + ord.getStatus() + "\n\n" +
                        new OnlineInvoice(9000 + r.nextInt(500)).generateOutput() + "\n" +
                        new PrintedInvoice(9500 + r.nextInt(500)).generateOutput());
        });

        getChildren().addAll(title, name, btn, out);
        setAlignment(Pos.CENTER); setSpacing(15);
    }
}