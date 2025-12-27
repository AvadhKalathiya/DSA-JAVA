## 🔹 Topic 0.8: Time vs Space Trade-off

---

### 📘 Theory
- **Using more memory can reduce time**, making execution faster.
- **Saving memory may increase time**, making execution slower.
- Engineering goal: **Balance time and space based on constraints**.

---

### 🧩 Examples
| Technique | Faster or Less Time? | Extra Space Used |
|----------|--------------------|----------------|
| **Hashing (e.g., HashMap/Set)** | ⚡ Faster (`O(1)` lookup avoids nested loops) | 📦 More Space |
| **Sorting (e.g., Arrays.sort)** | 🐢 Slower than hashing when searching (`O(n)` or `O(log n)` after sort) | 🧊 Less Space |
| **Prefix Sum Array** | ⚡ Faster than repeated loops (`O(1)` range sum query) | 📦 Uses extra array → `O(n)` space |
| **Repeated Loops** | 🐢 Slower (`O(n)` every query) | 🧊 No extra structure |

---

### 🏗️ Mindset for Interviews
- Ask yourself:  
  **“Can I store something to avoid recomputing?”**
- If yes → consider **extra space to reduce time**.
- If constraints allow memory → **use hashing or prefix tables**.

✔️ **Golden Interview Line:**  
> *We trade space for time to avoid recomputation and improve scalability.*

---

### ✍️ Author
**Avadh Kalathiya**  
3rd Year CSE | DSA + Java | Placement Prep Notes
