package business;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;



public class FreizeitbaederModel {
        
	private Freizeitbad freizeitbad;

    public Freizeitbad getFreizeitbad() {
        return this.freizeitbad;
    }

    public void setFreizeitbad(Freizeitbad freizeitbad) {
        this.freizeitbad = freizeitbad;
    }
        
    public void schreibeFreizeitbadInCsvDatei() throws IOException{
    	BufferedWriter aus
        = new BufferedWriter(
        new FileWriter(
        "Csv.csv",true));
        aus.write(this.freizeitbad.gibFreizeitbadZurueck(';'));
        aus.close();
        }
     
  

    public void schreibeFreizeitbadInTxtDatei(String text)
    		throws Exception {
    	BufferedWriter aus
    	= new BufferedWriter(new FileWriter("Text.txt"));
    	aus.write(text);
    	aus.close();
    	}
}

