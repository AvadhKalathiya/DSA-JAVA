## 🔹 Topic 1.2: Number Conversion & Carry Logic

---

### 📘 Theory
- **Carry** is passed to the next digit when sum ≥ 10.
- We process numbers **digit by digit (right → left)** for manual addition logic.
- Be aware of **integer overflow** when values exceed data type limits.
- Keep results predictable by simulating math manually instead of relying on full number conversion.

---

### 🧩 Practice (Implement Yourself)
Try building these small logic programs:
1. **Add 1 to a number stored as a digit array** (handle carry propagation)
2. **Simulate manual addition of two numbers using carry logic**
3. Observe how carry affects result length

---

### 🏆 LeetCode Problem
| Problem | Concept Used |
|---------|-------------|
| **Plus One** | Carry simulation + array modification |

---

### ⏱️ Complexity Analysis
- **Time Complexity:** `O(n)` → we traverse the digit array once
- **Space Complexity:**
  - `O(1)` → if modifying the same array (in-place)
  - `O(n)` → if creating a new array after overflow or resizing

---

### 💡 Interview One-Liner
> *“We use carry logic digit-wise to avoid overflow issues and ensure correctness. The operation runs in O(n) time, and space depends on whether we allocate a new array.”*

---

### ✍️ Author
**Avadh Kalathiya**  
3rd Year CSE | DSA + Java | Placement Prep Notes
