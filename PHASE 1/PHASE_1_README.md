# 🧠 DSA Placement Roadmap — GitHub Notes
**Author:** Avadh Kalathiya (3rd Year CSE)  
**Goal:** Master DSA + Java with interview-grade problem solving & complexity awareness.

---

# 🔢 PHASE 1: Basic Maths (For Coding Interviews)

### 🎯 Why this phase matters
- Maths logic is reused in **arrays, hashing, DP, bit manipulation, binary search, and bit tricks**.
- Most candidates fail **easy questions**, not hard ones — reason is **weak maths foundation**.
- This phase builds **number-handling confidence** required for scalable solutions.

---

## 🔒 Rules Followed in Phase 1
- ⛔ Do **NOT** skip subtopics
- ✍️ Code **small logic programs first**, then solve LeetCode
- 📊 Always include **Time & Space complexity**
- 🧠 Learn logic → practice → optimize → LeetCode (no jumping)

---

## 📚 Topics & Subtopics Covered

### 1️⃣ Topic 1.1: Digit Operations & Number Basics
- Modulo `%` extracts last digit
- Division `/` removes last digit
- Loop until number becomes `0`
- Handle negative numbers
- Practice:
  - Count digits → `O(d)` time, `O(1)` space
  - Reverse number → `O(d)` time, `O(1)` space
  - Palindrome check → `O(d)` time, `O(1)` space

---

### 2️⃣ Topic 1.2: Number Conversion & Carry Logic
- Simulate manual addition digit-wise
- Track carry explicitly
- Overflow awareness
- Practice:
  - Add 1 to digit array → `O(n)` time, `O(1)` aux space
  - Manual sum simulation → `O(max(d1,d2))` time, `O(1)` space

---

### 3️⃣ Topic 1.3: GCD & LCM (Euclid’s Algorithm)
- GCD using:
  > `gcd(a, b) = gcd(b, a % b)`
- LCM using:
  > `lcm(a, b) = (a / gcd(a,b)) * b`
- Complexity:
  - GCD → `O(log min(a,b))` time, `O(1)` space

---

### 4️⃣ Topic 1.4: Prime Numbers & Divisibility
- A prime has **exactly 2 divisors**: 1 and itself.
- Divisibility tricks:
  - Even numbers `%2 == 0`
  - Last digit check for `%5, %10`
  - Digit sum for `%3, %9`
- Check prime by loop → `O(√n)` time, `O(1)` space

---

### 5️⃣ Topic 1.5: Sieve of Eratosthenes
- Finds primes up to `n` efficiently.
- Eliminates multiples.
- Complexity:
  - `O(n log log n)` time
  - `O(n)` space (boolean array)

---

### 6️⃣ Topic 1.6: Power & Exponentiation
- Fast exponentiation:
  > `aⁿ → a^(n/2) * a^(n/2)`
- Complexity:
  - `O(log n)` time, `O(1)` space
- Practice:
  - Iterative power loop → `O(n)`
  - Fast power → `O(log n)`

---

### 7️⃣ Topic 1.7: Modular Arithmetic
- `(a + b) % m = ((a % m) + (b % m)) % m`
- `(a * b) % m = ((a % m) * (b % m)) % m`
- Used to avoid overflow and handle large values.
- Complexity: `O(1)` time, `O(1)` space

---

### 8️⃣ Topic 1.8: Maths on Geometry / Edge Cases
- Distance formulas, overlap cases, bounds, integer precision issues.
- Practice:
  - Rectangle overlap
  - Point inside shape
  - Boundary condition checks
- Mindset: **Validate first, compute later**

---

## 🧩 Phase 1 LeetCode Targets (Do After Small Programs)
- 7. Reverse Integer
- 9. Palindrome Number
- 125. Valid Palindrome
- 150. Evaluate Expression (later phase but uses maths)
- 1. Two Sum (math + hashing)

---

## 🏗️ Folder Structure Suggestion
