# 📚 Personal Student Grade Tracker

A JavaFX desktop application designed for German students to track their academic performance across courses using both Secondary School (1-6) and High School (0-15 points) grading systems.

![Java](https://img.shields.io/badge/Java-21-blue.svg)
![JavaFX](https://img.shields.io/badge/JavaFX-21-blue.svg)
![Status](https://img.shields.io/badge/Status-In%20Development-yellow.svg)

## 🎯 Project Overview

This application allows students to manage their grades independently, calculate their GPA, and visualize their academic progress over time. It supports both German grading systems, making it suitable for students in Sekundarstufe I (Secondary School) and Oberstufe/Abitur (High School).

**Key Features:**
- ✅ Personal grade tracking across multiple courses
- ✅ Dual grading system support (1-6 scale & 0-15 points)
- ✅ Automatic GPA calculation
- ✅ Visual statistics and performance analytics
- ✅ Data persistence with automatic saving
- ✅ Clean, intuitive JavaFX interface

## 🖥️ Screenshots

*Coming soon as development progresses*

## 🛠️ Technologies Used

- **Java 21**: Core programming language
- **JavaFX 21**: GUI framework
- **JUnit 5**: Testing framework
- **Java Serialization**: Data persistence

## 📋 Prerequisites

Before running this application, ensure you have:

- Java Development Kit (JDK) 21 or higher
- JavaFX SDK 21 or higher
- IDE with JavaFX support (IntelliJ IDEA, Eclipse, or VS Code)

## 🚀 Installation & Setup

1. **Clone the repository**
   ```bash
   git clone https://github.com/moritzkohr/student-grade-tracker.git
   cd student-grade-tracker
   ```

2. **Configure JavaFX** (if not already configured in your IDE)
   - Download JavaFX SDK from [openjfx.io](https://openjfx.io/)
   - Add JavaFX libraries to your project build path
   - Add VM arguments: `--module-path /path/to/javafx-sdk/lib --add-modules javafx.controls,javafx.fxml`

3. **Build and Run**
   ```bash
   javac --module-path /path/to/javafx-sdk/lib --add-modules javafx.controls,javafx.fxml Main.java
   java --module-path /path/to/javafx-sdk/lib --add-modules javafx.controls,javafx.fxml Main
   ```

## 📖 How to Use

1. **First Launch**: Create your student profile with your name and school type
2. **Add Courses**: Click "Add Course" to register courses you're taking
3. **Enter Grades**: Select a course and add grades with optional descriptions
4. **View Statistics**: Check your dashboard for GPA, trends, and performance insights
5. **Track Progress**: Monitor your grade history and identify areas for improvement

### Grading Systems

**Secondary School (Sekundarstufe I)**
- Scale: 1 to 6
- 1 = Sehr gut (Excellent)
- 6 = Ungenügend (Insufficient)

**High School (Oberstufe/Abitur)**
- Scale: 0 to 15 points
- 15 = Sehr gut+ (Excellent+)
- 0 = Ungenügend (Insufficient)

## 🏗️ Project Structure

```
student-grade-tracker/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── com.protfolio.studentgradetracker/
|   |   |   |   ├──model/
│   │   │   │   |   ├── Student.java
│   │   │   │   |   ├── Course.java
│   │   │   │   |   ├── Grade.java
│   │   │   │   |   └── GradeCalculator.java
│   │   │   |   ├── controller/
│   │   │   │   |   ├── MainController.java
│   │   │   │   |   └── CourseViewController.java
│   │   │   |   └── util/
│   │   │   │       └── DataManager.java
│   │   │   └── Main.java
│   │   └── resources/
│   │       ├── fxml/
│   │       └── css/
│   └── test/
│       └── java/
└── README.md
```

## 🎓 Learning Outcomes

This project demonstrates proficiency in:
- **Object-Oriented Programming**: Classes, inheritance, encapsulation
- **JavaFX Development**: GUI design, controllers, event handling
- **Data Structures**: ArrayLists, collections management
- **File I/O**: Serialization and deserialization
- **Exception Handling**: Input validation and error management
- **Software Design**: MVC pattern, separation of concerns
- **Testing**: JUnit test cases for core functionality

## 🔄 Development Status

**Current Phase**: MVP Development

- [x] Project specification complete
- [ ] Core model classes (Student, Course, Grade)
- [ ] GPA calculation logic
- [ ] Data persistence implementation
- [ ] JavaFX UI design
- [ ] Controller implementation
- [ ] Input validation
- [ ] Statistics and analytics
- [ ] Testing suite
- [ ] Documentation

## 🐛 Known Issues

*No issues yet - project in initial development phase*

## 🚧 Future Enhancements

- Grade prediction calculator
- Semester/year organization
- Weighted grade categories
- PDF export functionality
- Grade goal tracking
- Performance comparison charts

## 👨‍💻 Author

**Moritz R. Kohr**
- LinkedIn: [Moritz R. Kohr](www.linkedin.com/in/moritz-r-kohr-b4a921333)
- Email: moritz.kohr@mail.de

## 🙏 Acknowledgments

- Developed as part of my Java learning journey
- Inspired by the need for simple grade tracking tools for students
- Thanks to the JavaFX community for excellent documentation

---

*This is a portfolio project created to demonstrate Java and JavaFX development skills. Feel free to explore the code and provide feedback!*