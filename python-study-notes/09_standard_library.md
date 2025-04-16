# 09. 표준 라이브러리 (심화)

## `collections` 모듈

```python
from collections import Counter
text = "hello world"
print(Counter(text))
```

## `itertools` 예제

```python
from itertools import permutations
for p in permutations([1, 2, 3]):
    print(p)
```

---

## 실습 문제

**문제**: 문자열에서 가장 많이 등장한 문자 출력

```python
from collections import Counter
s = "hellohello"
counter = Counter(s)
print(counter.most_common(1))
```
