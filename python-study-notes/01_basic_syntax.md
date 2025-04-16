# 01. 기본 문법 (기초 + 고급)

## 변수 선언과 타입 동적 결정

```python
x = 10        # int
y = 3.14      # float
name = "Tom"  # str
```

## 심화 개념: 동적 타이핑과 Duck Typing

Python은 변수 타입을 실행 시간에 결정합니다 (동적 타이핑).
Duck Typing: "If it walks like a duck and quacks like a duck, it's a duck."

---

## 실습 문제

**문제 1**: 두 수를 입력받아 합을 출력하세요.

```python
a = int(input("첫 번째 수: "))
b = int(input("두 번째 수: "))
print("합:", a + b)
```

**문제 2**: 문자열을 입력받아 모든 단어를 대문자로 출력하세요.

```python
s = input("문장을 입력하세요: ")
words = s.upper()
print(words)
```
