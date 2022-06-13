/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import model.Cat;
import model.MyColor;

/**
 *
 * @author ppolo
 */
public class CatServices {

    private List<Cat> cats;

    public CatServices() {
        cats = new ArrayList<>();
    }

    private void fake5Data() {
        cats.add(new Cat(1, "Tom", BigDecimal.valueOf(500000), 3, MyColor.BLUE, 3.5f));
        cats.add(new Cat(2, "Cat34", BigDecimal.valueOf(600000), 4, MyColor.BLACK, 4.2f));
        cats.add(new Cat(3, "Mane Coon", BigDecimal.valueOf(750000), 2, MyColor.GRAY, 3.8f));
        cats.add(new Cat(4, "Bengal", BigDecimal.valueOf(890000), 1, MyColor.YELLOW, 3.5f));
        cats.add(new Cat(5, "Sphyx", BigDecimal.valueOf(1000000), 5, MyColor.WHITE, 4f));
    }

    public void addCat(Cat cat) {
        cats.add(cat);
    }

    public List<Cat> getAll() {
        return cats;
    }

    public int findCat(int id) {
        for(int i = 0; i < cats.size(); i++){
            if(cats.get(i).getCatId() == id){
                return i;
            }
        }
        return -1;
    }

    public void deleteCat(int id) {
        int x = findCat(id);
        if (x != -1) {
            cats.remove(x);
        }
    }

    public void updateCat(Cat cat) {
        int id = cat.getCatId();
        int x = findCat(id);
        if(x != -1){
            cats.get(x).setCatName(cat.getCatName());
            cats.get(x).setMyColor(cat.getMyColor());
            cats.get(x).setPrice(cat.getPrice());
            cats.get(x).setQuantity(cat.getQuantity());
            cats.get(x).setWeight(cat.getWeight());
        }        
        
    }

    public void saveFile(List<Cat> cats) throws IOException {

        FileWriter fw = new FileWriter("w_PH19428.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        for (Cat cat : cats) {
            bw.write(cat + "");
        }

        bw.close();
        fw.close();

    }

    public void readFile() throws IOException {
        FileReader fr = new FileReader("w_PH19428.txt");
        BufferedReader br = new BufferedReader(fr);

        String line;
        cats.clear();
        while ((line = br.readLine()) != null) {
            String[] atrb = line.split(", ");
            cats.add(new Cat(Integer.parseInt(atrb[0].substring(7)),
                    atrb[1].substring(9),
                    BigDecimal.valueOf(Double.parseDouble(atrb[2].substring(7))),
                    Integer.parseInt(atrb[3].substring(10)),
                    MyColor.valueOf(atrb[4].substring(7)),
                    Float.parseFloat(atrb[5].substring(8))));
        }

    }

}
