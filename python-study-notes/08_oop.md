# 08. 객체지향 프로그래밍 (심화)

## 상속과 다형성

```python
class Animal:
    def speak(self):
        print("동물이 소리를 냅니다.")

class Dog(Animal):
    def speak(self):
        print("멍멍!")

a = Dog()
a.speak()
```

## 실습 문제

**문제**: `Shape` 클래스와 `Circle`, `Rectangle` 자식 클래스를 만들어보세요.

```python
import math

class Shape:
    def area(self):
        pass

class Circle(Shape):
    def __init__(self, r):
        self.r = r
    def area(self):
        return math.pi * self.r ** 2

class Rectangle(Shape):
    def __init__(self, w, h):
        self.w = w
        self.h = h
    def area(self):
        return self.w * self.h

c = Circle(5)
r = Rectangle(4, 5)
print(c.area())
print(r.area())
```
