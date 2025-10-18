# Java CI/CD Simulation using GitHub Actions and Google Colab

## 📘 Overview
This project demonstrates a simple CI/CD simulation for a Java program using Google Colab and GitHub Actions.

---

## ⚙️ Workflow Steps
1. Write and run Java code in Google Colab  
2. Push code to GitHub  
3. GitHub Actions automatically compiles and tests Java files  

---

## 🧩 Focus Areas
| Focus Area | Implementation |
|-------------|----------------|
| Source Control | GitHub |
| Build Automation | Java compile |
| Automated Testing | Simple test class |
| Continuous Integration | GitHub Actions |
| Feedback | Workflow logs |

---

## 🧱 Tools Used
- Google Colab (Code execution)
- GitHub (Version control)
- GitHub Actions (Automation)
- Java 17

---

## 🧑‍💻 How to Run in Colab
```bash
!apt-get install openjdk-17-jdk-headless -qq > /dev/null
%%writefile App.java
public class App {
    public static void main(String[] args) {
        System.out.println("Hello from CI/CD Simulation!");
    }
}
!javac App.java
!java App
