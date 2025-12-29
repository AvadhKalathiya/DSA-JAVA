## 🔹 Topic 1.5: Sieve of Eratosthenes

---

### 📘 Theory
- An efficient algorithm to find **all prime numbers ≤ `n`**.
- Works by **marking multiples of each prime as non-prime**.
- Best used when constraints are **large (e.g., n up to 10⁶ or more)**.

---

### 🧠 How It Works (Intuition)
1. Create a boolean array `isPrime[0…n]`, assume all are `true`.
2. Set `0` and `1` as `false` (not prime).
3. For each `i` from `2 → √n`:
   - If `isPrime[i] == true`, mark all multiples `i × 2, i × 3, … ≤ n` as `false`.

---

### 🧩 Practice (Implement Yourself)
- Write the **Sieve algorithm** in your preferred language (Java/Python/C++).
- Count primes by iterating over `isPrime[]`.

---

### 🏁 LeetCode Problem
| Problem | Use Case |
|--------|----------|
| **Count Primes** | Direct application of Sieve |

---

### ⏱️ Complexity Analysis
- **Time Complexity:** `O(n log log n)` → very fast for large `n`
- **Space Complexity:** `O(n)` → uses a boolean array of size `n+1`

✔️ This is significantly better than checking each number individually (`O(n√n)` ❌).

---

### 💡 Interview Golden Lines
> *“Sieve lets us precompute primes by eliminating multiples. The time is O(n log log n) and space is O(n), making it ideal for large constraints.”*

---

### ✍️ Author
**Avadh Kalathiya**  
3rd Year CSE | DSA + Java | Placement Prep Notes
