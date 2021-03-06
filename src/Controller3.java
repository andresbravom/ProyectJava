import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller3 {

    @FXML
    private TextField searchProduct;

    @FXML
    private TextArea textArea;

    @FXML
    private Button searchButton;

    @FXML
    private Button back;

    @FXML
    void backToMenu(ActionEvent event) {
    	
    	searchProduct.clear();
    	textArea.clear();
    	General.option3.close();
    	General.menu.show();

    }

    
    @FXML
    void searchAProducts(ActionEvent event) {
    	String nameProduct = searchProduct.getText();
    	
    	if (Product.general.search_product(nameProduct) != null) {
    		textArea.setText("Product in stock:\r\n" + "\r\n" + 
    		Product.general.search_product(nameProduct).getName() + "\r\n"+ 
    		"Price: " + Product.general.search_product(nameProduct).getPrize()+"€\r\n"+ 
    		"Stock: " + Product.general.search_product(nameProduct).getStock() + "\r\n" + 
    		"ID Product: " + Product.general.search_product(nameProduct).getId());
    	}else {
    		textArea.setText("Product not found");
    	}
    }

}



