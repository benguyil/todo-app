# Task Manager CLI App

This project is a simple command-line task manager that allows users to create, track, and manage their tasks. It is designed for individual users who want to organize their to-do items, save them permanently, and interact through a text-based menu.

---

## Features

- Multiple users support (each with their own task list)
- Add new tasks with:
    - Title
    - Status (completed / not completed)
    - Due date
    - Notes
- View task list
- Update or delete tasks
- Tasks are saved to a JSON file for persistence

---

## How to Run

1. Open the project in IntelliJ IDEA (or your favorite Java IDE).
2. Navigate to the `Main` class.
3. Run the `main()` method.

The program will guide you through a simple menu to perform actions like:
- Add task
- List tasks
- Mark task as done
- Delete task
- Exit and save

---

## Project Structure

todo-app/
├── README.md
├── requirements.md
├── design.md
├── data.json # JSON-based persistent storage
└── src/
└── main/
└── java/
└── com/
└── yourname/
└── todo/
├── Main.java
├── model/
│ ├── User.java
│ └── Task.java
├── service/
│ └── TaskService.java
├── repository/
│ ├── TaskRepository.java
│ └── JsonTaskRepository.java
└── util/
└── JsonUtil.java


---

## Technologies Used

- Java 17+
- Jackson (for JSON serialization)
- IntelliJ IDEA (recommended)
- JDK (Java Development Kit)

---

## Notes

- No password or authentication is required — the app is designed to be simple and local.
- All task data is saved in `data.json` in the root directory.

---

## Future Improvements (Optional)

- Add user login with passwords
- Integrate with a database (e.g., SQLite, PostgreSQL)
- Build a web or GUI version (Swing, JavaFX, or web-based)

---

## Contact

Created by Bengü Yılmaz – for learning and personal productivity.  
Feel free to modify, improve, or build upon it!


