package gui;

import java.io.IOException;

import business.FreizeitbaederModel;
import javafx.stage.Stage;

public class FreizeitbaederControl {
    
    private FreizeitbaederView freizeitbaederView;
    private FreizeitbaederModel freizeitbaederModel;

    public FreizeitbaederControl(Stage primaryStage){
        this.freizeitbaederModel = new FreizeitbaederModel();
        this.freizeitbaederView = new FreizeitbaederView(this, primaryStage,
            freizeitbaederModel);
    }
    
    void schreibeFreizeitbadInDatei(String typ){
           try{
               if("csv".equals(typ)){
                   freizeitbaederModel.schreibeFreizeitbadInCsvDatei();
                   freizeitbaederView.zeigeInformationsfensterAn(
                       "Das Freizeitbad wurde gespeichert!");
               }
               else if("txt".equals(typ)) {
                   freizeitbaederModel.schreibeFreizeitbadInTxtDatei(typ);
                   freizeitbaederView.zeigeInformationsfensterAn(
                       "Das Freizeitbad wurde gespeichert!");
               }
               else{
                   freizeitbaederView.zeigeInformationsfensterAn(
                       "Noch nicht implementiert!");
               }
        }
        catch(IOException exc){
            freizeitbaederView.zeigeFehlermeldungAn(
                "IOException beim Speichern!");
        }
        catch(Exception exc){
            freizeitbaederView.zeigeFehlermeldungAn(
                "Unbekannter Fehler beim Speichern!");
        }
    }
}
