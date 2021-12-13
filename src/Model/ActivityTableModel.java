/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author meky
 */
public class ActivityTableModel extends AbstractTableModel {

    private String[] columnNames = {"Activity Name", "Capacity", "Description"};

    private List<Activity> activityList;

    public ActivityTableModel(List<Activity> activityList) {
        this.activityList = activityList;

    }

    @Override
    public int getRowCount() {
        return activityList.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIdx, int colIdx) {
        switch (colIdx) {
            case 0:
                return (Object) activityList.get(rowIdx).getName();
            case 1:
                return (Object) activityList.get(rowIdx).getCapacity();
            case 2:
                return (Object) activityList.get(rowIdx).getDescription();
            default:
                return null;
        }

    }

    @Override
    public String getColumnName(int col) {
        return columnNames[col];
    }
}
