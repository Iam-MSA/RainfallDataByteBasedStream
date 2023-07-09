package rainfall;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * The RainfallDataConsumer class is responsible for reading the generated rainfall data
 * from the binary file using DataInputStream and displaying the data and average rainfall.
 */
public class RainfallDataInputStream {
    /**
     * The main method reads the rainfall data from the binary file, computes the average rainfall,
     * and displays the data and average.
     *
     * @param args the command line arguments (not used)
     */
    public static void main(String[] args) {
        String fileName = "rainfall_data.bin"; // File location

        try (DataInputStream dis = new DataInputStream(new FileInputStream(fileName))) {
            int numDistricts = dis.readInt();

            System.out.println("Number of Districts: " + numDistricts);
            System.out.println("--------------------------------------");

            for (int i = 0; i < numDistricts; i++) {
                int districtId = dis.readInt();
                String districtName = dis.readUTF();
                int numStations = dis.readInt();

                System.out.println("District ID: " + districtId);
                System.out.println("District Name: " + districtName);
                System.out.println("Number of Stations: " + numStations);
                System.out.println();

                for (int j = 0; j < numStations; j++) {
                    int stationId = dis.readInt();
                    String stationName = dis.readUTF();
                    int[] rainfallData = new int[6];

                    System.out.println("Station ID: " + stationId);
                    System.out.println("Station Name: " + stationName);
                    System.out.println("Rainfall Data: ");

                    for (int k = 0; k < 6; k++) {
                        rainfallData[k] = dis.readInt();
                        System.out.println("Day " + (k + 1) + ": " + rainfallData[k]);
                    }

                    int averageRainfall = computeAverageRainfall(rainfallData);
                    System.out.println("Average Rainfall: " + averageRainfall);
                    System.out.println();
                    System.out.println("--------------------------------------");
                    System.out.println();

                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Computes the average rainfall from the given rainfall data.
     *
     * @param rainfallData an array of rainfall data
     * @return the average rainfall
     */
    private static int computeAverageRainfall(int[] rainfallData) {
        int sum = 0;
        for (int rainfall : rainfallData) {
            sum += rainfall;
        }
        return sum / rainfallData.length;
    }
}
