/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package model;


import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author Rushabh
 */
public class Product {
    
    private String name;
    private int price;
    private int id;
    private ImageIcon logoPhoto;
    
    private ArrayList<Feature> features;

    private static int count = 0;
    
    public Product() {
        count++;
        id = count;
        features = new ArrayList<>();
        
    }

    public ArrayList<Feature> getFeatures() {
        return features;
    }

    public void setFeatures(ArrayList<Feature> features) {
        this.features = features;
    }

    public ImageIcon getLogoPhoto() {
        return logoPhoto;
    }

    public void setLogoPhoto(ImageIcon logoPhoto) {
        this.logoPhoto = logoPhoto;
    }

    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }
    
    
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    
    @Override
    public String toString() {
        return name;
    }

    public Feature addNewFeature() {
      Feature newFeature = new Feature(this);
      features.add(newFeature);
      return newFeature;
      
    }
    
}
