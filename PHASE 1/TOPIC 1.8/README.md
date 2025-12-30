## 🔹 Topic 1.8: Maths on Geometry / Edge Cases

---

### 📘 Theory
- **Slope formula:**
  > `slope = (y2 - y1) / (x2 - x1)`
- **Vertical line edge case:**
  - When `x2 == x1`, slope becomes **undefined** (division by zero).
  - These are **vertical lines** and must be handled separately in logic.
- **Precision issues:**
  - Floating point slopes can cause rounding errors.
  - Safer alternative in comparisons:
    > Compare using multiplication: `(y2 - y1) * (x3 - x1) == (y3 - y1) * (x2 - x1)`

---

### 🏁 LeetCode Problem
| Problem | Concept Used |
|--------|-------------|
| **Max Points on a Line** | Slope handling + hashing + `O(n²)` pair checking |

---

### ⏱️ Complexity Analysis
- **Time Complexity:** `O(n²)` → because we compare **all pairs of points**
- **Space Complexity:** `O(n)` → storing slopes or frequency using HashMap per anchor point

---

### 💡 Interview Golden Lines
- *“Slope is undefined for vertical lines, so I handle `x2 == x1` separately.”*
- *“I avoid precision errors by comparing using cross multiplication instead of division.”*
- *“Since all point pairs are checked, time is `O(n²)` and space is `O(n)` for slope storage.”*

---

### ✍️ Author
**Avadh Kalathiya**  
3rd Year CSE | DSA + Java | Placement Prep Notes
