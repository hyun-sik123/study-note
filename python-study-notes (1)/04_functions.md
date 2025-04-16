# 04. 함수

함수는 코드의 재사용성을 높여주는 중요한 도구입니다.

```python
def greet(name):
    return f"안녕하세요, {name}님!"

print(greet("지민"))
```

기본값 인자와 키워드 인자:

```python
def power(base, exponent=2):
    return base ** exponent

print(power(3))       # 9
print(power(3, 3))    # 27
```
