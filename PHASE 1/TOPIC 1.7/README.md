## 🔹 Topic 1.7: Modular Arithmetic

---

### 📘 Theory
- **Modulo (`% m`) is used to avoid integer overflow** and keep numbers in a safe range.
- Core formulas:
  - `(a + b) % m = ((a % m) + (b % m)) % m`
  - `(a * b) % m = ((a % m) * (b % m)) % m`
- **Negative numbers in modulo:**
  - Result of `% m` can be negative in many languages.
  - To normalize:  
    > `(a % m + m) % m` ensures result is always positive.

---

### 🧩 Practice (Implement Yourself)
Try writing small logic programs for:
1. **Modular addition**
2. **Modular multiplication**
3. **Modular power (fast exponentiation + modulo)**

---

### 🏁 LeetCode (Indirect Use)
| Problem | Concept Link |
|--------|-------------|
| **Pow(x, n)** | Uses modular power when constraints are large |
| **Multiply Strings** | Uses digit math + modulo mindset, avoids overflow |
| **Multiply Strings (string multiplication)** | Manual carry + safe arithmetic approach |

---

### ⏱️ Complexity Analysis
- **Time Complexity:** `O(1)` for add/multiply mod operations, `O(log n)` if using modular power.
- **Space Complexity:** `O(1)` unless storing power results recursively (`O(log n)` stack).

---

### 💡 Interview One-Liners
- *“Modulo guarantees safe arithmetic and prevents overflow.”*
- *“We normalize negatives using `(a % m + m) % m`.”*
- *“Modular power runs in `O(log n)` using fast exponentiation.”*

---

### ✍️ Author
**Avadh Kalathiya**  
3rd Year CSE | DSA + Java | Placement Prep Notes
