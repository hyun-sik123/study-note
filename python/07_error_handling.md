# 07. 예외 처리

오류가 발생했을 때 프로그램이 강제 종료되지 않도록 예외 처리를 합니다.

```python
try:
    result = 10 / 0
except ZeroDivisionError:
    print("0으로 나눌 수 없습니다.")
finally:
    print("예외 처리 완료")
```
