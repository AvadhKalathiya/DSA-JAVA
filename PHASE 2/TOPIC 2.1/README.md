## 🔹 Topic 2.1: Array Basics & Traversal

---

### 📘 Theory
- Arrays store elements in **contiguous memory locations**.
- **Index-based access = `O(1)`** because the address is calculated directly.
- **In-place operations** modify the original array and **save extra space**.
- **Traversal** means visiting each element **once from start → end**.

---

### 🧩 Practice First (Before LeetCode)
Implement these small programs to build confidence:

1. **Find Maximum & Minimum**
   - Traverse array once, track values using variables → `O(n)` time, `O(1)` space

2. **Reverse Array (In-Place)**
   - Use `left` and `right` pointer swap until crossed → `O(n)` time, `O(1)` space

3. **Rotate Array by `k` Steps**
   - **With extra space:** store result in new array → `O(n)` time, `O(n)` space
   - **In-place:** reverse parts or cycle replacement → `O(n)` time, `O(1)` space

4. **Insert/Delete at Given Index**
   - Shift elements manually → `O(n)` time, `O(1)` space

---

### 🏁 LeetCode Problems (Solve After Practice)
| Problem | Concept Applied |
|--------|----------------|
| **Merge Sorted Array** | Two pointers on sorted arrays |
| **Remove Element** | In-place overwrite + traversal |
| **Rotate Array** | In-place reversal or cyclic rotation |

---

### ⏱️ Complexity Analysis
- **Time Complexity:** `O(n)` → because we traverse or shift at most `n` elements
- **Space Complexity:** `O(1)` auxiliary space → in-place operations only use variables

---

### 💡 Interview Tip
Always explain your approach like:
> *“I traverse the array once, update variables in-place, so time is O(n) and extra space is O(1).”*

---

### ✍️ Author
**Avadh Kalathiya**  
3rd Year CSE | DSA + Java | Placement Mindset Notes
