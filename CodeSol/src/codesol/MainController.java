/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codesol;

import com.jfoenix.controls.JFXButton;
import java.io.IOException;
import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.util.Duration;

public class MainController {


    @FXML
    private VBox dataPane;
    @FXML
    private Button btnUser;
    @FXML
    private Button btnProduct;
    @FXML
    private Button btnPC;
    @FXML
    private Button btnReport;
    @FXML
    private Button btnDebt;
    @FXML
    private Button btnExit;

    public void setDataPane(Node node) {
        // update VBox with new form(FXML) depends on which button is clicked
        dataPane.getChildren().setAll(node);
    }

    public VBox fadeAnimate(String url) throws IOException {
        VBox v = (VBox) FXMLLoader.load(getClass().getResource(url));
        FadeTransition ft = new FadeTransition(Duration.millis(1500));
        ft.setNode(v);
        ft.setFromValue(0.1);
        ft.setToValue(1);
        ft.setCycleCount(1);
        ft.setAutoReverse(false);
        ft.play();
        return v;
    }
    
    @FXML
    public void loadUser(ActionEvent event) throws IOException {
        setDataPane(fadeAnimate("/codesol/User/User.fxml"));
    }

    @FXML
    private void loadProduct(ActionEvent event) throws IOException {
        setDataPane(fadeAnimate("/codesol/Product/Product.fxml"));
    }
    
    @FXML
    public void loadPC(ActionEvent event) throws IOException {
        setDataPane(fadeAnimate("/codesol/PC/PC.fxml"));
    }

    @FXML
    private void loadReport(ActionEvent event) {
    }

    @FXML
    private void loadDebt(ActionEvent event) throws IOException {
        setDataPane(fadeAnimate("/codesol/Debt/Debt.fxml"));
    }

    @FXML
    private void loadExit(ActionEvent event) {
        System.exit(0); 
    }

    

    
}
