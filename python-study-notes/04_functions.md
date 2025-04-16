# 04. 함수 (심화)

## 재귀 함수

```python
def factorial(n):
    if n <= 1:
        return 1
    return n * factorial(n - 1)
```

## lambda와 고차 함수

```python
nums = [1, 2, 3, 4, 5]
squared = list(map(lambda x: x**2, nums))
```

---

## 실습 문제

**문제**: 팩토리얼을 재귀 함수와 반복문으로 각각 구현하세요.

```python
# 재귀
def factorial_recursive(n):
    if n <= 1:
        return 1
    return n * factorial_recursive(n - 1)

# 반복
def factorial_iterative(n):
    result = 1
    for i in range(2, n+1):
        result *= i
    return result

print(factorial_recursive(5))
print(factorial_iterative(5))
```
