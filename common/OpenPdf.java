
package common;

import doc.PharmacyUtills;
import java.io.File;
import javax.swing.JOptionPane;


public class OpenPdf {
    public static void openById(String id){
        
        try{
            if((new File(PharmacyUtills.billPath +id+".pdf")).exists()){
               Process p = Runtime
                       .getRuntime()
                       .exec("rundll32 url.dll,FileProtocolHandler  "+PharmacyUtills.billPath +id+".pdf");
               
            }
            else{
                JOptionPane.showMessageDialog(null,"File  do not Exixt.");
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
    }
}
