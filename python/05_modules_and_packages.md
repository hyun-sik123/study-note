# 05. 모듈과 패키지

## 모듈

모듈은 `.py` 파일 하나이며, `import` 키워드를 사용합니다.

```python
import math
print(math.sqrt(16))
```

## 사용자 정의 모듈 예시

```python
# mymath.py
def add(a, b):
    return a + b
```

```python
# main.py
import mymath
print(mymath.add(2, 3))
```
