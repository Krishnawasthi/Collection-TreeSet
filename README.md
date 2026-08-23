# Collection-TreeSet

In Java, a TreeSet is primarily used when you need to store a collection of unique elements that must be kept in a sorted order.

Because it implements the NavigableSet interface, it doesn't just store data; it organizes it dynamically, making it highly efficient for fetching data based on ranges or closest matches.

Under the hood, a TreeSet is backed by a TreeMap, which utilizes a self-balancing binary search tree known as a Red-Black Tree.

Red-Black Tree Data Structure, AI generated
Red-Black Tree Data Structure. Source: GeeksforGeeks
When to Use TreeSet
You should reach for a TreeSet in the following scenarios:

Maintaining Natural Order: When you need elements sorted automatically as they are added (e.g., an alphabetical list of names, or a leaderboard of numerical scores).

Custom Sorting Logic: When you need to enforce a specific sorting rule using a custom Comparator (e.g., sorting a list of custom Employee objects by salary, then by name).

Range Queries: When you frequently need to extract a subset of data within a specific range using methods like subSet(), headSet(), or tailSet().

Proximity Searches: When you need to find the closest matching element. TreeSet excels here with methods like ceiling(e) (lowest element ≥ e) and floor(e) (greatest element ≤ e).

When NOT to Use TreeSet
If you don't care about sorting or range operations, you should avoid TreeSet.

Because it has to sort elements upon insertion, basic operations (add, remove, contains) take O(logn) time. If you just need to store unique items and check if they exist, a HashSet is much faster, offering O(1) constant time performance.

Choosing the Right Set
Here is how TreeSet stacks up against the other common Set implementations in the Collections framework:

Feature	TreeSet	HashSet	LinkedHashSet
Ordering	Sorted (Natural or Custom)	Unordered	Insertion order
Underlying Data Structure	Red-Black Tree	Hash Table	Hash Table + Linked List
Performance (Add/Remove)	O(logn)	O(1)	O(1)
Allows null?	No (throws NullPointerException)	Yes (one null allowed)	Yes (one null allowed)
Want to see how to implement a custom Comparator for a TreeSet?

Refining the Structure
# Java TreeSet Deep Dive 🌳

> A comprehensive guide to understanding `TreeSet` in Java, how it works under the hood, and when to use it in your software engineering projects.

## 📖 Table of Contents
- [Overview](#-overview)
- [How It Works (Under the Hood)](#-how-it-works-under-the-hood)
- [Time Complexity](#-time-complexity)
- [Code Example](#-code-example)
- [When to Use](#-when-to-use)

## 🔎 Overview
`TreeSet` is a part of the Java Collections Framework (`java.util.TreeSet`). It implements the `NavigableSet` interface and extends `AbstractSet`. Unlike a standard `HashSet`, a `TreeSet` guarantees that its elements will be sorted in ascending, natural order (or by a custom `Comparator` provided at set creation time).

## ⚙️ How It Works (Under the Hood)
1. **Backed by TreeMap:** Internally, a `TreeSet` is implemented using a `TreeMap`. When you add an element to a `TreeSet`, it is stored as a key in the underlying `TreeMap`, with a dummy object (usually a constant `PRESENT`) as the value.
2. **Red-Black Tree Data Structure:** The `TreeMap` relies on a self-balancing binary search tree known as a **Red-Black Tree**. 
3. **Self-Balancing Mechanism:** As elements are added or removed, the tree automatically rotates its nodes and re-colors them (red or black) to ensure the tree remains balanced. This balancing prevents the tree from becoming a linked list, ensuring efficient search times.
4. **Duplicate Prevention:** Before insertion, the tree compares the new element against existing nodes using the `compareTo()` method or the provided `Comparator`. If a match is found, the new element is ignored, maintaining the uniqueness property of the `Set`.

## ⏱️ Time Complexity
Because the tree must re-balance and traverse nodes sequentially during operations, `TreeSet` does not offer constant time performance.

| Operation | Time Complexity |
| :--- | :--- |
| **Add (`add`)** | O(log n) |
| **Remove (`remove`)** | O(log n) |
| **Search (`contains`)**| O(log n) |
| **Next/Previous** | O(log n) |

## 💻 Code Example

```java
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        // Creating a TreeSet of Integers
        Set<Integer> numbers = new TreeSet<>();

        // Adding elements (out of order)
        numbers.add(50);
        numbers.add(10);
        numbers.add(30);
        numbers.add(10); // Duplicate, will be ignored

        // Output will be automatically sorted: [10, 30, 50]
        System.out.println("TreeSet: " + numbers);
    }
}
```

## 🎯 When to Use
* **Leaderboards & Rankings:** Storing custom objects that need to be inherently sorted (e.g., scores).
* **Range Operations:** Finding elements greater than or less than a specific value using methods like `headSet()`, `tailSet()`, and `subSet()`.
* **Avoiding Nulls:** `TreeSet` does not allow `null` elements (it will throw a `NullPointerException`), which is useful when strict data integrity is required.
TREESET_README.md
Displaying TREESET_README.md.
