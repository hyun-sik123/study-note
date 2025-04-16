# 07. 예외 처리 (심화)

## 여러 예외 처리

```python
try:
    x = int("not number")
except ValueError:
    print("숫자가 아닙니다.")
except Exception as e:
    print("기타 예외:", e)
```

## 사용자 정의 예외

```python
class CustomError(Exception):
    pass

def check_value(x):
    if x < 0:
        raise CustomError("음수는 허용되지 않습니다.")
```
