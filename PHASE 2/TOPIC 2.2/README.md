## 🔹 Topic 2.2: Modify Sorted Arrays (In-Place Thinking)

---

### 📘 Theory
- Sorted arrays unlock the **Two-Pointer technique** for optimized traversal.
- Use **one pointer to read** (`i`) and **one pointer to write** (`j`) — updating the same array.
- We avoid extra arrays to maintain **`O(1)` auxiliary space** (In-Place Thinking).

---

### 🧠 Core Rules
- **Do not create a new array unless required** by constraints.
- **Overwrite instead of storing** when possible.
- **Maintain count or uniqueness** while traversing the sorted sequence.

---

### 🧩 Practice (Do This Before LeetCode)
Implement these small logic programs:
1. **Remove duplicates** → keep only unique elements.
2. **Allow at most 2 occurrences** of each number.
3. **Maintain count** while scanning and overwrite in-place.

---

### 🏁 LeetCode Problems
| Problem | Concept Applied |
|--------|----------------|
| **Remove Duplicates from Sorted Array** | Unique filter + in-place overwrite |
| **Remove Duplicates from Sorted Array II** | Count tracking + max 2 occurrences |

---

### ⏱️ Complexity
- **Time Complexity:** `O(n)` → scans the array once.
- **Space Complexity:** `O(1)` → only variables used for pointers & counters.

---

### 🔥 Interview-Ready One-Liner
> *“I use two pointers to overwrite valid elements in the same sorted array while tracking count. This guarantees `O(n)` time and `O(1)` extra space.”*

---

### ✍️ Author
**Avadh Kalathiya**  
3rd Year CSE | DSA + Java | Placement-Focused Notes
