## 🔹 Topic 1.3: GCD & LCM (Euclid’s Algorithm)

---

### 📘 Theory
- **GCD (Greatest Common Divisor):** Largest number that divides both `a` and `b`.
- **Euclid’s rule:**
  > `gcd(a, b) = gcd(b, a % b)`
- **LCM (Least Common Multiple):** Smallest number divisible by both `a` and `b`.
- **LCM formula using GCD:**
  > `lcm(a, b) = (a * b) / gcd(a, b)`

---

### 🎯 Why It’s Important
- Used in **fractions simplification, constraint solving, math optimization**.
- Helps in **DP and number modeling problems**.
- Key skill for **math-heavy interview questions**.

---

### 🧩 Practice (Implement Yourself)
Try writing these:
1. **GCD using recursion**
2. **GCD using loop (iterative)**
3. **Compute LCM using GCD**

---

### 🏁 LeetCode (Indirect Use)
| Problem | How it relates |
|---------|---------------|
| **Happy Number** | Uses digit math + loop detection mindset, not GCD directly |

---

### ⏱️ Complexity Analysis
- **Time Complexity:** `O(log min(a, b))` → modulo reduces size fast
- **Space Complexity:** `O(1)` auxiliary space (no extra data structure)

---

### 💡 Interview One-Liner
> *“I compute GCD using Euclid’s repeated modulo reduction. Since input shrinks logarithmically, time is O(log min(a,b)) and space is O(1).”*

---

### ✍️ Author
**Avadh Kalathiya**  
3rd Year CSE | DSA + Java | Placement Prep Notes
