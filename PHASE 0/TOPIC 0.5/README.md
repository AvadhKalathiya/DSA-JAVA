## 🔹 Topic 0.5: Why Binary Search is `O(log n)`

---

### 📘 Theory
- Each step **cuts the search space in half**.
- Reduction pattern:  
  `n → n/2 → n/4 → n/8 → ...` until 1 element remains.

---

### 🧮 Mathematical Intuition
- Number of steps needed ≈ **`log₂(n)`**
- This is why complexity becomes **`O(log n)`** (logarithmic growth).

---

### 🧩 Practice (Dry-Run)
| Input Size `n` | Steps (`log₂(n)`) | Explanation |
|---------------|------------------|-------------|
| `16` | `4` | `16 → 8 → 4 → 2 → 1` |
| `32` | `5` | `32 → 16 → 8 → 4 → 2 → 1` |

✔️ Even when `n` doubles, steps increase **only by +1** — that's the power of Binary Search.

---

### 🎯 Interview Tip
- When you use Binary Search, **always explain it verbally** like:
  > *“Binary Search is O(log n) because we divide the search space by 2 every step, so the number of steps is log₂(n).”*

---

### 💡 Why it's preferred?
- Fast for large input
- Safe in worst case
- Predictable steps

---

### ✍️ Author
**Avadh Kalathiya**  
3rd Year CSE | DSA + Java | Placement Prep Notes
