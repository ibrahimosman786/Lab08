# 🧪 CMPUT 301 Lab 8: Test-Driven Development & Continuous Integration

**Student:** Ibrahim  
**CCID:** ibrahi10  
**Course:** CMPUT 301 Introduction to Software Engineering  
**University of Alberta** | Winter 2026

---

## 📌 Overview

This project demonstrates **Test-Driven Development (TDD)** combined with **Continuous Integration (CI)** using **GitHub Actions**. Three features were implemented following the strict RED → GREEN TDD cycle, where each failing test was committed and pushed *before* writing the implementation.

---

## 🔁 TDD Workflow

Each feature followed this cycle:

```
1. Write a failing test        →  commit & push  →  ❌ CI fails (RED)
2. Implement the feature       →  commit & push  →  ✅ CI passes (GREEN)
```

---

## 🛠️ Features Implemented

### `hasCity(City city)`
Checks whether a given city exists in the list.

| Phase | Commit Message | CI Status |
|-------|---------------|-----------|
| RED   | `RED: Add hasCity test (should fail)` | ❌ Fail |
| GREEN | `GREEN: Implement hasCity (tests pass)` | ✅ Pass |

### `deleteCity(City city)`
Removes a city from the list if it exists.

| Phase | Commit Message | CI Status |
|-------|---------------|-----------|
| RED   | `RED: Add deleteCity test (should fail)` | ❌ Fail |
| GREEN | `GREEN: Implement deleteCity (tests pass)` | ✅ Pass |

### `countCities()`
Returns the total number of cities currently in the list.

| Phase | Commit Message | CI Status |
|-------|---------------|-----------|
| RED   | `RED: Add countCities test (should fail)` | ❌ Fail |
| GREEN | `GREEN: Implement countCities (tests pass)` | ✅ Pass |

---

## 📂 Project Structure

```
Lab08/
├── .github/workflows/        # CI workflow (GitHub Actions)
├── app/src/main/java/com/example/lab08/
│   ├── City.java              # City model with equals/hashCode
│   └── CustomList.java        # List class with TDD implemented methods
├── app/src/test/java/com/example/lab08/
│   └── CustomListTest.java    # Unit tests (JUnit 5)
└── README.md
```

---

## ✅ CI Pipeline

This project uses **GitHub Actions** to automatically build and test the project on every push. The workflow file is located at `.github/workflows/ci.yml`.

| # | Commit | Status |
|---|--------|--------|
| 1 | Trigger CI | ✅ |
| 2 | RED: Add hasCity test | ❌ |
| 3 | GREEN: Implement hasCity | ✅ |
| 4 | RED: Add deleteCity test | ❌ |
| 5 | GREEN: Implement deleteCity | ✅ |
| 6 | RED: Add countCities test | ❌ |
| 7 | GREEN: Implement countCities | ✅ |

---

## 🧰 Tech Stack

**Language:** Java  
**Testing:** JUnit 5 (Jupiter)  
**Build:** Gradle (Kotlin DSL)  
**CI:** GitHub Actions  
**IDE:** Android Studio

---

## 💡 Key Takeaways

**TDD enforces discipline** by ensuring every feature is testable and requirements driven.  
**CI provides instant feedback** so broken builds are caught immediately, keeping the main branch stable.  
**RED → GREEN → REFACTOR** is the core TDD loop that drives clean, reliable code.

---

> *"Code without tests is broken by design."*
