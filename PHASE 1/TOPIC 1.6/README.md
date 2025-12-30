## 🔹 Topic 1.6: Power & Exponentiation

---

### 📘 Theory
- **Naive power (`xⁿ`) is slow** because it multiplies `x` repeatedly → `O(n)` time.
- **Fast exponentiation** uses **Divide & Conquer**:
  > `xⁿ = x^(n/2) * x^(n/2)` (if n is even)
  > `xⁿ = x * x^(n/2) * x^(n/2)` (if n is odd)
- This reduces time from **`O(n) → O(log n)`**.
- Recursion depth also becomes **`log n`**.

---

### 🧩 Practice (Implement Yourself)
Try writing these small programs:
1. **Power using loop** (iterative)
2. **Power using recursion** (fast exponentiation)

---

### 🏁 LeetCode Problems
| Problem | Concept Used |
|--------|-------------|
| **Pow(x, n)** | Fast exponentiation (`O(log n)`) |
| **Sqrt(x)** | Binary search on range + mid² comparison (`O(log x)`) |

---

### ⏱️ Complexity Analysis
- **Time Complexity:** `O(log n)` → problem size halves each step.
- **Space Complexity:**
  - `O(1)` → iterative fast power (only variables used)
  - `O(log n)` → recursive fast power (due to recursion call stack)

---

### 💡 Interview Tip (Verbal Explanation)
Always explain like this:
> *“I use fast exponentiation which halves n every step, so time is O(log n). Iterative version uses O(1) space, recursive version takes O(log n) stack space.”*

---

### ✍️ Author
**Avadh Kalathiya**  
3rd Year CSE | DSA + Java | Placement Prep Notes
