## 🔹 Topic 0.6: Space Complexity

---

### 📘 Theory
Space complexity measures how **memory usage grows with input size `n`**.

It includes:
1. **Input Space** → memory taken by the input itself (given by problem)
2. **Auxiliary Space** → extra memory used by the algorithm (excluding input)
3. **Recursion Stack Space** → memory used by function call stack during recursion

---

### ⚠️ Important Distinction
- **In-place algorithms** use no extra data structure → **`O(1)` auxiliary space**
- **Recursive algorithms** consume stack memory → space depends on recursion depth
- Iterative solutions **do not use recursion stack**, so often use less space

---

### 🧩 Practice Comparison

#### 🔢 Factorial Space Analysis
| Approach | Extra Space Used | Reason |
|----------|----------------|--------|
| Iterative | `O(1)` | Uses only variables, no stack growth |
| Recursive | `O(n)` | Recursion depth = `n` calls → stack stores each call |

---

### 🧪 Practice Tasks
Try implementing and analyzing space for:
- **Iterative factorial**
- **Recursive factorial**
- Compare:
  - Variable memory usage
  - Stack memory growth
  - Dominating space term

---

### 🧠 Interview Tip
If recursion is used, always mention:
> *“Space complexity is O(n) due to recursion stack of depth n.”*

If algorithm is in-place, say:
> *“This solution uses O(1) auxiliary space since it is in-place.”*

---

### ✍️ Author
**Avadh Kalathiya**  
3rd Year CSE | DSA + Java | Placement Mindset Notes
