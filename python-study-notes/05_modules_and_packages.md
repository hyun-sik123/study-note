# 05. 모듈과 패키지 (심화)

## 표준 모듈 사용

```python
import random
print(random.choice(['A', 'B', 'C']))
```

## 사용자 정의 패키지 구조

```
mypackage/
├── __init__.py
├── math_utils.py
└── string_utils.py
```

---

## 실습 문제

**문제**: `math_utils.py` 모듈을 만들고, `add`, `multiply` 함수를 정의하세요.

```python
# math_utils.py
def add(a, b):
    return a + b

def multiply(a, b):
    return a * b
```
