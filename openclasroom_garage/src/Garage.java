import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.garage.voitures.Vehicule;
 
 
public class Garage {
     
    private List<Vehicule> voitures =  new ArrayList<Vehicule>();
    private static String file = "Garage.ser";
    ObjectInputStream ois;
    ObjectOutputStream oos;
    //constructeur
    @SuppressWarnings("unchecked")
	public Garage(){
        super(); 
        //On regarde si un fichier garage existe
        try{  
        	// Lecture de "Garage.ser" et création des instances
            ois = new ObjectInputStream(
                    new BufferedInputStream(
                            new FileInputStream(file)));
            try{            
            	// On complète la liste des voirues
                voitures=(List<Vehicule>)ois.readObject();
            } catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (FileNotFoundException e) {
			}
            //On oublie ferme  le flux !
            finally{
                try{
                    if(ois != null){
                        ois.close();
                    }
                }catch(final IOException e){
                    e.printStackTrace();
                }
            }
        }catch(FileNotFoundException e1){  // On gère l'affichage si le fichier "Garage.ser" n'existe pas
            System.out.println("Aucune voiture sauvegardée");
        } catch (final java.io.IOException e1) {  // On gère l'affichage si le fichier "Garage.ser" est vide
        	System.out.println("Aucune voiture sauvegardée");
        }
    }
     
    public void addVoiture(Vehicule voit){
         // Ajout de la voiture à la liste actuelle (qui présente déjà les objets écrits dans le fichier)
        voitures.add(voit);
        // On ouvre le fichier "Garage.ser" en mode écriture.
        try{
            oos = new ObjectOutputStream(
                    new BufferedOutputStream(
                            new FileOutputStream(file)));
             // On enregistre la liste de voitures dans le fichier
            oos.writeObject(voitures);
        }catch(FileNotFoundException e1){
            e1.printStackTrace();
        } catch (final java.io.IOException e1) {
            e1.printStackTrace();
        }finally{
        	// flush() : permet de vider les buffers d'écriture vers le médium de sortie.
        	// Puis on ferme le flux
            try {
                if (oos != null) {
                    oos.flush();
                    oos.close();
                }
              } catch (final IOException ex) {
                ex.printStackTrace();
              }
        }       
    }
     
    public String toString(){
        String str = "";
        str += "***************************\n";
        str += "*  Garage OpenClassrooms  *\n";
        str += "***************************\n";
        int nb_voitures = voitures.size(); 
        for (int i = 0; i < nb_voitures; i++) {
          str+=(voitures.get(i).toString()) + "\n";
        }
        return str;
    }
 
}