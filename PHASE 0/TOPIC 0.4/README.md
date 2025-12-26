## 🔹 Topic 0.4: Common Time Complexities

---

### 📘 Learn These by Heart
| Complexity | Meaning | Key Idea |
|------------|---------|----------|
| `O(1)` | Constant Time | No loop / direct access |
| `O(log n)` | Logarithmic | Divide & Conquer |
| `O(n)` | Linear Time | Single loop |
| `O(n log n)` | Linearithmic | Efficient sorting |
| `O(n²)` | Quadratic | Nested loops |

---

### 🧩 Practice (Identify These)
Analyze complexities for:
- **Bubble Sort** → `O(n²)` (nested loops)
- **Merge Sort** → `Θ(n log n)` (divide + merge)
- **Binary Search** → `O(log n)` (halves input every step)

---

### 🧪 Complexity Results
| Algorithm | Best | Worst | Tight Bound |
|-----------|------|------|-------------|
| Bubble Sort | `Ω(n)` (already sorted) | `O(n²)` | `Θ(n²)` |
| Merge Sort | `Ω(n log n)` | `O(n log n)` | `Θ(n log n)` |
| Binary Search | `Ω(1)` | `O(log n)` | `Θ(log n)` |

---

### 🧠 Thinking Check
❓ *Why does `O(log n)` grow slower than `O(n)`?*  
✅ Because `log n` increases **only when n multiplies**, while `n` increases **every step**.

Example:
- If `n = 8` → `log₂(8) = 3`
- If `n = 1,000,000` → `log₂(n) ≈ 20` (still small!)
- But `O(n)` → 1,000,000 operations ❗

✔️ **Golden Interview Line:**  
> *O(log n) is slower-growing because it reduces the problem size at every step, unlike O(n) which scales with every element.*

---

### ✍️ Author
**Avadh Kalathiya**  
3rd Year CSE | DSA + Java | Placement Mindset Notes
