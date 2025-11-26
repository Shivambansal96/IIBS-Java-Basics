# ☕ Java Basics – IIBS Training

<div align="center">

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Status](https://img.shields.io/badge/Status-Active%20Learning-success?style=for-the-badge)
![Students](https://img.shields.io/badge/IIBS-Students-blue?style=for-the-badge)
![Progress](https://img.shields.io/badge/Progress-50%25-orange?style=for-the-badge)

### 🚀 *Master Java Programming from Scratch!*

**Welcome to your comprehensive Java learning journey!**  
Everything you need to become a confident Java developer, explained with crystal-clear examples.

[📚 Start Learning](#-learning-path) • [💻 Practice](#-exercises--practice) • [📝 Assignments](#-assignments) • [🎯 What's Next](#-whats-coming-next)

---

</div>

## 🎯 Quick Navigation

<table>
<tr>
<td width="33%" align="center">

### 📖 **Fundamentals**
Learn the core concepts

[Jump to Topics →](#-topics-covered)

</td>
<td width="33%" align="center">

### 💪 **Practice**
Sharpen your skills

[View Exercises →](#-exercises--practice)

</td>
<td width="33%" align="center">

### 🏆 **Assignments**
Test your knowledge

[See Assignments →](#-assignments)

</td>
</tr>
</table>

---

## 📊 Learning Progress

```
Completed Topics:
████████████████░░░░░░░░░░░░░░░░ 50%

✅ JDK, JRE & JVM
✅ Output Methods
✅ Variables
✅ Data Types
✅ User Input (Scanner)
✅ Operators
✅ Conditional Statements
⏳ Loops
⏳ Strings & Characters
⏳ Arrays
⏳ Functions/Methods
⏳ HackerRank Challenges
```

---

## 🗺️ Learning Path

```mermaid
graph LR
    A[🌱 Setup] --> B[📝 Basics]
    B --> C[🔢 Data & Variables]
    C --> D[⚙️ Operators]
    D --> E[🔀 Conditionals]
    E --> F[🔄 Loops]
    F --> G[📚 Arrays]
    G --> H[🎯 Functions]
    H --> I[🏆 HackerRank]
    
    style A fill:#90EE90
    style B fill:#90EE90
    style C fill:#90EE90
    style D fill:#90EE90
    style E fill:#90EE90
    style F fill:#FFD700
    style G fill:#FFD700
    style H fill:#FFD700
    style I fill:#FFD700
```

---

## 📚 Topics Covered

<details open>
<summary><h3>🔧 1. JDK, JRE & JVM - The Foundation</h3></summary>

> **Understanding how Java works under the hood**

```
┌─────────────────────────────────────────┐
│              JDK (Dev Kit)              │
│  ┌───────────────────────────────────┐  │
│  │        JRE (Runtime Env)          │  │
│  │  ┌─────────────────────────────┐  │  │
│  │  │     JVM (Virtual Machine)   │  │  │
│  │  │   - Executes Bytecode       │  │  │
│  │  │   - Platform Independent    │  │  │
│  │  └─────────────────────────────┘  │  │
│  │  + Java Libraries                 │  │
│  └───────────────────────────────────┘  │
│  + Compiler (javac)                     │
│  + Development Tools                    │
└─────────────────────────────────────────┘
```

| Component | Purpose | When You Need It |
|:---------:|:--------|:-----------------|
| **JDK** 🛠️ | Development Kit | Writing & compiling Java code |
| **JRE** ▶️ | Runtime Environment | Running Java applications |
| **JVM** 🖥️ | Virtual Machine | Executing bytecode |

**💡 Key Concept:** `.java` → **(compile)** → `.class` → **(JVM)** → **Execution**

</details>

<details open>
<summary><h3>🖨️ 2. Output in Java - Talking to the User</h3></summary>

```java
// Print with new line
System.out.println("Hello, Java World! 🌍");

// Print without new line
System.out.print("Welcome ");
System.out.print("to ");
System.out.println("Java!");

// Formatted output
System.out.printf("Name: %s, Age: %d%n", "Aarav", 20);
```

**🎨 Escape Sequences:**
- `\n` - New line
- `\t` - Tab space
- `\"` - Double quote
- `\\` - Backslash

</details>

<details open>
<summary><h3>📦 3. Variables - Storing Information</h3></summary>

> **Variables are containers that hold data**

```java
// Declaring and initializing variables
int age = 20;                    // Integer
String name = "Priya";           // Text
double cgpa = 8.7;               // Decimal
boolean isStudent = true;        // True/False
char grade = 'A';                // Single character
```

**📌 Naming Rules:**
- ✅ Start with letter, `$`, or `_`
- ✅ Use camelCase: `studentName`, `totalMarks`
- ❌ Can't use Java keywords: `int`, `class`, etc.
- ❌ Can't start with numbers

**Example:**
```java
int marks = 85;
marks = 90;  // Updating value
System.out.println("Updated marks: " + marks);
```

</details>

<details open>
<summary><h3>🎲 4. Data Types - Different Kinds of Data</h3></summary>

### **Primitive Types** (8 types)

| Type | Size | Range | Example |
|:----:|:----:|:------|:--------|
| `byte` | 1 byte | -128 to 127 | `byte age = 25;` |
| `short` | 2 bytes | -32K to 32K | `short year = 2025;` |
| `int` | 4 bytes | -2B to 2B | `int population = 1000000;` |
| `long` | 8 bytes | Very large | `long distance = 1234567890L;` |
| `float` | 4 bytes | Decimal | `float price = 99.99f;` |
| `double` | 8 bytes | Precise decimal | `double pi = 3.14159265359;` |
| `char` | 2 bytes | Single character | `char initial = 'A';` |
| `boolean` | 1 bit | true/false | `boolean passed = true;` |

### **Non-Primitive Types**

```java
String name = "Java Programming";    // Text
int[] numbers = {1, 2, 3, 4, 5};    // Array
```

**💡 Pro Tip:** Use `int` for whole numbers, `double` for decimals, `String` for text!

</details>

<details open>
<summary><h3>⌨️ 5. Taking Input - Interactive Programs</h3></summary>

```java
import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Taking different types of input
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        
        System.out.print("Enter your CGPA: ");
        double cgpa = sc.nextDouble();
        
        System.out.println("\n📋 Your Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("CGPA: " + cgpa);
        
        sc.close();
    }
}
```

**🔑 Scanner Methods:**

| Method | Data Type | Example |
|:-------|:----------|:--------|
| `nextInt()` | Integer | `int num = sc.nextInt();` |
| `nextDouble()` | Decimal | `double price = sc.nextDouble();` |
| `nextLine()` | String (full line) | `String text = sc.nextLine();` |
| `next()` | String (single word) | `String word = sc.next();` |
| `nextBoolean()` | Boolean | `boolean flag = sc.nextBoolean();` |

**⚠️ Important:** `next()` reads only one word, `nextLine()` reads the entire line!

</details>

<details open>
<summary><h3>⚙️ 6. Operators - Performing Operations</h3></summary>

### **🔢 Arithmetic Operators**
```java
int a = 10, b = 3;
System.out.println(a + b);  // Addition: 13
System.out.println(a - b);  // Subtraction: 7
System.out.println(a * b);  // Multiplication: 30
System.out.println(a / b);  // Division: 3
System.out.println(a % b);  // Modulus (Remainder): 1
```

### **🔍 Relational Operators**
```java
int x = 5, y = 10;
System.out.println(x == y);  // Equal to: false
System.out.println(x != y);  // Not equal: true
System.out.println(x > y);   // Greater than: false
System.out.println(x < y);   // Less than: true
System.out.println(x >= 5);  // Greater or equal: true
System.out.println(y <= 10); // Less or equal: true
```

### **🧠 Logical Operators**
```java
boolean result1 = (5 > 3) && (8 > 5);  // AND: true
boolean result2 = (5 > 3) || (8 < 5);  // OR: true
boolean result3 = !(5 > 3);            // NOT: false
```

### **📝 Assignment Operators**
```java
int num = 10;
num += 5;   // num = num + 5  → 15
num -= 3;   // num = num - 3  → 12
num *= 2;   // num = num * 2  → 24
num /= 4;   // num = num / 4  → 6
num %= 4;   // num = num % 4  → 2
```

### **⬆️⬇️ Unary Operators**
```java
int count = 5;
count++;        // Post-increment: count = 6
++count;        // Pre-increment: count = 7
count--;        // Post-decrement: count = 6
--count;        // Pre-decrement: count = 5

// Difference example
int a = 5;
int b = a++;    // b = 5, then a = 6
int c = ++a;    // a = 7, then c = 7
```

</details>

<details open>
<summary><h3>🔀 7. Conditional Statements - Making Decisions</h3></summary>

### **🎯 if Statement**
```java
int marks = 75;
if (marks >= 40) {
    System.out.println("✅ You passed!");
}
```

### **🔄 if-else Statement**
```java
int age = 17;
if (age >= 18) {
    System.out.println("🎉 Eligible to vote!");
} else {
    System.out.println("⏳ Not eligible yet.");
}
```

### **🎚️ if-else-if Ladder**
```java
int score = 85;
if (score >= 90) {
    System.out.println("🌟 Grade: A+");
} else if (score >= 80) {
    System.out.println("⭐ Grade: A");
} else if (score >= 70) {
    System.out.println("✨ Grade: B");
} else if (score >= 60) {
    System.out.println("📝 Grade: C");
} else {
    System.out.println("📚 Need more practice!");
}
```

### **🎛️ switch Statement**
```java
int day = 3;
switch (day) {
    case 1:
        System.out.println("Monday 📅");
        break;
    case 2:
        System.out.println("Tuesday 📅");
        break;
    case 3:
        System.out.println("Wednesday 📅");
        break;
    case 4:
        System.out.println("Thursday 📅");
        break;
    case 5:
        System.out.println("Friday 📅");
        break;
    case 6:
    case 7:
        System.out.println("Weekend! 🎉");
        break;
    default:
        System.out.println("Invalid day ❌");
}
```

### **⚡ Ternary Operator (Shortcut)**
```java
int a = 10, b = 20;
int max = (a > b) ? a : b;  // max = 20
String result = (marks >= 40) ? "Pass ✅" : "Fail ❌";
```

**💡 When to use what:**
- `if-else` → 2-3 conditions
- `if-else-if` → Multiple ranges
- `switch` → Checking exact values
- `ternary` → Quick one-line decisions

</details>

---

## 💪 Exercises & Practice

### 🎨 **Level 1: Warm-Up** (Basic Printing)

```java
// Exercise 1.1 - Personal Info Card
System.out.println("╔════════════════════════╗");
System.out.println("║   STUDENT INFO CARD    ║");
System.out.println("╠════════════════════════╣");
System.out.println("║ Name: [Your Name]      ║");
System.out.println("║ College: IIBS          ║");
System.out.println("║ Course: Java Basics    ║");
System.out.println("╚════════════════════════╝");
```

**Practice:**
1. Create a colorful ASCII banner with your name
2. Print a pattern of stars forming a triangle
3. Design a simple menu card

---

### 🎯 **Level 2: Variables** (Beginner)

**Challenge 2.1 - Variable Swap**
```java
// Swap two numbers WITHOUT using a third variable
int a = 5, b = 10;
// Your code here
System.out.println("a = " + a + ", b = " + b);
```

**Practice:**
1. Store and print details of your favorite book
2. Calculate the area of a rectangle using variables
3. Swap three variables: a→b, b→c, c→a

---

### 🔢 **Level 3: Data Types** (Beginner)

**Challenge 3.1 - Data Type Explorer**
```java
// Store your details in appropriate data types
// Name, Age, Height(m), Weight(kg), City, IsStudent
// Print them in a formatted way
```

**Practice:**
1. Compare precision: `float` vs `double`
2. Demonstrate integer overflow with `byte`
3. Create a profile card with mixed data types

---

### ⌨️ **Level 4: Scanner** (Intermediate)

**Challenge 4.1 - Simple Calculator**
```java
// Take two numbers from user
// Display their sum, difference, product, and quotient
```

**Practice:**
1. BMI Calculator (take weight and height)
2. Temperature Converter (Celsius ↔ Fahrenheit)
3. Student Report Card (input marks, calculate percentage)

---

### ⚙️ **Level 5: Operators** (Intermediate)

**Challenge 5.1 - Number Magic**
```java
// Take a number
// Print: original, square, cube, square root
// Check if even/odd
// Check if positive/negative
```

**Practice:**
1. Check if number is divisible by both 3 and 5
2. Demonstrate pre/post increment difference
3. Create a compound interest calculator

---

### 🔀 **Level 6: Conditionals** (Advanced)

**Challenge 6.1 - Grade System**
```java
// Input: Student marks (0-100)
// Output: Grade + Remarks
// 90-100: A+ "Outstanding!"
// 80-89:  A  "Excellent!"
// 70-79:  B  "Good Job!"
// 60-69:  C  "Keep Going!"
// 40-59:  D  "Need Improvement"
// 0-39:   F  "Failed"
```

**Practice:**
1. Leap Year Checker
2. Day of Week using Switch
3. Electricity Bill Calculator (slab system)
4. Login System (username & password)
5. Triangle Validator (valid/invalid based on sides)

---

## 📝 Assignments

### 📋 **Assignment 1: Java Basics**
**Deadline:** [Add Date]  
**Difficulty:** ⭐☆☆☆☆

```
Create a Java program that displays:
╔═══════════════════════════════════════╗
║  Welcome to Java Programming at IIBS!  ║
║  🎓 Where Learning Meets Excellence     ║
╚═══════════════════════════════════════╝
```

---

### 📋 **Assignment 2: Data Handling**
**Deadline:** [Add Date]  
**Difficulty:** ⭐⭐☆☆☆

**Create a Student Information System that:**
1. Takes input: Name, Roll No, 3 subject marks
2. Calculates total and percentage
3. Displays everything in a formatted table

**Expected Output:**
```
╔════════════════════════════════════╗
║      STUDENT REPORT CARD           ║
╠════════════════════════════════════╣
║ Name    : [Input]                  ║
║ Roll No : [Input]                  ║
║ Marks   : [M1] [M2] [M3]           ║
║ Total   : [Calculate]              ║
║ Percent : [Calculate]%             ║
╚════════════════════════════════════╝
```

---

### 📋 **Assignment 3: Decision Making**
**Deadline:** [Add Date]  
**Difficulty:** ⭐⭐⭐☆☆

**Create a "Smart Calculator" with Menu:**

```java
=================================
     SMART CALCULATOR MENU
=================================
1. Add
2. Subtract
3. Multiply
4. Divide
5. Find Maximum
6. Find Minimum
7. Check Even/Odd
8. Exit
=================================
Enter your choice: 
```

**Requirements:**
- Use switch statement for menu
- Take two numbers as input
- Perform operation based on choice
- Handle division by zero
- Show appropriate messages

---

## 🎯 What's Coming Next

<table>
<tr>
<td align="center" width="20%">
<img src="https://img.icons8.com/fluency/96/loop.png" width="60"><br>
<b>Loops</b><br>
<sub>for, while, do-while</sub>
</td>
<td align="center" width="20%">
<img src="https://img.icons8.com/fluency/96/text.png" width="60"><br>
<b>Strings</b><br>
<sub>Text manipulation</sub>
</td>
<td align="center" width="20%">
<img src="https://img.icons8.com/fluency/96/a-lowercase.png" width="60"><br>
<b>Characters</b><br>
<sub>Char operations</sub>
</td>
<td align="center" width="20%">
<img src="https://img.icons8.com/fluency/96/stack.png" width="60"><br>
<b>Arrays</b><br>
<sub>Data collections</sub>
</td>
<td align="center" width="20%">
<img src="https://img.icons8.com/fluency/96/software-box.png" width="60"><br>
<b>Functions</b><br>
<sub>Reusable code</sub>
</td>
</tr>
</table>

### 🏆 **Final Challenge: HackerRank Coding**
Master problem-solving with real coding challenges!

---

## 📖 Additional Resources

<table>
<tr>
<td>

### 🎥 Video Tutorials
- [Java Full Course - FreeCodeCamp](https://www.youtube.com/watch?v=grEKMHGYyns)
- [Java Programming by Apna College](https://www.youtube.com/playlist?list=PLfqMhTWNBTe3LtFWcvwpqTkUSlB32kJop)

</td>
<td>

### 📚 Practice Platforms
- [HackerRank Java](https://www.hackerrank.com/domains/java)
- [LeetCode Easy Problems](https://leetcode.com/)
- [CodingBat Java](https://codingbat.com/java)

</td>
</tr>
<tr>
<td>

### 📖 Documentation
- [Official Java Docs](https://docs.oracle.com/en/java/)
- [W3Schools Java](https://www.w3schools.com/java/)
- [GeeksforGeeks Java](https://www.geeksforgeeks.org/java/)

</td>
<td>

### 💡 Tips & Tricks
- Practice daily (consistency > intensity)
- Debug code line by line
- Comment your code
- Join study groups

</td>
</tr>
</table>

---

## 🤝 Need Help?

<div align="center">

### Got stuck? Don't worry!

**💬 Ask Questions** | **🐛 Report Issues** | **💡 Share Ideas**

Remember: *Every expert was once a beginner!*

---

### 🌟 **Keep Coding, Keep Growing!** 🌟

<br>

<div align="center" style="background: linear-gradient(135deg, #667eea 0%, #764ba2 100%); padding: 20px; border-radius: 15px;">

### ✨ Created By ✨

<h1 style="font-size: 3em; margin: 10px 0; background: linear-gradient(45deg, #FFD700, #FFA500, #FF6347); -webkit-background-clip: text; -webkit-text-fill-color: transparent; text-shadow: 2px 2px 4px rgba(0,0,0,0.3);">
  
## <a href="https://whatsapp.com/channel/0029Vb74kBaL2ATzZBnRka19" target="_blank" >✨ **Shine_Beyond_Syntax** ✨</a>

</h1>

<!-- <p style="font-size: 1.2em; color: #fff; margin: 15px 0;">
  <em>Empowering IIBS Students to Master Java</em>
</p> -->

<br>

[![WhatsApp Channel](https://img.shields.io/badge/Join%20My-WhatsApp%20Channel-25D366?style=for-the-badge&logo=whatsapp&logoColor=white)](https://whatsapp.com/channel/0029Vb74kBaL2ATzZBnRka19)

<!-- <p style="margin-top: 15px;">
  <a href="https://whatsapp.com/channel/0029Vb74kBaL2ATzZBnRka19">
    <img src="https://img.icons8.com/color/48/whatsapp--v1.png" alt="WhatsApp" width="40"/>
  </a>
  <span style="font-size: 2.1em; color: #fff; margin: 0 10px;">Connect with us for updates, tips & support!</span>
</p> -->

<br>

<!-- <sub>Made with 💜 passion, ☕ coffee, and endless dedication</sub> -->

</div>

<br>

---

![Java](https://img.shields.io/badge/Built%20with-Java-orange?style=flat-square&logo=openjdk)
![Learning](https://img.shields.io/badge/Always-Learning-blue?style=flat-square)
![IIBS](https://img.shields.io/badge/IIBS-Excellence-green?style=flat-square)

</div>
