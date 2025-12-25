## 0.2 Asymptotic Notations

### 📘 Theory
- **Big-O (O)** → Upper bound, represents **worst-case growth**
- **Big-Ω (Ω)** → Lower bound, represents **best-case growth**
- **Big-Θ (Θ)** → Tight bound, represents **exact growth range**

---

### 🎯 Why Big-O is Used in Interviews
- Provides a **guaranteed performance limit**
- Ensures your solution survives **worst-case inputs**
- Helps interviewers judge **scalability & optimization mindset**

---

### 🧩 Practice (Analyze These Yourself)
| Algorithm | Best Case | Worst Case | Interview Notation |
|----------|-----------|------------|------------------|
| Linear Search | `Ω(1)` (first element is target) | `O(n)` (target at end or not found) | `O(n)` |
| Binary Search | `Ω(1)` (middle element is target) | `O(log n)` (search space halves each step) | `O(log n)` |

---

### ✅ Thinking Check (Interview Answers)
| Question | Answer |
|---------|--------|
| Can one algorithm have different best & worst cases? | **Yes** — e.g., Linear Search is `Ω(1)` but `O(n)` |
| Does Binary Search always take `log n`? | **Yes** for worst case, because it divides input every step |

---

### 🏗️ Engineering Mindset from This Topic
- Worst case matters more than average for **real systems**
- Big-O protects your code from breaking at scale
- A constant factor (`2n`, `3n`) is ignored → only growth matters

---

**Placement Reality:**  
Understanding notations correctly = **selection-grade thinking**
