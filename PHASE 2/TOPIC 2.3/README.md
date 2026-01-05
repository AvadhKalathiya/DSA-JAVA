## 🔹 Topic 2.3: Frequency & Majority Element

---

### 📘 Theory
- **Frequency counting** means tracking how many times each element appears.
- **Majority Element rule:** appears **more than `n/2` times** in the array.
- **Moore’s Voting Algorithm** helps find the majority candidate in **one pass** by:
  1. Keeping a `candidate` and `count`
  2. Increasing count when same, decreasing when different
  3. Resetting candidate when count reaches `0`

---

### 🧩 Practice (Code First, No LeetCode Jump)
Implement these small logic tasks yourself:
- Count frequency using **variables or counters** (without HashMap)
- Verify whether the found candidate truly appears **> n/2** times

---

### 🏁 LeetCode Problem
| Problem | Concept Applied |
|--------|----------------|
| **Majority Element** | Moore’s Voting + verification pass |

---

### ⏱️ Complexity Analysis
- **Time Complexity:** `O(n)` → scans the array once
- **Space Complexity:** `O(1)` → uses only a few variables (no extra data structure)

---

### 💡 Interview Golden Lines
> *“I used Moore’s Voting to get a majority candidate in 1-pass and verified it with a final scan. This ensures O(n) time and O(1) auxiliary space.”*

> *“Since majority appears > n/2, the algorithm guarantees a valid result after verification.”*

---

### 🧠 Key Takeaways
- One-pass thinking
- No extra memory
- Worst-case safe
- Easy to explain verbally
- Works even on large `n`

---

### ✍️ Author
**Avadh Kalathiya**  
3rd Year CSE | DSA + Java | Placement-Focused Notes
