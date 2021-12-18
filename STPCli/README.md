## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).


## Demo STP CLI

### Login Screen

```
STP Payroll Management System:
L- Login
X- Exit
Command (L/X): L
Email: john.smith@uts.com
Password: super123
Employer Menu: 
C- Add Employee
R- View Employee
U- Update Employee
D- Delete Employee
V- View Employees
S- STP Menu
X- Logout
Session Admin: John Smith - Menu Commands (C/R/U/D/V/S/X): 
```

### View Employees
```
Session Admin: John Smith - Menu Commands (C/R/U/D/V/S/X): V
+----------------------+---------------------------+------------+------------+
| Employee Name        | Email                     |  Phone     | Type       |
+----------------------+---------------------------+------------+------------+
| Thomas Muller        | thomas.muller@uts.com     | 99991111   | Full-Time  |
| Alice Stefan         | alice.stefan@uts.com      | 88881111   | Part-Time  |
| Lucy Lu              | lucy.lu@uts.com           | 98981100   | Casual     |
| Andreas Brehme       | andreas.b@uts.com         | 90001222   | Full-Time  |
| Ruddy Voller         | ruddy.v@uts.com           | 98980000   | Full-Time  |
| Monica Shwarz        | monica.s@uts.com          | 92241188   | Casual     |
+----------------------+---------------------------+------------+------------+
Session Admin: John Smith - Menu Commands (C/R/U/D/V/S/X): 
```

### View STP Report
```
Session Admin: John Smith - Menu Commands (C/R/U/D/V/S/X): S
STP Menu: 
F- Find PAYG Report
V- View STP Report
A- Archive STP Report
R- Retrieve STP Report
S- Show STP Log
X- Close
Session Admin: John Smith - Menu Commands (F/V/A/R/S/X): V
STP Report
+-----------------+-------------+-------------+-------------+-------------+
| Employee Name   | Wages       | TAX         | Net         | Super       |
+-----------------+-------------+-------------+-------------+-------------+
| Thomas Muller   | 72800.00    | 23296.00    | 49504.00    | 6552.00     |
| Alice Stefan    | 30160.00    | 5730.40     | 24429.60    | 2714.40     |
| Lucy Lu         | 46800.00    | 14976.00    | 31824.00    | 4212.00     |
| Andreas Brehme  | 68640.00    | 21964.80    | 46675.20    | 6177.60     |
| Ruddy Voller    | 166400.00   | 61568.00    | 104832.00   | 14976.00    |
| Monica Shwarz   | 8320.00     | 0.00        | 8320.00     | 748.80      |
+-----------------+-------------+-------------+-------------+-------------+

+-----------------+-------------+
| Total Wages     |  393120.00  |
| Total Tax       |  127535.20  |
| Total Net       |  265584.80  |
| Total Super     |  35380.80   |
| Quarterly Bas   |  162916.00  |
+-----------------+-------------+
Session Admin: John Smith - Menu Commands (F/V/A/R/S/X):
```
For everyones who is interested in learning OOP-Java, not for copying, not for stealing, but for learning.

Hope you will enjoy it.

@hoangndst from UET-VNU.