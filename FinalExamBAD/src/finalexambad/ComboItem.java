/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalexambad;

/**
 *
 * @author faric
 */
import java.util.Objects;

public class ComboItem {
    private int id;
    private String nama;

    public ComboItem(int id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    @Override
    public String toString() {
        return nama;
    }

    public int getId() {
        return id;
    }
}
