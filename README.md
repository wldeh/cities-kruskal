# Kruskal's Algorithm for MST: Java Implementation

<img src="banner.jpg" alt="Project Logo" width="300" height="300"/>

## Badges

![Java Version](https://img.shields.io/badge/java-v1.8+-blue.svg)
![Build Status](https://img.shields.io/badge/build-passing-brightgreen.svg)
![Contributions Welcome](https://img.shields.io/badge/contributions-welcome-orange.svg)
![License](https://img.shields.io/badge/license-MIT-green.svg)

## Table of Contents

- [Features](#features)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)
  - [Running the Project](#running-the-project)
- [Usage](#usage)
- [License](#license)

## Features

- Implementation of Kruskal's algorithm using the Disjoint Set Union (DSU) data structure.
- Input customization through `WeightedEdgesCities.txt`, allowing for various graph configurations.
- Interactive Graphical User Interface (GUI) for simplified algorithm visualization and interaction.
- Comprehensive documentation and Javadocs for enhanced understanding and adoption.

## Getting Started

### Prerequisites

- JDK >= 1.8 referred to by the `JAVA_HOME` environment variable.

### Installation

1. Clone the repository to your local machine:
   ```
   git clone https://github.com/wldeh/cities-kruskal.git
   ```
2. Navigate to the project directory:
   ```
   cd cities-kruskal
   ```

### Running the Project

To run this project in IntelliJ IDEA, follow these steps:

1. Open IntelliJ IDEA and select "Open" or "Import" project.
2. Navigate to the project's root directory that you've cloned and open it.
3. IntelliJ IDEA should automatically detect the project's structure. If required, set the JDK version to 1.8 or higher in Project Structure (`File > Project Structure > Project`).
4. Locate the `main` method inside the project, which is typically found in a class with a name indicating its role as the entry point of the application.
5. Right-click on the file containing the `main` method and select "Run 'ClassName.main()'" to compile and run the project.

## Usage

After launching the application, the GUI will guide you through loading graphs from the `WeightedEdgesCities.txt` file or any other custom file adhering to the specified format. The program then calculates and displays the MST along with its total weight, showcasing Kruskal's algorithm in action.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.