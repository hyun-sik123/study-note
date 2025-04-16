# 03. 제어문 (조건문 & 반복문 심화)

## 중첩 반복문

```python
for i in range(1, 6):
    for j in range(1, i + 1):
        print(j, end=" ")
    print()
```

## 리스트 언패킹과 반복

```python
pairs = [(1, 2), (3, 4), (5, 6)]
for x, y in pairs:
    print(x + y)
```

---

## 실습 문제

**문제**: 구구단 출력

```python
for i in range(2, 10):
    for j in range(1, 10):
        print(f"{i} x {j} = {i * j}")
```
