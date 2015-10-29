package kata4;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

public class KATA4 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        
        
        String from = "/Users/josevicentecabanas/Desktop/images (1).jpeg";
        String to = "/Users/josevicentecabanas/Desktop/images (2).jpeg";
        BufferedInputStream input = new BufferedInputStream(new FileInputStream(new File(from)));
        BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream(new File(to)));
        
        byte [] buffer = new byte [1024];
        Date date = new Date();
        while (true) {
            int read = input.read(buffer);
            if (read < 0) break;
            output.write(buffer);
        }
        System.out.println(new Date().getTime() - date.getTime() + "msg");
        
        input.close();
        output.flush();
        output.close();
    }
    
}
