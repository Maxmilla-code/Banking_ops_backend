# Real-Time Banking REST API

A backend banking system I built to demonstrate my ability to design and develop a real-world, production-style web service — the kind of system that powers features like account management, deposits, and withdrawals behind the scenes of a banking app.

---

## 🧭 What This Project Is

This project simulates the core backend of a digital banking platform. It doesn't have a visual interface (no app screens or buttons) — instead, it's the **engine room**: the part of the system that other applications (like a mobile banking app or a customer web portal) would talk to in order to actually move money, check balances, or manage accounts.

Think of it like the difference between a car's dashboard and its engine. This project is the engine.

---

## 💡 What It Can Do

| Feature | What It Means |
|---|---|
| **Create an Account** | Register a new customer account with a name and starting balance |
| **View an Account** | Look up a specific customer's account details |
| **View All Accounts** | See a list of every account in the system |
| **Deposit Money** | Add funds to an existing account |
| **Withdraw Money** | Remove funds from an account, with built-in checks to prevent overdrawing |
| **Delete an Account** | Remove an account from the system |
| **Friendly Error Handling** | If something goes wrong (e.g. looking up an account that doesn't exist), the system responds with a clear, helpful message instead of a confusing technical error |

---

## 🛠️ How It Was Built

I built this project from the ground up using industry-standard tools that real financial and tech companies use to build backend systems:

- **Java** — the core programming language
- **Spring Boot** — a widely-used framework for building professional, scalable web services
- **MySQL** — a database to permanently store account and balance information
- **Postman** — a tool I used to test every feature manually and confirm it worked exactly as expected

---

## 🧩 How I Approached the Build

1. **Planned the structure** — mapped out what a banking system needs at a minimum: accounts, balances, and the ability to move money in and out safely
2. **Set up the database** — created a real database and connected it to the application so data isn't lost when the app restarts
3. **Built each feature one at a time** — starting with creating an account, then reading data back, then handling deposits and withdrawals, and finally deleting accounts
4. **Tested everything manually** — after building each feature, I used Postman to simulate real requests (like a mobile app would send) and verified the data was correctly saved, updated, and returned
5. **Added proper error handling** — instead of letting the system crash or return confusing errors, I built a dedicated system to catch problems (like withdrawing more money than is available) and return clear, professional error messages
6. **Refined the code** — revisited my early work and improved it using more modern coding practices as I learned them, rather than leaving it as first-draft code



