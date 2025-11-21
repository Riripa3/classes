/*
The simple loop takes O(n) EVERY time you ask a query.
➤ The prefix sum takes O(n) ONLY ONCE.

After that, every query is O(1) — instant.

This is the entire reason prefix sum exists.
 */
//𝐴[𝑖]=𝑝𝑟𝑒𝑓[𝑖]−𝑝𝑟𝑒𝑓[𝑖−1]