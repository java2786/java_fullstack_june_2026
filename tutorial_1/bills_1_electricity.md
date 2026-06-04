# Problem: Electricity Bill Generator

## Objective

Create a program that calculates the electricity bill based on the number of units consumed.

---

## Billing Rules

| Units Range | Rate Per Unit |
|------------|---------------|
| First 100 Units | Rs 1.5 per unit |
| Next 100 Units (101 - 200) | Rs 2.5 per unit |
| Above 200 Units | Rs 3.5 per unit |

---

## Example 1

### Input

```text
250 Units
```

### Calculation

```text
First 100 Units
= 100 × 1.5
= 150

Next 100 Units
= 100 × 2.5
= 250

Remaining 50 Units
= 50 × 3.5
= 175
```

### Total Bill

```text
150 + 250 + 175
= Rs 575
```

---

## Example 2

### Input

```text
140 Units
```

### Calculation

```text
First 100 Units
= 100 × 1.5
= 150

Remaining 40 Units
= 40 × 2.5
= 100
```

### Total Bill

```text
150 + 100
= Rs 250
```

---

## Example 3

### Input

```text
80 Units
```

### Calculation

```text
80 × 1.5
= 120
```

### Total Bill

```text
Rs 120
```

---

## Sample Input / Output

### Sample Input 1

```text
250
```

### Sample Output 1

```text
Electricity Bill = Rs 575
```

---

### Sample Input 2

```text
140
```

### Sample Output 2

```text
Electricity Bill = Rs 250
```

---

### Sample Input 3

```text
80
```

### Sample Output 3

```text
Electricity Bill = Rs 120
```

---

## Task

Write a program that:

1. Accepts electricity units consumed from the user.
2. Calculates the bill according to the slab rates.
3. Displays the final bill amount.


---

## Formula


### If Units ≤ 100

```text
Bill = Units × 1.5
```

### If Units > 100 and Units ≤ 200

```text
Bill = (100 × 1.5)
     + ((Units - 100) × 2.5)
```

### If Units > 200

```text
Bill = (100 × 1.5)
     + (100 × 2.5)
     + ((Units - 200) × 3.5)
```

---
