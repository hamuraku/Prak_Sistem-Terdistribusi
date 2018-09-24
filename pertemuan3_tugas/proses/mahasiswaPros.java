package bab3.proses;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 * Bismillahirrahmanirrahim.
 *
 * @author Muhammad Ramadhani K
 */
public class mahasiswaPros {

    public void serialize(List<mahasiswa> mlist, String filename) {
        
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
            
            out.writeObject(mlist);
            
        } catch (IOException e) {
            
            System.err.println(e.getMessage());
            
        }
        
    }

    public List<mahasiswa> deserialize(String filename) {

        List<mahasiswa> mlist = null;
        
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
            
            mlist = (List<mahasiswa>) in.readObject();
            
        } catch (IOException | ClassNotFoundException e) {
            
            System.err.println(e.getMessage());
            
        }
        
        return mlist;
        
    }

    public void add(int nim, String nama, String asal, String kelas, List<mahasiswa> data) {
        
        data.add(new mahasiswa(nim, nama, asal, kelas));
        
    }

    public void remove(ArrayList<mahasiswa> data, int nim, Iterator<mahasiswa> it) {
        
        it = data.iterator();
        while (it.hasNext()) {
            
            mahasiswa mhs = it.next();
            
            if (String.valueOf(mhs.getNim()).equals(Integer.toString(nim))) {
                it.remove();
            }
            
        }
        
    }

    public void update(ArrayList<mahasiswa> data, int nim, Iterator<mahasiswa> it) {
        
        it = data.iterator();

        while (it.hasNext()) {
            
            mahasiswa mhs = it.next();
            
            if (String.valueOf(mhs.getNim()).equals(Integer.toString(nim))) {
                it.remove();
                break;
            }
            
        }
        
    }

    public void set(ArrayList<mahasiswa> data, int nim, String nama, String asal, String kelas, mahasiswa mhs) {
        
        for (mahasiswa item : data) {
            
            if (Integer.toString(item.getNim()).equals(Integer.toString(nim))) {
                
                int index = data.indexOf(item);
                data.set(index, new mahasiswa(nim, nama, asal, kelas));
                break;
                
            }
            
        }
        
    }

    public void update(ArrayList<mahasiswa> data, int index, int nim, String nama, String asal, String kelas) {
        data.set(index, new mahasiswa(nim, nama, asal, kelas));
    }

    public void show(ArrayList<mahasiswa> data, int index) {
        data.get(index);
    }

    public void deletedatatable(DefaultTableModel model) {
        model.setRowCount(0);
    }

    public void save(ArrayList<mahasiswa> data, String locationToSave) {
        serialize(data, locationToSave);
    }

    public void open(String locationToSave) {
        deserialize(locationToSave);
    }

    public void show(List<mahasiswa> data) {
        System.out.println(data);
    }

    public void showconsolearray(List<mahasiswa> data) {
        System.out.println("Mahasiswa " + data);
    }

}
