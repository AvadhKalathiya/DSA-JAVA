## 🔹 Topic 1.1: Digit Operations & Number Basics

---

### 📘 Theory (Learn First)
- Modulo operator `%` extracts the **last digit** of a number.
- Integer division `/` **removes the last digit**.
- Use a loop until the number becomes `0` to process all digits.
- Always handle **negative numbers carefully** (convert to positive if needed).

---

### 🧩 Practice (Implement Yourself)
Try coding these small programs:
- **Count digits** using `%` and `/`
- **Reverse a number**
- **Check if a number is palindrome**
- Keep extra space usage minimal (`O(1)` auxiliary space)

---

### 🏆 LeetCode Problems (Solve After Practice)
| Problem | Key Concept |
|--------|-------------|
| **Palindrome Number** | Reverse + Compare |
| **Reverse Integer** | Digit extraction + Overflow awareness |

---

### ⏱️ Complexity Analysis (Must Include)
- **Time Complexity:** `O(d)` where `d` = number of digits
- **Space Complexity:** `O(1)` auxiliary space (no extra data structure)

---

### 💡 Interview Tip
When using digit logic, always explain:
> *“I extract digits using % and reduce number using / until 0. The loop runs d times, so time is O(d) and space is O(1).”*

---


### ✍️ Author
**Avadh Kalathiya**  
3rd Year CSE | DSA + Java | Placement Prep Notes
