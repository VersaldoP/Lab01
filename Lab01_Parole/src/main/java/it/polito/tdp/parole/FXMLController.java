package it.polito.tdp.parole;

import it.polito.tdp.parole.model.Parole;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {
	
	Parole elenco ;
	private long tmp=0;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtParola;

    @FXML
    private Button btnInserisci;

    @FXML
    private TextArea txtResult;

    @FXML
    private Button btnReset;
    
    @FXML
    private Button btnCancella;
    
    @FXML
    private TextArea txtTempo;

    
    @FXML
    void doCancella(ActionEvent event) {
    	tmp=System.nanoTime();
    	elenco.cancella(txtResult.getSelectedText());
    	tmp= System.nanoTime()-tmp;
    	txtResult.setText(elenco.getElenco().toString());
    	txtTempo.setText(""+tmp/1e9+"");
    }

    @FXML
    void doInsert(ActionEvent event) {
    	// TODO
    	tmp=System.nanoTime();
    	elenco.addParola(txtParola.getText());
    	tmp= System.nanoTime()-tmp;
    	txtParola.setText("");
    	txtResult.setText(elenco.getElenco().toString());
    	txtTempo.setText(""+tmp/1e9+"");
    }

    @FXML
    void doReset(ActionEvent event) {
    	tmp=System.nanoTime();
    	elenco.reset();
    	tmp= System.nanoTime()-tmp;
    	txtResult.setText("");
   
    	txtTempo.setText(""+tmp/1e9+"");
    	// TODO
    }

    @FXML
    void initialize() {
        assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnInserisci != null : "fx:id=\"btnInserisci\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Scene.fxml'.";

        elenco = new Parole() ;
    }
}
