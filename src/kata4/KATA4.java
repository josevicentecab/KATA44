package kata4;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

public class KATA4 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        String nameFile ="/Users/josevicentecabanas/Documents/Proyectos Netbeans/KATA4/Data/emailsfilev1.txt";
        ArrayList<String> mailArray = MailListReader.read(nameFile);
        System.out.println(mailArray.size());
        
        Histogram <String> histogram = MailHistogramBuilder.buil(mailArray);

        
        new HistogramDisplay(histogram).execute();
    }
    
}
