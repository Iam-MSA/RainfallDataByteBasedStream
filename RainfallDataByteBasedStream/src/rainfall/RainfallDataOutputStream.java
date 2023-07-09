package rainfall;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * The RainfallDataCreator class is responsible for creating a set of rainfall data
 * for two stations in each district in Melaka and storing it in a binary file using DataOutputStream.
 */
public class RainfallDataOutputStream {
    /**
     * The main method generates rainfall data for two stations in each district in Melaka
     * and stores it in a binary file.
     *
     * @param args the command line arguments (not used)
     */
    public static void main(String[] args) {
        String fileName = "rainfall_data.bin"; // File location

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName))) {
            // Write the number of districts
            dos.writeInt(3);

            // Write data for each district
            writeDistrictData(dos, 1, "Melaka Tengah");
            writeDistrictData(dos, 2, "Alor Gajah");
            writeDistrictData(dos, 3, "Jasin");

            System.out.println("Data Created successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Writes the rainfall data for a district to the DataOutputStream.
     *
     * @param dos          the DataOutputStream to write the data to
     * @param districtId   the ID of the district
     * @param districtName the name of the district
     * @throws IOException if an I/O error occurs while writing the data
     */
    private static void writeDistrictData(DataOutputStream dos, int districtId, String districtName) throws IOException {
        // Write the district ID and name
        dos.writeInt(districtId);
        dos.writeUTF(districtName);

        // Write the number of stations
        dos.writeInt(2);

        // Write data for each station
        writeStationData(dos, 1, "Station 1");
        writeStationData(dos, 2, "Station 2");
    }

    /**
     * Writes the rainfall data for a station to the DataOutputStream.
     *
     * @param dos        the DataOutputStream to write the data to
     * @param stationId  the ID of the station
     * @param stationName the name of the station
     * @throws IOException if an I/O error occurs while writing the data
     */
    private static void writeStationData(DataOutputStream dos, int stationId, String stationName) throws IOException {
        // Write the station ID and name
        dos.writeInt(stationId);
        dos.writeUTF(stationName);

        // Write the 6-day rainfall data
        for (int i = 0; i < 6; i++) {
            dos.writeInt(getRandomRainfall());
        }
    }

    /**
     * Generates a random rainfall value between 0 and 100.
     *
     * @return a random rainfall value
     */
    private static int getRandomRainfall() {
        return (int) (Math.random() * 101);
    }
}
