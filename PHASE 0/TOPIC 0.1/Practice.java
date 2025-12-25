for(int i = 0; i < n; i++) {
    // work
}

// Runs n times
👉 O(n)

//
Practice 2️⃣: Two Nested Loops
for(int i = 0; i < n; i++) {
    for(int j = 0; j < n; j++) {
        // work
    }
}


Runs n × n times
👉 O(n²)

Practice 3️⃣: Loop + Recursion
void func(int n) {
    for(int i = 0; i < n; i++) {
        System.out.println(i);
    }
    func(n-1);
}


Operations:

n + (n-1) + (n-2) + ... + 1


Sum =

n(n+1)/2

//