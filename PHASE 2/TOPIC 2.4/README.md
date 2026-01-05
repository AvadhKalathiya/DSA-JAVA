## 🔹 Topic 2.4: Prefix & Suffix Technique

---

### 📘 Theory
- **Prefix array** stores cumulative results from **left → right**.
- **Suffix array** stores cumulative results from **right → left**.
- Benefit: **Avoids recomputation**, improves scalability.
- Engineering rule: **Precompute once, reuse many times**.

---

### 🧩 Practice (Code First)
Implement these to build logic confidence:
1. **Build Prefix Product Array**
2. **Build Suffix Product Array**
3. **Combine prefix & suffix to compute result without division**
   - Final result at index `i` = `prefix[i-1] × suffix[i+1]`

---

### 🏁 LeetCode Problem
| Problem | Concept Applied |
|--------|----------------|
| **Product of Array Except Self** | Prefix × Suffix combination |

---

### ⏱️ Complexity Analysis
- **Time Complexity:** `O(n)` → single traversal to build prefix & suffix
- **Space Complexity:** `O(1)` auxiliary → no extra arrays used beyond output

> 🔹 Output array is **not counted** in space complexity.

---

### 💡 Interview Golden Lines
> *“I precomputed left prefix and right suffix once and reused them to build the final result without division. This guarantees O(n) time and O(1) extra memory.”*

> *“Prefix and suffix help eliminate repeated work and scale for large n safely.”*

---

### 🧠 Key Takeaways
- Store results **progressively**
- Process **both directions**
- Avoid brute-force recomputation
- No backtracking, just reuse

---

### ✍️ Author
**Avadh Kalathiya**  
3rd Year CSE | DSA + Java | Placement-Focused Notes
