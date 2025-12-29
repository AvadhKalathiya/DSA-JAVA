## 🔹 Topic 1.4: Prime Numbers & Divisibility

---

### 📘 Theory
- A **prime number** has **exactly 2 divisors** → `1` and itself.
- To check primality, looping till **`√n` is enough**.
- **Why `√n` works?**
  - Divisors exist in **pairs**: if `a × b = n`, one is ≤ `√n` and the other ≥ `√n`.
  - So we only check the smaller half → up to `√n`.

---

### 🧩 Practice (Implement Yourself)
Try writing small programs for:
1. **Check if a number is prime** (loop till `√n`)
2. **Count primes less than `n`** (basic loop + prime check)

---

### 🏁 LeetCode (Indirect Use)
| Problem | Concept Link |
|--------|--------------|
| **Happy Number** | Uses cycle detection + digit math + divisibility mindset |

---

### ⏱️ Complexity Analysis
- **Time Complexity:** `O(√n)` → prime check loop runs till `√n`
- **Space Complexity:** `O(1)` → uses only variables

---

### 💡 Interview One-Liner
> *“A prime check only needs √n iterations due to divisor pairs, so the worst-case time is O(√n) and space is O(1).”*

---

### ✍️ Author
**Avadh Kalathiya**  
3rd Year CSE | DSA + Java | Placement Prep Notes
