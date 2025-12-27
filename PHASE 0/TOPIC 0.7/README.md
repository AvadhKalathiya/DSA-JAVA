## 🔹 Topic 0.7: Amortized Analysis

---

### 📘 Theory
- Some operations are **occasionally expensive**, but not always.
- We measure the **average cost over many operations**, not a single worst spike.
- Key idea: **Total cost ÷ number of operations**.

---

### 🏛️ Classic Example — Dynamic Array Resizing
- When an array is full, it **doubles its size** (costly `O(n)` copy).
- But `push()` normally takes `O(1)` time.
- Since resizing **does not happen every time**, the average cost of `push()` stays **`O(1)` → amortized**.

✔️ **One-liner:**  
> `push()` is amortized `O(1)` because resizing is rare, and most inserts are constant time.

---

### 🧠 Why Resize Doesn't Happen Every Time?
- Resizing only triggers when capacity is reached.
- Example:
  - Capacity = 4 → resize at 5th insert
  - Capacity = 8 → resize at 9th insert
  - Capacity = 16 → resize at 17th insert
- So, **many `O(1)` pushes happen between two resizes** → average remains low.

---

### 🧩 Practice (Interview Explanation)
Use this verbally or in notes:
> *“Array resizing happens only when full, not on every push. Since most operations take O(1) and resizing cost spreads over many future pushes, the amortized complexity is O(1).”*

---

### 🧪 Practice Task
- Try explaining with different capacities: 4, 8, 16, 32…
- Show that **between resizes, pushes keep running in O(1)**.

---

### ✍️ Author
**Avadh Kalathiya**  
3rd Year CSE | DSA + Java | Placement Prep Notes
