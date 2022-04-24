package homework5;

import java.util.Arrays;

public class MainForAppDate {
    public static void main(String[] args) {
        //File file = new File("customers.cvs");

       /*ArrayList<AppData> customers = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("customers.cvc"))) {
            String tempString; //для временного сохранения чтения
            while ((tempString = bufferedReader.readLine()) != null) {
                String[] customersParamsArray = tempString.split(" ");
                customers.add(new AppData(new String[]{customersParamsArray[0]}, Integer.parseInt(customersParamsArray[1])));
            }
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(customers);

        try (PrintWriter printWriter = new PrintWriter("new_students.csv")) {
            for (AppData appData : customers) {
                printWriter.println(appData.toString());
            }
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        }

*/
        AppData appData = new AppData();
        appData.load("customers.cvc");

        System.out.println(Arrays.toString(appData.getName()));
        System.out.println(Arrays.deepToString(appData.getData()));

        appData.save("customers2.cvc");


    }
}
