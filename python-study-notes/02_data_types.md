# 02. 데이터 타입과 컬렉션 (심화)

## 리스트 컴프리헨션

```python
squares = [x**2 for x in range(10) if x % 2 == 0]
print(squares)
```

## 딕셔너리 조작

```python
student = {"name": "Jin", "age": 21}
student["major"] = "CS"
```

---

## 실습 문제

**문제**: 리스트에서 짝수만 필터링하고 제곱한 결과를 출력하세요.

```python
nums = [1, 2, 3, 4, 5, 6]
result = [x**2 for x in nums if x % 2 == 0]
print(result)  # [4, 16, 36]
```
