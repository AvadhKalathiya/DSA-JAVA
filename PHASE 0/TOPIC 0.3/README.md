## 🔹 Topic 0.3: Best, Average, Worst Case

---

### 📘 Theory
- **Best Case:** Minimum work an algorithm performs.
- **Average Case:** Expected work on typical input.
- **Worst Case:** Maximum work on the most unfavorable input (**most important**).

---

### 🧠 Interview Reality
- **FAANG interviews focus on worst case** to test scalability and reliability.
- Reason: Real systems must **survive bad or unexpected inputs** without failing.

---

### 🧩 Practice Analysis

#### 🔍 Linear Search
- Best case → First element match → **`O(1)`**
- Worst case → Last element or not found → **`O(n)`**

#### 🔎 Binary Search
- Worst case → Search space halves each step → **`O(log n)`**

---

### ⚡ Quick Summary
| Case | Interview Importance |
|------|-------------------|
| Best | Rarely asked |
| Average | Sometimes discussed |
| Worst | Almost always asked |

✔️ **Golden Interview Line:**  
> *We design for worst case because real systems must handle bad input safely.*

---

### ✍️ Author
**Avadh Kalathiya**  
3rd Year CSE | DSA + Java | Placement Prep Notes
