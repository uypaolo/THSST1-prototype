import java.io.FileInputStream;
 import edu.stanford.smi.protege.model.Cls;
 import edu.stanford.smi.protegex.owl.ProtegeOWL;
 import edu.stanford.smi.protegex.owl.jena.JenaOWLModel;
  
 public class TestOWLLoad {  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        JenaOWLModel owlModel = null;        
        FileInputStream is;
        
        try {
            is = new FileInputStream("C:/Users/Paolo/Desktop/Protege-OWL 3.4.8/etc/forms.owl");  
            // Load the owl file using an InputStream, but you can use also URIs. 
            owlModel = ProtegeOWL.createJenaOWLModelFromInputStream(is);
            System.out.println(owlModel.getOWLSpecies());
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }    
 }