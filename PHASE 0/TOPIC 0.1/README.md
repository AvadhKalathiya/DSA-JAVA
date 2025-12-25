## 0.1 What is Time Complexity?

### 📘 Theory (Understand First)
- **Time Complexity** measures how an algorithm’s running time **grows with input size (n)** — based on **number of operations**, not real seconds.
- We **ignore**:
  - Machine speed ⚙️
  - Programming language 🧩
  - Compiler or hardware differences  
  (Because complexity must be universal & comparable)
- Interviews care because it shows **scalability** — can your code handle 10 inputs or 10 million?

---

### 🧠 Core Concepts
| Concept | Meaning |
|--------|---------|
| `n` | Input size |
| Count loops, not statements | `for(...)` matters more than `a = 5;` |
| Nested loops multiply | `n * n = O(n²)` |
| Sequential loops add | `n + n = O(n)` |
| Dominating term wins | Largest growth decides final answer |
| Recursion uses stack space | Affects space, not always time |

---

### 🧩 Practice (Write Code Yourself)
Try solving these without help:
1. Run a **single loop** and count operations → should lead to `O(n)`
2. Run **two nested loops** and count operations → should lead to `O(n²)`
3. Combine **loop + recursion**, then find the **dominating term**

---

### ✅ Thinking Check (Interview Answers)
| Question | Answer |
|----------|--------|
| Why `for(i=0; i<n; i++)` is `O(n)`? | Loop runs `n` times → `n` operations |
| Why 2 separate loops is still `O(n)`? | They run `n + n = 2n`, constant ignored → `O(n)` |
| Why nested loop becomes `O(n²)`? | Inner loop runs `n` times for each outer iteration → `n × n` |

---

### 🏗️ Engineering Mindset
- Always think: **How input grows → how operations grow**
- Prefer solutions that avoid nested loops when possible
- Identify dominating term instead of counting every small statement

---

**Placement Reality:**  
A weak foundation here leads to rejection ❌  
A strong grasp leads to optimized thinking → selection ✅

---

### ✍️ Author
**Avadh Kalathiya**  
3rd Year CSE | Placement-Focused DSA + Java Notes
