package homework5;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class AppData {
    private String[] name;
    private Integer[][] data;

    public AppData() {

    }

    public String[] getName() {
        return name;
    }

    public void setName(String[] name) {
        this.name = name;
    }

    public Integer[][] getData() {
        return data;
    }

    public void setData(Integer[][] data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "AppData{" +
                "name=" + Arrays.toString(name) +
                ", data=" + Arrays.toString(data) +
                '}';
    }

    public void save(String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(rowToString(name));

            for (Integer[] row : data) {
                writer.write(rowToString(row));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private <T> String rowToString(T[] row) {
        String result = " ";

        for (int i = 0; i < row.length; i++) {
            result = result + row[i].toString();
            if (i != row.length - 1) {
                result += ";";
            }
        }
        result += "\n";
        return result;

    }

    public void load(String fileName) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            name = bufferedReader.readLine().split(";");
            ArrayList<Integer[]> dataList = new ArrayList<>();
            String tempString;
            while ((tempString = bufferedReader.readLine()) != null) {
                dataList.add(stringToDataRow(tempString));
            }
            data = dataList.toArray(new Integer[][]{{}});
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private Integer[] stringToDataRow(String str) {
        String[] strings = str.split(";");


        Integer[] integers = new Integer[strings.length];
        for (int i = 0; i < strings.length; i++) {
            integers[i] = Integer.parseInt(strings[i]);
        }
        return integers;


    }
}
