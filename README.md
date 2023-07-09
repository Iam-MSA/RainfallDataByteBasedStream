# Rainfall Data Processing

This project demonstrates the processing of rainfall data using byte-based streams in Java. It includes two classes: `RainfallDataOutputStream` and `RainfallDataInputStream`. The `RainfallDataOutputStream` class is responsible for generating rainfall data for two stations in each district in Melaka and storing it in a binary file using `DataOutputStream`. The `RainfallDataInputStream` class reads the generated rainfall data from the binary file using `DataInputStream`, calculates the average rainfall, and displays the data.

## Features

- Generate rainfall data for two stations in each district in Melaka.
- Store the generated data in a binary file.
- Read the rainfall data from the binary file.
- Calculate the average rainfall for each station.
- Display the rainfall data and average rainfall.

## Usage

1. Clone the repository:
https://github.com/IamMSA-01/RainfallDataByteBasedStream

2. Compile the Java classes:

   ```bash
   javac rainfall/*.java
   ```

3. Generate rainfall data and store it in a binary file:

   ```bash
   java rainfall.RainfallDataOutputStream
   ```

4. Read the rainfall data from the binary file and display the data and average rainfall:

   ```bash
   java rainfall.RainfallDataInputStream
   ```

## File Structure

The project has the following file structure:

```
├── rainfall
│   ├── RainfallDataInputStream.java
│   └── RainfallDataOutputStream.java
└── README.md
```

- `rainfall`: Contains the Java classes for rainfall data processing.
- `RainfallDataInputStream.java`: Reads the rainfall data from the binary file.
- `RainfallDataOutputStream.java`: Generates rainfall data and stores it in a binary file.
- `README.md`: Provides information about the project and instructions for usage.

## Contributing

Contributions to this project are welcome. If you find any issues or want to add new features, feel free to submit a pull request. Please ensure that your code follows the Java coding standards and includes appropriate documentation.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for more details.

## Contact

For any inquiries or suggestions, please contact [mirzashahidafridi@gmail.com].
